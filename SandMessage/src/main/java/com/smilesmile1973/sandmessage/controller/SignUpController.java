package com.smilesmile1973.sandmessage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smilesmile1973.dto.PersonDTO;
import com.smilesmile1973.util.ServiceUtils;

@Controller
public class SignUpController {
	private PersonDTO personDTO;

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String initialize(Model model) {
		personDTO = new PersonDTO();
		model.addAttribute("form",personDTO);
		//ModelAndView result = new ModelAndView("signUp", "command", personDTO);
		return "signUp";
	}
	
	@RequestMapping(value ="/addPerson", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("form")PersonDTO form, BindingResult bindingResult) {
		System.out.println(form);
		ServiceUtils.INSTANCE.getPersonBo().save(form);
		return "indev...";
	}

}
