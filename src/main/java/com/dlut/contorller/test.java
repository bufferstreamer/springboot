package com.dlut.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class test {

    public void save(){
        System.err.println("springboot");
    }


    @GetMapping
    public String test(){
        System.out.println("springboot");
        return "springboot";
    }
}
