package com.greenfox.listingwithh2;

import com.greenfox.listingwithh2.repository.Entity.Todo;
import com.greenfox.listingwithh2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingwithh2Application implements CommandLineRunner {

    @Autowired
    TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(Listingwithh2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Walk the dog"));
        todoRepository.save(new Todo("Buy Milk"));
        todoRepository.save(new Todo("Water the plants"));
    }
}

