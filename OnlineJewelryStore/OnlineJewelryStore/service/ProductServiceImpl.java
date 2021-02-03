package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IProductDao;
import com.app.pojos.Order;
import com.app.pojos.Product;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {


	@Autowired
	private IProductDao dao;
	
	@Override
	public String addProduct(Product newProduct) {
		
		return dao.addProduct(newProduct);
	}

	@Override
	public List<Product> getAllProducts() {
	
		return dao.getAllProducts();
	}

	@Override
	public String deleteProduct(int propductId) {
		
		return dao.deleteProduct(propductId);
	}

	@Override
	public Product getProductById(int propductId) {
		
		return dao.getProductById(propductId);
	}

	@Override
	public Product updateProduct(Product p) {
		
		return dao.updateProduct(p);
	}

	@Override
	public String placeOrder(Order newOrder) {
		
		return dao.placeOrder(newOrder);
	}
	
	
	
	
}
