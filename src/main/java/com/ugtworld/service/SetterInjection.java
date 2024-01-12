package com.ugtworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ugtworld.utility.Utility;

@Service
public class SetterInjection {
	private Utility utility;
	
	@Autowired
	private void setUtility(Utility utility) {
		this.utility = utility;
	}
	
	public void callDemoConnect() {
		utility.demoConnect();
	}
}
