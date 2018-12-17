package com.greenfox.programmerfoxclub.Services;

import com.greenfox.programmerfoxclub.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {

    List<Fox> foxes;


    public FoxService() {
        this.foxes = new ArrayList<>();
    }

    public void addFox(String name){
        foxes.add(new Fox(name));
    }

    public Optional<Fox> findFox(String name) {
        for (Fox fox : foxes) {
            if(fox.getName().equals(name)) {
                return Optional.of(fox);
            }
        }
        return Optional.empty();
    }
}
