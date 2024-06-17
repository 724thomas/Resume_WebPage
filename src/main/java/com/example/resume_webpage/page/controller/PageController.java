package com.example.resume_webpage.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

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


    // REDIRECT

    // CONTACT & CHANNEL
    @GetMapping("/blog")
    public String blog() {
        return "redirect:https://wonjoon.gitbook.io/joons-til";
    }

    // GRAPHIC
//    @GetMapping("/blog/server-log-archive-pipeline")
    @GetMapping("/blog/로그-아카이브-파이프라인")
    public String graphicServerLogArchivePipeline() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/aws/server-log-archive-pipeline";
    }
    @GetMapping("/blog/image-processing-with-lambda")
    public String graphicImageProcessingWithLambda() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/aws/image-processing-using-lambda";
    }
    @GetMapping("/blog/consistency-atomicity-ux-optimization")
    public String graphicDataConsistencyAtomicityUXOptimization() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/database/ensuring-data-consistency-atomicity-and-ux-optimization-feat.firebase";
    }

    // KAKAOBRAIN

    @GetMapping("/review/kakaobrain")
    public String redirectKakaoBrainReview() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/reviews/kakao-brain-pathfinder-review";
    }



}
