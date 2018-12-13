package com.greenfox.dependencies;

import com.greenfox.dependencies.services.MyColor;
import com.greenfox.dependencies.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

    @Autowired
    @Qualifier("blue")
    MyColor myColor;

    @Autowired
    Printer printer;

    public static void main(String[] args) {
        SpringApplication.run(DependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(myColor);
    }
}

