package com.smilesmile1973.sandmessage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smilesmile1973.dto.PersonDTO;
import com.smilesmile1973.util.ServiceUtils;
import com.smilesmile1973.validator.SignUpValidator;

@Controller
public class SignUpController {

	@Autowired
	private SignUpValidator signUpValidator;

	@InitBinder
	private void InitBinder(WebDataBinder binder) {
		binder.setValidator(getSignUpValidator());
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String initialize(Model model) {
		PersonDTO personDTO = new PersonDTO();
		model.addAttribute("signupForm", personDTO);
		// ModelAndView result = new ModelAndView("signUp", "command",
		// personDTO);
		return "signUp";
	}

	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("signupForm") @Validated PersonDTO signupForm, BindingResult bindingResult) {
		String result = "indev...";
		if (bindingResult.hasErrors()) {
			result = "signUp";
		}else{
			System.out.println(signupForm);
			ServiceUtils.INSTANCE.getPersonBo().save(signupForm);
		}
		return result;
	}

	public SignUpValidator getSignUpValidator() {
		return signUpValidator;
	}

	public void setSignUpValidator(SignUpValidator signUpValidator) {
		this.signUpValidator = signUpValidator;
	}

}
