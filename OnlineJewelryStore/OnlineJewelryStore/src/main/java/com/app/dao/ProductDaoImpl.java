package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.app.pojos.Order;
import com.app.pojos.Product;

@Repository
public class ProductDaoImpl implements IProductDao {
	@PersistenceContext
	private EntityManager mgr;

	@Override
	public List<Order> getAllOrders() {
		String jpql = "select o from Order o";
		return mgr.createQuery(jpql, Order.class).getResultList();
		
		//return null;
	}

	@Override
	public String addProduct(Product newProduct) {
		String msg = "Product added";
		System.out.println("Product" + newProduct);
		mgr.persist(newProduct);
		return msg;
	}

	@Override
	public List<Product> getAllProducts() {
		String jpql = "select p from Product p";
		return mgr.createQuery(jpql, Product.class).getResultList();
	}

	@Override
	public String deleteProduct(int propductId) {
		String mesg = "product deletion failed";

		Product p = mgr.find(Product.class, propductId);
		if (p != null) {
			mgr.remove(p);
			mesg = "product deleted successfully";
		}
		return mesg;
	}

	@Override
	public Product getProductById(int propductId) {

		return mgr.find(Product.class, propductId);
	}

	@Override
	public Product updateProduct(Product p) {

		System.out.println("in " + getClass().getName() + p);
		Product updateProduct = mgr.find(Product.class, p.getProductId());
		System.out.println("old product " + updateProduct);
		updateProduct.setProductName(p.getProductName());
		updateProduct.setProductDescription(p.getProductDescription());
		updateProduct.setProductPrice(p.getProductPrice());
		updateProduct.setProductImageUrl(p.getProductImageUrl());
		Product p1 = mgr.merge(updateProduct);
		System.out.println("updated product " + p1);
		return p1;

	}

	@Override
	public String placeOrder(Order newOrder) {

		String msg = "Order placed";
		System.out.println("order is " + newOrder);
		mgr.persist(newOrder);

		return msg;
	}

}
