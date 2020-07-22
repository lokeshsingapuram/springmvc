package com.tcs.utils;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.tcs.constants.AppConstants;

@Component
public class TemporaryPasswordUtils {
	
	public String generatingRandomAlphabeticString() {
		/*
		 * int leftLimit = 48; // letter 'a' int rightLimit = 122; // letter 'z' int
		 * targetStringLength = 6;
		 */
	    Random random = new Random();
	 
	    String generatedString = random.ints(AppConstants.LeftLimit, AppConstants.RightLimit + 1).filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	      .limit(AppConstants.TargetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	 
	    return generatedString;
	}

}
