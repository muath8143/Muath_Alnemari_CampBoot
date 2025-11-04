package com.example.exercise_introduction_to_springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Welcome_Controller {
    @GetMapping("/name")
    public String name(){
        return "My name is Muath Alnmeari";
    }

    @GetMapping("/age")
    public String age(){
        return "My age is: 21";
    }

    @GetMapping("/check/status")
    public String check(){
        return "Everything is OK";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public String[] names(){
        String [] array =new String [3];
        array[0]="Muath";
        array[1]="Ahmad";
        array[2]="Mohammed";
        return array;
    }
}
