package com.ra.fwk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello spring boot!";
	}
	@RequestMapping("/democ")
	public String toDemo(ModelMap map) {
		map.addAttribute("host","http://wyait.blog.51cto.com");
		return"demo";
	}

}