package com.greenfox.programmerfoxclub.Controllers;

import com.greenfox.programmerfoxclub.Models.Fox;
import com.greenfox.programmerfoxclub.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    FoxService foxService;

    @RequestMapping("/")
    public String home(Model model, @RequestParam(value = "name", required = false)String name){
        if(name == null) {
            return "redirect:/login";
        } else {
            Optional<Fox> optionalFox = foxService.findFox(name);
            if(optionalFox.isPresent()){
                model.addAttribute("fox", optionalFox.get());
            } else {
                return "redirect:/login";
            }

        }
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam("name")String name, RedirectAttributes redirectAttributes){
        foxService.addFox(name);
        redirectAttributes.addAttribute("name",name);
        return "redirect:/";
    }

    @GetMapping("/nutrition")
    public String nutritionStore(){
        return "nutrition";
    }

}
