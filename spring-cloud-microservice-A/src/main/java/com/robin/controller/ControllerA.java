package com.robin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/A")
public class ControllerA {
	
	  @GetMapping("/message")
	    public String test() {
	        return "Called Controller A in MicroService A";
	    }
}