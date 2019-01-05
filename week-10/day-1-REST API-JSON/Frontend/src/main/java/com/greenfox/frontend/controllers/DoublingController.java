package com.greenfox.frontend.controllers;

import com.greenfox.frontend.models.Doubled;
import com.greenfox.frontend.models.ErrorMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input",required = false)Integer input){
        if(input != null){
            return new Doubled(input);
        } else {
            return new ErrorMessage("Please provide an input!");
        }
    }
}
