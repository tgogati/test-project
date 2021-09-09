package com.sap.ccos.voucher.administration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Controller
@SecurityRequirement(name = "ccosapi")
@RequestMapping("/user")
public class UserResourceController {
	

	

	
	@RequestMapping("/test")
	public String test_user()
	{
		return "You are logged in as user";
	}

}
