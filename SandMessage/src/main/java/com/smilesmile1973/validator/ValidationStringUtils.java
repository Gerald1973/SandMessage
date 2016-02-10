package com.smilesmile1973.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

import com.smilesmile1973.Constants;

public enum ValidationStringUtils {
	INSTANCE;

	private Pattern emailPattern;

	/**
	 * This method return <code>true</code> if the email is valid.
	 * 
	 * @param email
	 * @return <code>true</code> if the email is valid or <code>false</code> if
	 *         the email is empty or <code>null</code>.
	 */
	public boolean validateEmail(String email) {
		boolean result = false;
		if (!StringUtils.isEmpty(email)) {
			Matcher matcher = emailPattern.matcher(email);
			result = matcher.matches();
		}
		return result;
	}
	
	/**
	 * Pasword min length 8 char
	 * @param password
	 * @return
	 */
	public boolean validatePassword(String password){
		boolean result = false;
		if (!StringUtils.isEmpty(password)){
			if (password.length() >= 8){
				result = true;
			}
		}
		return result;
	}
	
	public boolean isEmpty(String string){
		boolean result = false;
		if (string != null){
			if (string.trim().length() > 0){
				result = true;
			}
		}
		return result;
	}
	
	
	private ValidationStringUtils() {
		emailPattern = Pattern.compile(Constants.EMAIL_PATTERN);
	}
}
