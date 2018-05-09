package com.dzx.ssm.utils.currentLimiting;

import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * Created by dzx on 2017/5/19.
 * 发送邮件相关的操作
 */
@SuppressWarnings("ALL")
public class MyMailHandler  {

    //存放当前ip被拒绝的次数
    Map<String,Integer> denyTimesMap = new HashMap<String, Integer>();

    //存放当前ip被拒绝次数的上限，超过这个上限就发送邮件
    Map<String,Integer> maxDenyTimesMap = new HashMap<String, Integer>();

    //被拒绝次数的上限的初始值
    private int initMaxDenyTimes;


    public MyMailHandler(int initMaxDenyTimes){
        this.initMaxDenyTimes = initMaxDenyTimes;
        new Thread(new clearIpOnceADay()).start();
    }


    //当currentLimiting拒绝访问时调用这个方法
    public synchronized void  addIp(String ip){
        if(!denyTimesMap.containsKey(ip)){
            //System.out.println("第一次添加: "+ip);
            denyTimesMap.put(ip,1);
            maxDenyTimesMap.put(ip,initMaxDenyTimes);
        }
        else{
            int denyTimes = denyTimesMap.get(ip)+1;
           // System.out.println("已经拒绝的次数： "+denyTimes);
            if(denyTimes>maxDenyTimesMap.get(ip)){
                send(ip,denyTimes);
                int maxDenyTimes = maxDenyTimesMap.get(ip);
                maxDenyTimesMap.put(ip,maxDenyTimes*5);
                //System.out.println("新的拒绝次数上限："+maxDenyTimesMap.get(ip));
            }
            denyTimesMap.put(ip,denyTimes);
        }
    }

    public void send(String ip,int denyTimes){
        try {
                // 配置发送邮件的环境属性
                final Properties props = new Properties();
                /*
                 * 可用的属性： mail.store.protocol / mail.transport.protocol / mail.host /
                 * mail.user / mail.from
                 */
                // 表示SMTP发送邮件，需要进行身份验证
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.host", "smtp.163.com");

                // 发件人的账号
                props.put("mail.user", "dzxbupt@163.com");

                // 访问SMTP服务时需要提供的密码
                props.put("mail.password", "dzx166018");

                // 构建授权信息，用于进行SMTP进行身份验证
                Authenticator authenticator = new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        // 用户名、密码
                        String userName = props.getProperty("mail.user");
                        String password = props.getProperty("mail.password");
                        return new PasswordAuthentication(userName, password);
                    }
                };
                // 使用环境属性和授权信息，创建邮件会话
                Session mailSession = Session.getInstance(props, authenticator);
                // 创建邮件消息
                MimeMessage message = new MimeMessage(mailSession);
                // 设置发件人
                InternetAddress form = new InternetAddress(
                        props.getProperty("mail.user"));
                message.setFrom(form);

                // 设置收件人
                InternetAddress to = new InternetAddress("dingzhaoxiang@xiaomi.com");
                message.setRecipient(RecipientType.TO, to);

                // 设置抄送
                /*InternetAddress cc = new InternetAddress("luo_aaaaa@yeah.net");
                message.setRecipient(RecipientType.CC, cc);*/

                /*// 设置密送，其他的收件人不能看到密送的邮件地址
                InternetAddress bcc = new InternetAddress("aaaaa@163.com");
                message.setRecipient(RecipientType.CC, bcc);*/

                // 设置邮件标题
                //System.out.println("ip: "+ip+"denyTimes: "+denyTimes);
                message.setSubject("CAS 流量报警");

                // 设置邮件的内容体
                StringBuffer sb = new StringBuffer();
                sb.append("Warning: the ip address ");
                sb.append(ip);
                sb.append(" has been denied to access ");
                sb.append(denyTimes);
                sb.append(" times");
                sb.append(" because it try to request too frequently");
                message.setContent(sb.toString(), "text/html;charset=UTF-8");

                // 发送邮件
                Transport.send(message);
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }
    class clearIpOnceADay implements Runnable{

        @Override
        public void run() {
            while(true){
                try {
                    Thread.sleep(24*3600*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clearIp();
            }

        }
        public void clearIp(){
            Iterator<Map.Entry<String,Integer>> it_denyTimesMap = denyTimesMap.entrySet().iterator();
            Iterator<Map.Entry<String,Integer>> it_maxDenyTimesMap = maxDenyTimesMap.entrySet().iterator();

            while(it_denyTimesMap.hasNext()){
                Map.Entry<String,Integer> entry = it_denyTimesMap.next();
                String key = entry.getKey();
                it_denyTimesMap.remove();
                System.out.println("In denyTimesMap,the key " +  key + " was deleted");
            }

            while(it_maxDenyTimesMap.hasNext()){
                Map.Entry<String,Integer> entry = it_maxDenyTimesMap.next();
                String key = entry.getKey();
                it_maxDenyTimesMap.remove();
                System.out.println("In maxDenyTimesMap,the key " +  key + " was deleted");
            }

        }
    }
}

