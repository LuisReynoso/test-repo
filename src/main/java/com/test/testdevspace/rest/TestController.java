package com.test.testdevspace.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/test")
public class TestController {

    @GetMapping
    public String getHello(){
        return "Hello test";
    }

    @GetMapping(value = "/{message}")
    public String getHello(@PathVariable String message){
        return "Hello test with message " + message;
    }
}
