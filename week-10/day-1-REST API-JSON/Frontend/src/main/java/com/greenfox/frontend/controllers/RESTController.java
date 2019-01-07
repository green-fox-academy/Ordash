package com.greenfox.frontend.controllers;

import com.greenfox.frontend.models.*;
import com.greenfox.frontend.repositories.LogRepository;
import com.greenfox.frontend.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class RESTController {

    private ResultService resultService;

    private LogRepository logRepository;

    @Autowired
    public RESTController(ResultService resultService, LogRepository logRepository) {
        this.resultService = resultService;
        this.logRepository = logRepository;
    }

    @GetMapping("/doubling")
    public Doubled doubling(@RequestParam(value = "input",required = false)Integer input){
        logRepository.save(new Log("/doubling", "input="+input));
        if(input != null){
            return new Doubled(input);
        } else {
            throw new UnsupportedOperationException("Please provide an input!");
        }
    }

    @GetMapping("/greeter")
    public Greeter greeter(@RequestParam(value = "name",required = false)String name,
                          @RequestParam(value = "title",required = false)String title){
        logRepository.save(new Log("/greeter", "name="+name+", title="+title));
        if(name == null && title == null) {
            throw  new UnsupportedOperationException("Please provide a name and a title!");
        } else if (name == null){
            throw  new UnsupportedOperationException("Please provide a name!");
        } else if (title == null){
            throw new UnsupportedOperationException("Please provide a title!");
        } else {
            return new Greeter(name,title);
        }
    }

    @GetMapping("/appenda/{appendable}")
    public AppendA appendA(@PathVariable(name = "appendable")String appendable){
        logRepository.save(new Log("/appenda", "appendable=" + appendable));
        if(appendable == null){
            throw new UnsupportedOperationException("404");
        }
        return new AppendA(appendable);
    }

    @PostMapping("/dountil/{action}")
    public Result doUntil(@PathVariable(name = "action")String action, @RequestBody Until until){
        logRepository.save(new Log("dountil", "action=" + action + ", until=" + until.getUntil()));
        if (until.getUntil() == null){
            throw new UnsupportedOperationException("Please provide a number!");
        } else if (action.equals("sum")) {
            return resultService.getSum(until);
        } else {
            return resultService.getFactor(until);
        }
    }

    @PostMapping("/arrays")
    public Result arrayHandler(@RequestBody What what){
        logRepository.save(new Log("/arrays", "what=" + what.getWhat() +", numbers=" + Arrays.toString(what.getNumbers())));
        if(what.getWhat() == null || what.getNumbers() == null){
            throw new UnsupportedOperationException("Please provide what to do with the numbers!");
        } else if (what.getWhat().equals("sum")){
            return resultService.getArraySum(what);
        } else if (what.getWhat().equals("multiply")){
            return resultService.getArrayMultiplication(what);
        } else if (what.getWhat().equals("double")){
            return resultService.getArrayElementsDoubled(what);
        }
        throw new UnsupportedOperationException("Please provide what to do with the numbers!");
    }

    @GetMapping("/log")
    public LogQuery showLogs(){
        return new LogQuery(logRepository);
    }
}
