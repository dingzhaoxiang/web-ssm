package com.dzx.ssm.service.impl;

import com.dzx.ssm.dao.UserDao;
import com.dzx.ssm.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author:DingZhaoxiang
 * @Description:
 * @Date 11:08  2018/6/6
 **/
@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Resource
    UserDao userDao;
    @Override
    public Boolean isValid(String name, String password) {
        String realPassword =userDao.selectPasswordByName(name);
        if(realPassword.trim().equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
