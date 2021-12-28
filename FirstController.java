package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Annotation
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model)
    {
        model.addAttribute("username","정성원"); // username이라는 변수와 그 값은 정성원이다
        return "greetings"; // templates/greetings.mustache -> 브라우저로 전송
    }
}

// Controller를 선언후 return값으로 보여줄 page의 이름 -> GetMapping으로 연결시켜준다
