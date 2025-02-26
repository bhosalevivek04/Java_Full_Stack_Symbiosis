package com.vivek.cartserviceminiproject.repos;

import com.vivek.cartserviceminiproject.entities.ElectronicProduct;
import com.vivek.cartserviceminiproject.entities.Product;

public class ProductRepoImp implements ProductRepo {

	@Override
	public String add(Product product, ElectronicProduct eProduct) {
		product.getProductList().add(eProduct);
		return "Product added successfully";
	}

	@Override
	public String delete(Product product, int index) {
		product.getProductList().remove(index);
		return "Product removed successfully";
	}

	@Override
	public String update(Product product, ElectronicProduct eProduct, int index) {
		product.getProductList().set(index, eProduct);
		return "Product updated successfully";
	}
}
