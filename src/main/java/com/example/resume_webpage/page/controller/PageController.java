package com.example.resume_webpage.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index-Korean";
    }
    @GetMapping("/Kor")
    public String Korean() {
        return "index-Korean";
    }

}
