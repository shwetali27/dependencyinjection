package com.ugtworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ugtworld.utility.Utility;

@Service
public class FieldInjection {
	@Autowired
	private Utility utility;
	
	public void callDemoConnect() {
		utility.demoConnect();
	}
}
