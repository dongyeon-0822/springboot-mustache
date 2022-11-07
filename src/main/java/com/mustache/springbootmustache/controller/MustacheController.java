package com.mustache.springbootmustache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MustacheController {

    @GetMapping(value = "/hi/{id}")
    public String mustacheCon(@PathVariable String id, Model model) {
        model.addAttribute("username", "dong"); // view 에 값을 넘긴다.
        model.addAttribute("id", id);
        return "greetings"; // greetings라는 view를 반환
    }
}

