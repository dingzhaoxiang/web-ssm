package com.dzx.ssm.utils.currentLimiting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class CurrentLimitingFilter implements Filter {
	
	ConcurrentHashMap<String,CurrentLimiting> map = new ConcurrentHashMap<String,CurrentLimiting>();
	Thread t = new Thread(new ScannForUselessIP(map));
	private final Logger logger= LoggerFactory.getLogger(CurrentLimitingFilter.class);
	MyMailHandler myMailHandler = new MyMailHandler(20);

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
		logger.info("do filter!");
		HttpServletRequest req =(HttpServletRequest) request;
		HttpServletResponse res =(HttpServletResponse) response;
		String ip = req.getRemoteAddr();
	    if(!map.containsKey(ip)){
	    	//一秒最多访问30次
	    	map.put(ip, new CurrentLimiting(System.currentTimeMillis(), 1000,10));
	    }
	    else{
	    	if(!map.get(ip).allow(System.currentTimeMillis())){	    		    		
	    		//req.getRequestDispatcher("accessTooFrequent.jsp").forward(request, response);	    		
	    		res.setHeader("Content-type", "text/html;charset=UTF-8"); 
				res.setCharacterEncoding("UTF-8");
				res.getWriter().println("访问过于频繁");
				myMailHandler.addIp(ip);
				return;
	    	}
	    }
	    chain.doFilter(request, response);	    				
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		t.start();
	}

}

//扫描过期的key(ip)
class ScannForUselessIP implements Runnable{
	
	ConcurrentHashMap<String,CurrentLimiting> map;
	
	public ScannForUselessIP(ConcurrentHashMap<String, CurrentLimiting> map) {
		this.map = map;
	}

	@Override
	public void run() {
		while(true){
			try {
				//每过1分钟
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			scan();
		}
	}
	public void scan(){
		System.out.println("扫描开始");
		
	    //扫描起始时间
		long currTime = System.currentTimeMillis();
		//key(ip)的最大存活时间--100秒
		long maxLife = 100000L;
		Iterator<Map.Entry<String, CurrentLimiting>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,CurrentLimiting> entry = it.next();
			String key = entry.getKey();
			if(currTime-map.get(key).getFirstAccessTime()>maxLife){
				it.remove(); 
				System.out.println("The key " +  key + " was deleted");
			}
		}
	}
}

