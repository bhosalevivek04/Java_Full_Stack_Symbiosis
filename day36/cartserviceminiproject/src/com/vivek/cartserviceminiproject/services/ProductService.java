package com.vivek.cartserviceminiproject.services;

import com.vivek.cartserviceminiproject.entities.ElectronicProduct;
import com.vivek.cartserviceminiproject.entities.Product;

public interface ProductService {
	String add(Product product, ElectronicProduct eproduct);

	String delete(Product product, int index);
	
	String update(Product product,ElectronicProduct eproduct,int index);
	
	

}
