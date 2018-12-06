package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        Greeting greeting = new Greeting(1,name);
        model.addAttribute("name", greeting.getContent());
        model.addAttribute("id", greeting.getId());
        model.addAttribute("hello", greeting.getRandomHello());
        model.addAttribute("color", getRandomColor());
        model.addAttribute("fontSize", getRandomFontSize());

        return "greeting";
    }

    public String getRandomFontSize() {
        return "font-size:" + (int)(Math.random()*40+10) + "px;";
    }
    public String getRandomColor() {
        int r = (int)(Math.random()*255);
        int g = (int)(Math.random()*255);
        int b = (int)(Math.random()*255);

        return "color:rgb(" + r + ", " + g + ", " + b + ");";
    }
}
