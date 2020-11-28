package com.team.components.lidenghui.login.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: LiDenghui
 * Date: 2020/11/28
 * Time: 21:16
 **/
@Controller
@Api
@RequestMapping(value ="/login")
public class Login {
    @PostMapping(value = "/userLogin")
    @ResponseBody
    public String userLogin(){
        return "成功";
    }
}
