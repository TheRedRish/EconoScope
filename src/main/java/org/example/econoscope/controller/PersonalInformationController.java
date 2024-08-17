package org.example.econoscope.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalInformationController {

    @GetMapping("/personal-information")
    public String getPersonalInformation() {
        return "personal-information";
    }
}
