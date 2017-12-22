package com.example.mylook;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	public String index() {
		return "hello world ??";
	}
	@RequestMapping(value="/hello")
	public String helloWorld() {
		return "helloworld springboot";
	}
}
