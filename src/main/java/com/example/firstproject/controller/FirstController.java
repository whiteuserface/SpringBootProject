package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username","동인");

        return "greetings"; //templates/greetings.mustache -> 브라우저 전송
    }

    @GetMapping("/bye")
    public String seeYouAgain(Model model){
        model.addAttribute("username","동인");
        return "byebye"; //templates/greetings.mustache -> 브라우저 전송
    }
}
