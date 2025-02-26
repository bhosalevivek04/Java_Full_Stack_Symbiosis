package com.vivek.cartserviceminiproject.services;

import com.vivek.cartserviceminiproject.entities.Cart;
import com.vivek.cartserviceminiproject.entities.Product;

public interface CartService {
	String add(Cart cart,Product product,int index);
	String delete(Cart cart,int index);
	
}
