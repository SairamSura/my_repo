package com.msic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msic.dto.DBConfig;

@RestController
public class TestController {
	
	@Value("${spring.application.name}")
	String appname;
	@Autowired
	DBConfig dbConfig;
	@GetMapping(value="/appname")
	public String getAppName() {
		return this.appname;
	}
	
	@GetMapping(value="/dbconfig")
	public String getDbConfig() {
		return this.dbConfig.toString();
	}
}
