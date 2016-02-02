package com.smilesmile1973.sandmessage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vo.PersonVO;

@Controller
public class SignUpController {
	private PersonVO personVO;

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public ModelAndView initialize() {
		personVO = new PersonVO();
		ModelAndView result = new ModelAndView("signUp", "command", personVO);
		return result;
	}

}
