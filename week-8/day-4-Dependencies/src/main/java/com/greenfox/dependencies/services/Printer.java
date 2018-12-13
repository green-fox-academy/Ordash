package com.greenfox.dependencies.services;

import org.springframework.stereotype.Service;

@Service
public class Printer{
    public void log(MyColor myColor){
        myColor.printcolor();
    }
}
