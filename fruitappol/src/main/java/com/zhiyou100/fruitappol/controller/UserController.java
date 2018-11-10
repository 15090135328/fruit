package com.zhiyou100.fruitappol.controller;

import com.zhiyou100.fruitappol.entity.UserEntity;
import com.zhiyou100.fruitappol.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * @ClassName UserController
 * @Description TODO
 * @Auther shi
 * @Date 2018/9/13 20:42
 * @Version 1.0
 **/

@Controller
@RequestMapping("/login")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/register")
    @ResponseBody
    public String register(String username, String password, HttpServletRequest request){
       if(StringUtils.isBlank(username)||StringUtils.isBlank(password)){
           return "用户名或者密码为空";
       }
        Optional<UserEntity> userEntity = userService.findByNameAndPassword(username, password);
       if(userEntity.isPresent()){
           return "注册成功";
       }
        return "注册失败，请重新注册";
    }

    @RequestMapping("/check")
    @ResponseBody
    public String checkName(String username){
        Optional<UserEntity> userEntity = userService.findByName(username);
        if(userEntity.isPresent()){
            return "username exits";
        }
        return null;
    }
}
