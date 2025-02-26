package com.vivek.cartserviceminiproject.services;

import com.vivek.cartserviceminiproject.entities.ElectronicProduct;
import com.vivek.cartserviceminiproject.entities.Product;
import com.vivek.cartserviceminiproject.repos.ProductRepo;
import com.vivek.cartserviceminiproject.repos.ProductRepoImp;

public class ProductServiceImp implements ProductService {

	private final ProductRepo repo = new ProductRepoImp();

	@Override
	public String add(Product product, ElectronicProduct eProduct) {
		if (validateEProduct(eProduct)) {
			if (product.getProductList() == null) {
				return "Product list is not initialized!";
			}
			return repo.add(product, eProduct);
		}
		return "Invalid input from user";
	}

	@Override
	public String delete(Product product, int index) {
		if (product.getProductList() == null || product.getProductList().isEmpty()) {
			return "Product list is empty!";
		}
		if (index >= 0 && index < product.getProductList().size()) {
			return repo.delete(product, index);
		}
		return "Invalid Sr.No Entered by user";
	}

	@Override
	public String update(Product product, ElectronicProduct eProduct, int index) {
		if (product.getProductList() == null || product.getProductList().isEmpty()) {
			return "Product list is empty!";
		}
		if (index >= 0 && index < product.getProductList().size()) {
			if (validateEProduct(eProduct)) {
				return repo.update(product, eProduct, index);
			}
			return "Invalid input from user";
		}
		return "Invalid Sr.No Entered by user";
	}

	private boolean validateEProduct(ElectronicProduct eProduct) {
		return eProduct.getId() > 0 && eProduct.getName().matches("[A-Z][a-zA-Z ]*")
				&& eProduct.getBrand().matches("[A-Z][a-zA-Z ]*") && eProduct.getPrice() > 0;
	}
}
