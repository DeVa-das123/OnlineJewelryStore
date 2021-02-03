package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cards")
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for auto increamentation
	@Column(name = "cardid")
	private Integer cardId;
	@Column(name = "cardno")
	private Integer cardNo;
	@Column(name = "name")
	private String cardHolderName;
	@Column(name = "cvv")
	private Integer cvv;
	public Card() {
		super();
	}
	public Card(Integer cardNo, String cardHolderName, Integer cvv) {
		super();
		this.cardNo = cardNo;
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
	}
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Integer getCardNo() {
		return cardNo;
	}
	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", cardNo=" + cardNo + ", cardHolderName=" + cardHolderName + ", cvv=" + cvv
				+ "]";
	}
	
	
	
}
