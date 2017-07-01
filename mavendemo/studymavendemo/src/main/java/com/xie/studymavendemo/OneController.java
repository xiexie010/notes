package com.xie.studymavendemo;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xie.studymavendemo.model.OneModel;
import com.xie.studymavendemo.services.OneService;

@Controller
@RequestMapping("/one")
public class OneController {
	private static Logger log=LoggerFactory.getLogger(OneController.class);
	
	private OneService oneservice;

	@Autowired
	public void setOneservice(OneService oneservice) {
		this.oneservice = oneservice;
	}
	
	
	
//	@RequestMapping(value="/view",method=RequestMethod.GET)
//	public String viewOne(@RequestParam("name") String name,Model model)
//	{
//		OneModel onemodel=oneservice.getOneModel(name);
//		model.addAttribute(onemodel);
//		return "one_overview";
//		
//	}
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public ModelAndView viewone(@RequestParam("name") String name)
	{
		Map<String, Object>model=new HashMap<String, Object>();
		model.put("title", "≤‚ ‘≤‚ ‘ΩÁ√Ê");
		
		return new ModelAndView("one_overview", model);
		
	}
	@RequestMapping(value="/view0",method=RequestMethod.GET)
	public ModelAndView viewone1(@RequestParam("name") String name)
	{
		Map<String, Object>model=new HashMap<String, Object>();
		model.put("title", "≤‚ ‘≤‚ ‘ΩÁ√Ê");
		
		return new ModelAndView("one_overview0", model);
		
	}
	
	@RequestMapping(value="/view1",method=RequestMethod.GET)
	public ModelAndView viewone2(@RequestParam("name") String name) throws UnsupportedEncodingException
	{
		name=new String(name.getBytes("ISO-8859-1"),"UTF-8");
		log.info("log-->"+name);
		
		
		Map<String, Object>model=new HashMap<String, Object>();
		System.out.println("test-->"+name);
		model.put("title", name);
		
		return new ModelAndView("one_overview1", model);
		
	}
	
}
