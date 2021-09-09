package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.beans.LimitsConfiguration;

@RestController
public class LimitConfigController {
	
	@Autowired
	LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/limits")
	public LimitsConfiguration getLimits() {
		return new LimitsConfiguration(limitsConfiguration.getMin(),limitsConfiguration.getMax());
	}

}
