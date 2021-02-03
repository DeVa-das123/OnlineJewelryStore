package com.app.dao;

import java.util.List;

import com.app.pojos.Order;
import com.app.pojos.Product;

public interface IProductDao {
    String addProduct(Product newProduct);
    List<Product> getAllProducts();
    String deleteProduct(int propductId);
    Product getProductById(int propductId);
    Product updateProduct(Product p);
    String placeOrder(Order newOrder);
List<Order> getAllOrders();
    
    
    
    
    
    
}
