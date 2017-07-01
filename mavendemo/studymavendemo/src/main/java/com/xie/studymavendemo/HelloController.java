package com.xie.studymavendemo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/show")
	public String showHello(Model model)
	{
		
		return "showHello";
	}
	
	
}
