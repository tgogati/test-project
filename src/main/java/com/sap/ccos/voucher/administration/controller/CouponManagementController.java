package com.sap.ccos.voucher.administration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sap.ccos.voucher.administration.models.GiftCardValue;
import com.sap.ccos.voucher.administration.repo.GiftCardValueRepo;
import com.sap.ccos.voucher.administration.service.GiftCardTransactionService;

@Controller
public class CouponManagementController {
	
	@Autowired
	 GiftCardValueRepo giftCardRepo;
	
	@Autowired
	 GiftCardTransactionService giftCardTransactionService;

	@GetMapping("/createCoupon")
	public String createCoupon( ) {
		
	return "CreateVoucher";
	
	}
	
	@PostMapping("/createCoupon")
	public String saveVoucher(@RequestBody GiftCardValue giftCard) {
		
		
		
		return "CreateConfirmation";
		
	}
	

}
