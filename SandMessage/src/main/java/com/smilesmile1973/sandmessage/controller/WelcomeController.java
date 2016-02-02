package com.smilesmile1973.sandmessage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class WelcomeController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}

}
