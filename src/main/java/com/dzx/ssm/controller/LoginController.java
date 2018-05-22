package com.dzx.ssm.controller;

import com.google.zxing.*;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Author:DingZhaoxiang
 * @Description:
 * @Date 14:29  2018/5/14
 **/
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("userAuthen.do")
    @ResponseBody
    public Map<String,Object> userAuthen(HttpServletRequest request,HttpServletResponse response){
        String name = request.getParameter("name");
        System.out.println(name);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",200);
        map.put("name",name);
        return map;
    }
    //每5秒执行一次
//    @Scheduled(cron="0/5 * *  * * ? ")
//    public void deleteAllTempClob(){
//        System.err.println("每5秒执行定时任务");
//    }
    @RequestMapping("displayQRCode.do")
    public void displayQRCode(HttpServletRequest request,HttpServletResponse response){
        String text = "dingzhaoxiangdeerweima";
        int width = 180; // 二维码图片宽度
        int height = 180; // 二维码图片高度
        String format = "png";
        Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");   // 内容所使用字符集编码
        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
            MatrixToImageWriter.writeToStream(bitMatrix, format, response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
