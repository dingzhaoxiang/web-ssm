package com.dzx.ssm.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 发送http请求工具类
 * @author
 *
 */
public class HttpRequestUtil {
	/**
	 * 进行Get请求
	 * @param param   请求的参数
	 * @param url	    请求的地址	
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public static HttpResponse doGet(Map<String, String> param, String url) throws ClientProtocolException, IOException{
		HttpClient client = new DefaultHttpClient(); 
		if(param!=null){
			url+="?";
			int i=1;
			for(String p:param.keySet()){
				if(i!=1){
					url+="&";
				}
				url+=p+"="+param.get(p);
				i++;
			}
			System.out.println(url);
		}

		HttpGet httpGet=new HttpGet(url);
		HashMap<String, String> headers = new HashMap<String, String>();

		HttpResponse response=client.execute(httpGet);
		return response;
	}
	
	public static HttpResponse doPost(Map<String, String>param, String url) throws  Exception{
		HttpClient client = new DefaultHttpClient(); 
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		for(String s:param.keySet()){
			//client.getParams().setParameter(s, param.get(s));
			params.add(new BasicNameValuePair(s, param.get(s)));
		}
		HttpPost httpPost=new HttpPost(url);
		
       // params.add(new BasicNameValuePair("$xmldata", reqXml));  
        httpPost.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
		//httpPost.setEntity(new UrlEncodedFormEntity((List<? extends org.apache.http.NameValuePair>) params, "utf-8"));
		HttpResponse response=client.execute(httpPost);
		//System.out.println(EntityUtils.toString(httpPost.getEntity()));
		return response;
	}
	
	
	public static HttpResponse doPostByJson(String jsonStr, String url) throws Exception{
		StringEntity entity = new StringEntity(jsonStr,"utf-8");//解决中文乱码问题
		entity.setContentEncoding("UTF-8");    
        entity.setContentType("application/json");    
		HttpClient client = new DefaultHttpClient(); 
		HttpPost httpPost=new HttpPost(url);
		httpPost.setEntity(entity);
        HttpResponse response=client.execute(httpPost);
        return response;
	}
	
	
	public static void main(String[] args) {
		Map<String, String> param=new HashMap<String, String>();
		param.put("age","25");
		param.put("cupSize","b");
		HttpEntity entity;
		try {
			entity = HttpRequestUtil.doPost(param,"http://localhost:8082/girls").getEntity();
			System.out.println(EntityUtils.toString(entity));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
