package com.example.deploy01;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public String returnDevName(@RequestParam String name) {
        return name;
    }
}
