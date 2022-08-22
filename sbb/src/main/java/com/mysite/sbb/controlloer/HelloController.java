package com.mysite.sbb.controlloer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
//    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    @ResponseBody
    public String hello() {
        return "Hello Spring Boot Board!";
    }
}
