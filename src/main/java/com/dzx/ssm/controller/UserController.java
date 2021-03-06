package com.dzx.ssm.controller;

import com.dzx.ssm.model.User;
import com.dzx.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("showUser.do")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        //得到session对象
        HttpSession session = request.getSession(false);
        String name = (String)session.getAttribute("name");
        System.out.println("欢迎："+name);
        model.addAttribute("userList",userList);
        log.info(request.getParameter("user_phone"));
        System.out.println("查询所有用户");
        return "showUser";
    }
}
