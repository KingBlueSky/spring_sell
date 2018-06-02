package com.jbwang.user.controller;

import com.jbwang.user.VO.ResultVO;
import com.jbwang.user.dataobject.UserInfo;
import com.jbwang.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: jbwang0106
 * @description: user controller
 * @create: 2018-06-02 17:05
 **/
@RestController
@RequestMapping("/login")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("buyer")
    public ResultVO<UserInfo> buyer(@RequestParam String openid, HttpServletResponse response) {
        return null;
    }

    @GetMapping("seller")
    public ResultVO<UserInfo> seller(@RequestParam String openid, HttpServletResponse response) {
        return null;
    }

}
