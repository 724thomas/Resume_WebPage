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

    @GetMapping("/portfolio")
    public String redirectPortfolio() {
        return "redirect:http://wonjoonthomaschoi.site/portfolio/kor";
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

    @GetMapping("/blog/Batch삭제-분리된-트랜잭션의-장단점")
    public String batchDeleteInsteadOfCascadeDelete(){
        return "redirect:https://wonjoon.gitbook.io/joons-til/java/batch-delete-instead-of-cascade";
    }

    @GetMapping("/blog/람다-이미지-프로세싱")
    public String graphicImageProcessingWithLambda() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/aws/image-processing-using-lambda";
    }
    @GetMapping("/blog/데이터-일관성-원자성-UX최적화")
    public String graphicDataConsistencyAtomicityUXOptimization() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/database/ensuring-data-consistency-atomicity-and-ux-optimization-feat.firebase";
    }
    @GetMapping("/review/2024년-상반기-그래픽-인턴-회고록-medium")
    public String graphicReview() {
        return "redirect:https://medium.com/graphic-bookstore/%EC%8B%A0%EC%9E%85-%EA%B0%9C%EB%B0%9C%EC%9E%90%EC%9D%98-2024%EB%85%84-%EC%83%81%EB%B0%98%EA%B8%B0-%EA%B7%B8%EB%9E%98%ED%94%BD-%EC%9D%B8%ED%84%B4-%ED%9A%8C%EA%B3%A0%EB%A1%9D-999075dd7d80";
    }

    // KAKAOBRAIN

    @GetMapping("/blog/블로킹-논블로킹-동기-비동기")
    public String blockingNonBlockingSyncAsync() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/network/blocking-nonblocking-and-sync-async";
    }

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
        return "redirect:https://wonjoon.gitbook.io/joons-til/toy-project/codementor/implementation-of-k8s";
    }

    // STUDIES
    @GetMapping("/blog/JSCODE-자바")
    public String JscodeJava() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/java/jscode-java-study-note";
    }

    @GetMapping("/blog/JSCODE-운영체제")
    public String JscodeOS() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/os/jscode-os-study-note";
    }

    @GetMapping("/blog/JSCODE-데이터베이스")
    public String JscodeDatabase() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/network/jscode-network-study-note";
    }
//    @GetMapping("/blog/JSCODE-자바1기")
//    public String JscodeNetwork() {
//        return "redirect:https://wonjoon.gitbook.io/joons-til/java/jscode-java-study-note";
//    }

    // BOOKS
    @GetMapping("/blog/대규모-시스템-설계-기초")
    public String bookLargeSystemDesign() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/books/learning-the-basics-of-large-scale-system-design-through-virtual-interview-cases";
    }
    @GetMapping("/blog/컴퓨터시스템-프로그래머-관점")
    public String bookCSAPP() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/books/computer-system-a-programmers-perspective";
    }
    @GetMapping("/blog/이펙티브-자바")
    public String bookEffectiveJava() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/books/effective-java";
    }
    @GetMapping("/blog/헤드퍼스트-디자인-패턴")
    public String bookHeadFirstDesignPattern() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/books/head-first-design-patterns";
    }
    @GetMapping("/blog/면접을-위한-CS-전공지식-노트")
    public String bookCsNoteForInterview() {
        return "redirect:https://wonjoon.gitbook.io/joons-til/books/cs-note-for-interview";
    }


//http://wonjoonthomaschoi.site/
}
