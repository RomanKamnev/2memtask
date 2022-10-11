package com.example.memtask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "login.html";
    }

    @ResponseBody
    @GetMapping("/secured")
    public String getSecret() {
        return "secret!";
    }

}
