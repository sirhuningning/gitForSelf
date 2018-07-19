package com.hu.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sirhu on 2018/7/20.
 */
@Controller
public class loginController {

    @RequestMapping("login")
    public void loginSystem(){
        System.out.println("this is a curret controller");
    }
}
