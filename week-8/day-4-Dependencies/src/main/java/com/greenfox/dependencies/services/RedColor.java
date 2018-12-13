package com.greenfox.dependencies.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor{

    @Override
    public void printcolor() {
        System.out.println("This color is RED!");
    }
}
