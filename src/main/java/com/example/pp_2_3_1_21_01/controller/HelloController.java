package com.example.pp_2_3_1_21_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
    @GetMapping(value = "/")
    public String printWelcome() {
        return "redirect:/users";
    }

}