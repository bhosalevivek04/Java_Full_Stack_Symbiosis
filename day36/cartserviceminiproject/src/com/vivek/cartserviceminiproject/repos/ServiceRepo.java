package com.vivek.cartserviceminiproject.repos;

import com.vivek.cartserviceminiproject.entities.Cart;
import com.vivek.cartserviceminiproject.entities.ElectronicProduct;

public interface ServiceRepo {
	String add(Cart cart, ElectronicProduct eProduct);

	String delete(Cart cart, int index);

}
