package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for auto increamentation
	@Column(name = "prid")
	private Integer productId;
	@Column(name = "prname", length = 30)
	private String productName;
	@Column(name = "prdescription", length = 100)
	private String productDescription;
	@Column(name = "prprice")
	private double productPrice;
	@Column(name = "primageurl", length = 200)
	private String productImageUrl;
	@Column(name = "prcategory",length = 30)
	private String category;
	
	@OneToMany(mappedBy = "selectedProductId",cascade = CascadeType.ALL)
	private List<Order> orders=new ArrayList<Order>();
	
	public Product() {
		super();
	}

	public Product(String productName, 
			String productDescription, 
			double productPrice, String productImageUrl,String category) {//Category selectedCategory
		super();
		System.out.println("In product");
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productImageUrl = productImageUrl;
		this.category=category;
	}
	public Product(Integer productId,String productName, 
			String productDescription, double productPrice, String productImageUrl,String category) {//Category selectedCategory
		super();
		System.out.println("In product");
		this.productId=productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productImageUrl = productImageUrl;
		this.category=category;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	//helper method
	public void addOrder(Order o) {	
	//	p-->c
		orders.add(o);
	//c-->p
		//s.setSelectedCourse(this);
	//	o.setSelectedProductId(this);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productImageUrl=" + productImageUrl
				+ ", category=" + category + ", orders=" + orders + "]";
	}





}
