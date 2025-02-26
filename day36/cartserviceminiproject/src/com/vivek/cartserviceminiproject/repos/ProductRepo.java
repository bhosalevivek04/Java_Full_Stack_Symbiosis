package com.vivek.cartserviceminiproject.repos;

import com.vivek.cartserviceminiproject.entities.ElectronicProduct;
import com.vivek.cartserviceminiproject.entities.Product;

public interface ProductRepo {
	String add(Product product, ElectronicProduct eProduct);

	String delete(Product product, int index);

	String update(Product product, ElectronicProduct eProduct, int index);

}
