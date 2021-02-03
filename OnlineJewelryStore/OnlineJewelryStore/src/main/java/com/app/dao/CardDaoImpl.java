package com.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.app.pojos.Card;

@Repository
public class CardDaoImpl implements ICardDao {

	@PersistenceContext
	private EntityManager mgr;

	@Override
	public String saveCardDetails(Card newCard) {
		
		String msg = "saved sucessfully";
		mgr.persist(newCard);
		return msg;

	}

}
