package com.eb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HiConroller {
	
	@RequestMapping("/")
	public String info() {
		
		return "index";
	}
	
	
}
