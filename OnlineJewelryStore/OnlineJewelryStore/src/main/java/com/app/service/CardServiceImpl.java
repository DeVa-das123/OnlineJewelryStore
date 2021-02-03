package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICardDao;
import com.app.pojos.Card;

@Service
@Transactional
public class CardServiceImpl implements ICardService {

	@Autowired
	private ICardDao dao;
	
	@Override
	public String saveCardDetails(Card newCard) {
		
		return dao.saveCardDetails(newCard);
	}

}
