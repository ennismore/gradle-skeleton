package com.ennismore.skeleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class SkeletonController {
    @GetMapping("/skeleton")
    public String get() {
        return "Hello World";
    }
}
