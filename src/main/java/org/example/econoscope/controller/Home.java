package org.example.econoscope.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping({"/", "/home"})
    public String home(){
        return "home";
    }
}
