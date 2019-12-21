package com.sinha.data.process.demoapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/ratings")
public class JobOneController {



    @GetMapping(path="/user", produces = "application/json")
    public List<String> ratings(){
    return Arrays.asList("1","2");

    }


}
