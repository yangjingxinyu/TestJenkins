package com.yang.jing.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2  
@RestController
public class TestSwaggerController {

	@RequestMapping(value="/testHello")
	public String TestHello(){
		return "Hello yangjing";
	}
}
