package com.sap.ccos.voucher.administration.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sap.ccos.voucher.administration.models.GiftCardTransaction;
import com.sap.ccos.voucher.administration.models.GiftCardValue;
import com.sap.ccos.voucher.administration.repo.GiftCardTransactionRepo;
import com.sap.ccos.voucher.administration.repo.GiftCardValueRepo;

@Component
@Service
public class GiftCardValueService {
	
	@Autowired
	GiftCardValueRepo giftCardRepo;
	
	@Autowired
	GiftCardTransactionRepo giftCardTransactionrepo;
	
	@Autowired(required=true)
	GiftCardTransaction giftCardTransaction;
	
	@Autowired
	GiftCardTransactionService giftCardTransactionService;

public String saveGiftCard(GiftCardValue giftcard) {
	
	try {
		giftCardRepo.save(giftcard);
		
		GiftCardTransaction transaction = new GiftCardTransaction();
		
		transaction.setTransactionAmount(giftcard.getAmount());
		transaction.setTransactionDate(new Date());
		transaction.setGiftCardId(giftcard.giftCardId);
		transaction.setGiftCardCode(giftcard.giftCardCode);
		
		giftCardTransactionService.SaveTransaction(transaction);
	}
	catch(Exception e) {
		
	}
	return "";
	
	
}

}
