package com.example.demo.vscodedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VscodedemoApplicationController {

    @GetMapping("/")
    public String displayTest(){
        return "You did it!";
    }
    
}
