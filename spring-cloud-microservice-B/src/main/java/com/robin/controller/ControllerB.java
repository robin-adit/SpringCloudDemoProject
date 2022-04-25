package com.robin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/B")
public class ControllerB {
	
	  @GetMapping("/message")
	    public String test() {
	        return "Called Controller B in MicroService B";
	    }
}