package com.yh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsMavenController {
	
	@RequestMapping("/mavendemo")
	public String Jenkinsmaven() {
		return "jenkins maven demo";
		
	}

}
