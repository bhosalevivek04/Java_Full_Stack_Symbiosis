package com.vivek.cartserviceminiproject.services;

import com.vivek.cartserviceminiproject.entities.Cart;
import com.vivek.cartserviceminiproject.entities.Product;
import com.vivek.cartserviceminiproject.repos.ServiceRepo;
import com.vivek.cartserviceminiproject.repos.ServiceRepoImp;

public class CartServiceImp implements CartService {
	ServiceRepo repo = new ServiceRepoImp();

	@Override
	public String add(Cart cart, Product product, int index) {
		if (index > 0 && index <= product.getProductList().size()) {
			return repo.add(cart, product.getProductList().get(index - 1));
		} else {
			return "Invalid Sr.No entered by user";
		}

	}

	@Override
	public String delete(Cart cart, int index) {
		if (index > 0 && index <= cart.getCartProduct().size()) {
			return repo.delete(cart, index);
		} else {
			return "Invalid Sr No.";
		}
	}

}
