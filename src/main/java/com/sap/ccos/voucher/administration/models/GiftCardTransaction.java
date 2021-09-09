package com.sap.ccos.voucher.administration.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="giftcardtransaction")
@Component
public class GiftCardTransaction {

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getGiftCardId() {
		return giftCardId;
	}


	public void setGiftCardId(String giftCardId) {
		this.giftCardId = giftCardId;
	}


	public String getGiftCardCode() {
		return giftCardCode;
	}


	public void setGiftCardCode(String giftCardCode) {
		this.giftCardCode = giftCardCode;
	}


	public GiftCardValue getGiftcard() {
		return giftcard;
	}


	public void setGiftcard(GiftCardValue giftcard) {
		this.giftcard = giftcard;
	}


	public int getTransactionAmount() {
		return transactionAmount;
	}


	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}


	public Boolean getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(Boolean transactionType) {
		this.transactionType = transactionType;
	}


	public Date getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	

	@Column
	public String giftCardId;
	 
	@Column
	public String giftCardCode;
	
	@ManyToOne
	GiftCardValue giftcard;	
	
	@Column
	public int transactionAmount;
	
	@Column
	public Boolean transactionType;
	
	@Column
	public Date transactionDate;

}
