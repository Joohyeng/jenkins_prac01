package com.example.jenkins;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public String test(){
        return "zzz5";
    }
}
