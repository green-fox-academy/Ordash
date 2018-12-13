package com.greenfox.dependencies.controllers;

import com.greenfox.dependencies.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/gfa")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public String mainPage(){
        return "gfa";
    }

    @GetMapping("/listAll")
    public String listAll(Model model){
        model.addAttribute("students", studentService.findAll());
        return "gfastudents";
    }
}
