package com.withsport.userservice.domain.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(value="/index")
    public String home() {
        return "index";
    }
}