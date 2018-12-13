package com.greenfox.tablesandforms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }

    @GetMapping("/loginv14")
    public String loginv14Form(){
        return "loginv14";
    }

    @GetMapping("/signmeup")
    public String SignUpForm(){
        return "signmeup";
    }

    @GetMapping("/table")
    public String table(){
        return "table";
    }
}
