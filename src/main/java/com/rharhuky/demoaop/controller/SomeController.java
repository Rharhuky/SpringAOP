package com.rharhuky.demoaop.controller;

import com.rharhuky.demoaop.service.AnotherService;
import com.rharhuky.demoaop.service.SomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor

@RestController
@RequestMapping("/aop")
public class SomeController {

    private final SomeService someService;
    private final AnotherService anotherService;

    @GetMapping
    public void something(){
        this.anotherService.doIt();
        this.someService.doIt();

    }

}
