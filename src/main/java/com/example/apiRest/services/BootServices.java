package com.example.apiRest.services;

import com.example.apiRest.models.Boot;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BootServices {
    private final List<Boot> booters = new ArrayList<>();

    public List<Boot> getAll() {
        return booters;
    }

    public void add(Boot booter) {
        booters.add(booter);
    }

    public Boot getBoot(String name) {
        for (Boot boot: booters) {
            if (boot.getName().equalsIgnoreCase(name)){
                return boot;
            }
        }
        return null;
    }
}
