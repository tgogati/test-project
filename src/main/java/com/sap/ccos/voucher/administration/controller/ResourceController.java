package com.sap.ccos.voucher.administration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "ccosapi")
@RequestMapping("/administration")
public class ResourceController {
	

	
	@RequestMapping("/test")
	public String test_admin()
	{
		return "You are logged in as admin";
	}
	


}
