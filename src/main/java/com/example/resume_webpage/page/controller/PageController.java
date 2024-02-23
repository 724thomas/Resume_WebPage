package com.example.resume_webpage.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "redirect:/portfolio/kor";
    }
    @GetMapping("/resume/kor")
    public String ResumeKoreanVersion() {
        return "resume-Korean";
    }

    @GetMapping("/resume/eng")
    public String ResumeEnglishVersion() {
        return "resume-English";
    }

    @GetMapping("/portfolio/kor")
    public String PortfolioKoreanVersion() {
        return "portfolio-Korean";
    }

    @GetMapping("/portfolio/pdf")
    public String PortfolioPdf() {
        return "portfolio-pdf";
    }





}
