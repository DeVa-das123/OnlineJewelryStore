package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orid")
	private Integer orderId;

	@Column(name = "orstaus",length=20)
	private String orderStatus;
	
	@Column(name = "total")
	private Double total;

	@Column(name = "paymentmode",length=20)
	private String paymentMode;

	@Column(name = "paymentstatus",length=20)
	private String paymentStatus;

	@Column(name = "orderdate")
	private LocalDate orderDate;

	@ManyToOne 
	@JoinColumn(name = "pid", nullable = false)
	private Product selectedProductId;
	

	public Order() {
		super();
	}

	public Order(Integer orderId, String orderStatus, Double total, String paymentMode, String paymentStatus,
			LocalDate orderDate, Product selectedProductId) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.total = total;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.orderDate = orderDate;
		this.selectedProductId = selectedProductId;
	}

	public Order(String orderStatus, Double total, String paymentMode, String paymentStatus, LocalDate orderDate,
			Product selectedProductId) {
		super();
		this.orderStatus = orderStatus;
		this.total = total;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.orderDate = orderDate;
		this.selectedProductId = selectedProductId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Product getSelectedProductId() {
		return selectedProductId;
	}

	public void setSelectedProductId(Product selectedProductId) {
		this.selectedProductId = selectedProductId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderStatus=" + orderStatus + ", total=" + total + ", paymentMode="
				+ paymentMode + ", paymentStatus=" + paymentStatus + ", orderDate=" + orderDate + ", selectedProductId="
				+ selectedProductId + "]";
	}
	
	
	

}
