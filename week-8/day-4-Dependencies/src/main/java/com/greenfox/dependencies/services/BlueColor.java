package com.greenfox.dependencies.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class BlueColor implements MyColor {

    @Override
    public void printcolor() {
        System.out.println("This is BLUE!");
    }
}
