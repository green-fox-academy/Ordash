package com.greenfox.todoswithmysql.controllers;

import com.greenfox.todoswithmysql.repositories.TodoRepository;
import com.greenfox.todoswithmysql.repositories.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @GetMapping(value = { "","/","/list" })
    public String list(Model model, @RequestParam(value="isActive", required = false)Boolean isDone){
        if(isDone != null && isDone){
            model.addAttribute("todos",todoRepository.findByDone(!isDone));
        } else {
            model.addAttribute("todos", todoRepository.findAll());
        }
        return "todolist";
    }

    @GetMapping(value = "/add")
    public String addTodo(Model model){
        model.addAttribute("newtodo", new Todo());
        return "add";
    }

    @PostMapping(value = "/add")
    public String addTodoPost(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/list";

    }

    @GetMapping(value = "{id}/delete")
    public String deleteTodo( @PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

}
