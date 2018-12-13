package com.greenfox.dependencies.controllers;

import com.greenfox.dependencies.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/useful")
public class UsefulController {


    private UtilityService utilityService;

    @Autowired
    public UsefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/colored")
    public String colored(Model model){
        model.addAttribute("bgcolor",utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/email")
    public String email(Model model, @RequestParam("email")String email) {
        model.addAttribute("valid", utilityService.validateEmail(email));
        model.addAttribute("email",email);
        return "email";
    }

    @GetMapping("/caesar")
    public String encodeDecode(Model model, @RequestParam("text")String text, @RequestParam("number")Integer number){
        model.addAttribute("result", utilityService.caesar(text,number));
        return "caesar";

    }
}
