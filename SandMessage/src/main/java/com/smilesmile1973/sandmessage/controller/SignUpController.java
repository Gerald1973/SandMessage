package com.smilesmile1973.sandmessage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smilesmile1973.dto.PersonDTO;

@Controller
public class SignUpController {
	private PersonDTO personDTO;

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public ModelAndView initialize() {
		personDTO = new PersonDTO();
		ModelAndView result = new ModelAndView("signUp", "command", personDTO);
		return result;
	}

}
