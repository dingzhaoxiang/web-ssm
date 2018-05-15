package com.dzx.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
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
}
