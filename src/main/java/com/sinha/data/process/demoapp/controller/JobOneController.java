package com.sinha.data.process.demoapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/ratings")
public class JobOneController {
	
	private  static final Logger LOGGER = Logger.getLogger(JobOneController.class.getName());

	@Autowired
	private RatingsService ratingService;


    @GetMapping(path="/user", produces = "application/json")
    public List<String> ratings(){
    	LOGGER.info("ratings info {}");
		
        return ratingService.getRatings();

    }


}
