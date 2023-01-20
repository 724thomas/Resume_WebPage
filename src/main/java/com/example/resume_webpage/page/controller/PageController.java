package com.example.resume_webpage.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "redirect:/kor";
    }
    @GetMapping("/kor")
    public String KoreanVersion() {
        return "index-Korean";
    }

    @GetMapping("/eng")
    public String EnglishVersion() {
        return "index-English";
    }



}
