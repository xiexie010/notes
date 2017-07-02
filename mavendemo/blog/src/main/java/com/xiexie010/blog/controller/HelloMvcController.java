package com.xiexie010.blog.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {
	private static Logger log=LoggerFactory.getLogger(HelloMvcController.class);
	@RequestMapping("/mvc")
	public String HelloMvc(){
		return "home";
	}
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewone2(@RequestParam("name") String name,Model model) throws UnsupportedEncodingException
	{
//		name=new String(name.getBytes("ISO-8859-1"),"UTF-8");
		log.info("log-->"+name);
		model.addAttribute("title",name);
		return "one_view";
		
	}
	
	@RequestMapping("/edit")
	public String myedit(){
		return "index";
	}
}