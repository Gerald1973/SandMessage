package com.smilesmile1973.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.smilesmile1973.dto.PersonDTO;

@Component
public class SignUpValidator implements Validator {

	@Override
	public boolean supports(Class<?> target) {
		boolean result = true;
		result = PersonDTO.class.equals(target);
		return result;
	}

	@Override
	public void validate(Object target, Errors errors) {
		PersonDTO person = (PersonDTO) target;
		// 1°Verify empty or not
		if (StringUtils.isEmpty(person.getFirstName())) {
			errors.rejectValue("firstName", "signup.empty.name","signup.empty.name");
		}
		if (StringUtils.isEmpty(person.getLastName())) {
			errors.rejectValue("lastName", "signup.empty.last.name","AAAAB");
		}
		if (StringUtils.isEmpty(person.getEmail())) {
			errors.rejectValue("email", "signup.empty.email","AAAAC");
		} else {
			if (!ValidationStringUtils.INSTANCE.validateEmail(person.getEmail())) {
				errors.rejectValue("email","signup.malformed.email","AAAAD");
			}
		}
		if (StringUtils.isEmpty(person.getPassword())) {
			errors.rejectValue("password", "signup.empty.password","AAAAE");
		} else {
			if (!ValidationStringUtils.INSTANCE.validatePassword(person.getPassword())) {
				errors.rejectValue("signup.malformed.password","AAAAF");
			}
		}
	}
}
