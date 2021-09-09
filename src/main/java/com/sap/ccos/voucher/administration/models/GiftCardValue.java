package com.sap.ccos.voucher.administration.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;





@Entity
@Table(name="giftcradvalue")
@Getter @Setter @NoArgsConstructor
@Component
public class GiftCardValue {

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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<GiftCardTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<GiftCardTransaction> transactions) {
		this.transactions = transactions;
	}

	public Date getUpdationDate() {
		return updationDate;
	}

	public void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;

	@Column
	public String giftCardId;

	@Column
	public String giftCardCode;

	@Column
	public int amount;

	@Column
	public Date creationDate;

	@OneToMany
	List<GiftCardTransaction> transactions;
	
	@Column
	public Date updationDate;


}
