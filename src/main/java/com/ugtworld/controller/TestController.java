package com.ugtworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ugtworld.service.ConstructorInjection;
import com.ugtworld.service.FieldInjection;
import com.ugtworld.service.SetterInjection;

@RestController
public class TestController {
	
	// Constructor Injection
	private ConstructorInjection constructorInjection;
	@Autowired
	public TestController(ConstructorInjection constructorInjection) {
		this.constructorInjection = constructorInjection;
	}

	// setter injection
	private SetterInjection setterInjection;
	@Autowired
	public void setSetterInjection(SetterInjection setterInjection) {
		this.setterInjection = setterInjection;
	}

	// field injection
	@Autowired
	private FieldInjection fieldInjection;

	@GetMapping("/testConstructorInjection")
	public void testConstructorInjection() {
		constructorInjection.callDemoConnect();
	}

	@GetMapping("/testSetterInjection")
	public void testSetterInjection() {
		setterInjection.callDemoConnect();
	}

	@GetMapping("/testFieldInjection")
	public void testFieldInjection() {
		fieldInjection.callDemoConnect();
	}
}
