package com.hospital.util;

import java.security.SecureRandom;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Component;

@Component
public class CommonUtil {
	
	public GregorianCalendar getTodaysDate() {
		Date date = new Date();
		GregorianCalendar calender = new GregorianCalendar();
		calender.setTime(date);
		return calender;
	}
	
	public String generateRandomDigit(int digit) {
		
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(1000);
		String formatted = String.format("%0"+digit+"d", num); 
		return formatted;
	}

}
