package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogSingleController {
    @GetMapping("/blog/blog-single")
    public String blogDetail() {
        return "blog-single";
    }
}
