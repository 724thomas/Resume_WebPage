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
    @GetMapping("/blog/서버-로그-아카이브-파이프라인")
    public String graphicServerLogArchivePipeline() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/aws/server-log-archive-pipeline";
    }
    @GetMapping("/blog/람다-이미지-프로세싱")
    public String graphicImageProcessingWithLambda() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/aws/image-processing-using-lambda";
    }
    @GetMapping("/blog/데이터-일관성-원자성-UX최적화")
    public String graphicDataConsistencyAtomicityUXOptimization() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/database/ensuring-data-consistency-atomicity-and-ux-optimization-feat.firebase";
    }
    @GetMapping("/review/2024년-그래픽-인턴-회고록-medium")
    public String graphicReview() {
        return "redirect:https://medium.com/graphic-bookstore/%EC%8B%A0%EC%9E%85-%EA%B0%9C%EB%B0%9C%EC%9E%90%EC%9D%98-2024%EB%85%84-%EC%83%81%EB%B0%98%EA%B8%B0-%EA%B7%B8%EB%9E%98%ED%94%BD-%EC%9D%B8%ED%84%B4-%ED%9A%8C%EA%B3%A0%EB%A1%9D-999075dd7d80";
    }

    // KAKAOBRAIN

    @GetMapping("/review/카카오브레인-인턴-회고록")
    public String kakaoBrainReview() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/reviews/kakao-brain-pathfinder-review";
    }

    // SIDE PROJECTS

    // CODEMENTOR
    @GetMapping("/blog/카프카-도입기")
    public String codementorImplementationOfKafka() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/toy-projects/codementor/implementation-of-kafka";
    }
    @GetMapping("/blog/쿠버네티스-도입과-프로젝트-개선-과정")
    public String codementorImplementationOfK8s() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/toy-projects/codementor/implementation-of-kafka";
    }

//http://wonjoonthomaschoi.site/
}
