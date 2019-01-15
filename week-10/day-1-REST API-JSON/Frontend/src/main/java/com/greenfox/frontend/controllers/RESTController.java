package com.greenfox.frontend.controllers;

import com.greenfox.frontend.exceptions.NoInputException;
import com.greenfox.frontend.exceptions.NotFoundException;
import com.greenfox.frontend.models.*;
import com.greenfox.frontend.services.LogService;
import com.greenfox.frontend.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class RESTController {

    private ResultService resultService;

    private LogService logService;

    @Autowired
    public RESTController(ResultService resultService, LogService logService) {
        this.resultService = resultService;
        this.logService = logService;
    }

    @GetMapping("/doubling")
    public ResponseEntity<Doubled> doubling(@RequestParam(value = "input",required = false)Integer input) throws NoInputException {
        logService.save(new Log("/doubling", "input="+input));
        if(input != null){
            return new ResponseEntity<>(new Doubled(input), HttpStatus.OK);
        } else {
            throw new NoInputException("Please provide an input!");
        }
    }

    @GetMapping("/greeter")
    public Greeter greeter(@RequestParam(value = "name",required = false)String name,
                          @RequestParam(value = "title",required = false)String title) throws NoInputException{
        logService.save(new Log("/greeter", "name="+name+", title="+title));
        if(name == null && title == null) {
            throw  new NoInputException("Please provide a name and a title!");
        } else if (name == null){
            throw  new NoInputException("Please provide a name!");
        } else if (title == null){
            throw new NoInputException("Please provide a title!");
        } else {
            return new Greeter(name,title);
        }
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<AppendA> appendA(@PathVariable(name = "appendable")String appendable) throws NotFoundException {
        logService.save(new Log("/appenda", "appendable=" + appendable));
        if(appendable == null){
            throw new NotFoundException("404");
        }
        return ResponseEntity.ok(new AppendA(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<Result> doUntil(@PathVariable(name = "action")String action, @RequestBody Until until) throws NoInputException{
        logService.save(new Log("dountil", "action=" + action + ", until=" + until.getUntil()));
        if (until.getUntil() == null){
            throw new NoInputException("Please provide a number!");
        } else if (action.equals("sum")) {
            return ResponseEntity.ok(resultService.getSum(until));
        } else {
            return ResponseEntity.ok(resultService.getFactor(until));
        }
    }

    @PostMapping("/arrays")
    public Result arrayHandler(@RequestBody What what){
        logService.save(new Log("/arrays", "what=" + what.getWhat() +", numbers=" + Arrays.toString(what.getNumbers())));
        if(resultService.resultArrayHandlerValidator(what)){
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
        return logService.getLog();
    }


}
