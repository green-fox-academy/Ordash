package com.greenfox.frontend.controllers;

import com.greenfox.frontend.exceptions.NoInputException;
import com.greenfox.frontend.exceptions.NotFoundException;
import com.greenfox.frontend.models.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseBody
    @ExceptionHandler(NotFoundException.class)
    ResponseEntity<ErrorMessage> notFoundHandler(NotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorMessage(ex.getMessage()));
    }

    @ResponseBody
    @ExceptionHandler(NoInputException.class)
    ResponseEntity<ErrorMessage> noInputHandler(NoInputException ex){
        return ResponseEntity.badRequest().body(new ErrorMessage(ex.getMessage()));
    }
}
