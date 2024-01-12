package com.ugtworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ugtworld.utility.Utility;

@Service
public class ConstructorInjection {
	private Utility utility;
	
	@Autowired
	private ConstructorInjection(Utility utility) {
		this.utility = utility;
	}
	
	public void callDemoConnect() {
		utility.demoConnect();
	}
}


