package com.smilesmile1973.sandmessage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
}
