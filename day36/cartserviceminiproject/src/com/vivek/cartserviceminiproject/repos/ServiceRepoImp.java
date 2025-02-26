package com.vivek.cartserviceminiproject.repos;

import com.vivek.cartserviceminiproject.entities.Cart;
import com.vivek.cartserviceminiproject.entities.ElectronicProduct;

public class ServiceRepoImp implements ServiceRepo {

	@Override
	public String add(Cart cart, ElectronicProduct eProduct) {
		cart.getCartProduct().add(eProduct);
		return "product added to cart successfully";
	}

	@Override
	public String delete(Cart cart, int index) {
		cart.getCartProduct().remove(index - 1);
		return "Product deleted from cart successfully";
	}

}
