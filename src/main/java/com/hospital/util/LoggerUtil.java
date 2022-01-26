package com.hospital.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class LoggerUtil {

	@Autowired
	Gson gson;
	
	private static Logger logger = LoggerFactory.getLogger(LoggerUtil.class);
	
	public static void printInfoLogs(String msg, Object object, boolean maskingRequired) {
		if(null != object) {
			logger.info(msg+" "+object.toString());
		} else {
			logger.info(msg+" "+null);
		}
	}
	
	public static void printErrorLogs(String msg, Exception e) {
		logger.info(msg+" "+e,e);
	}
}
