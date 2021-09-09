package com.sap.ccos.voucher.administration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sap.ccos.voucher.administration.models.GiftCardTransaction;
import com.sap.ccos.voucher.administration.repo.GiftCardTransactionRepo;

@Component
@Service
public class GiftCardTransactionService {

	
	@Autowired
	GiftCardTransactionRepo transactionrepo;
	
public void SaveTransaction(GiftCardTransaction transaction) {
	
	transactionrepo.save(transaction);
	
}

}
