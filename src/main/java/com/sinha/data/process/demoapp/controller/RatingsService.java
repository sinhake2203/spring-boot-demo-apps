package com.sinha.data.process.demoapp.controller;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;


@Service
public class RatingsService {
	
	private  static final Logger LOGGER = Logger.getLogger(RatingsService.class.getName());
	
	
	public List<String> getRatings(){
		LOGGER.info("getRatings info {}");
		
		return Arrays.asList("1","2");
	}

}
