package com.vivek.cartserviceminiproject.utilities;

import java.util.Scanner;

import com.vivek.cartserviceminiproject.entities.Cart;
import com.vivek.cartserviceminiproject.entities.ElectronicProduct;
import com.vivek.cartserviceminiproject.entities.Product;
import com.vivek.cartserviceminiproject.services.CartService;
import com.vivek.cartserviceminiproject.services.CartServiceImp;

public class CartUtilityImp implements CartUtility {

	private Cart cart;
	private Product product;
	private CartService service = new CartServiceImp();

	public CartUtilityImp(Cart cart, Product product) {
		this.cart = cart;
		this.product = product;
	}

	@Override
	public void add(Scanner scanner) {
		if (product.getProductList().isEmpty())
			System.out.println("Products are out of Stock..");
		else {
			printProductList(product);
			System.out.println("Add product to Cart");
			System.out.println("Enter a Sr.No. add a Product to cart");
			int index = scanner.nextInt();
//			cart.getCartProduct().add();
			System.out.println(service.add(cart, product,index));
		}
	}

	private void printProductList(Product product) {
		int i = 0;
		for (ElectronicProduct eproduct : product.getProductList()) {
			System.out.println((++i) + ") " + eproduct);
		}
	}

	@Override
	public void delete(Scanner scanner) {
		print();
		System.out.println("Enter a Sr.No. to delete a product from cart");
		int index = scanner.nextInt();
//		cart.getCartProduct().remove(index - 1);
//		System.out.println("Product deleted from cart successfully");
		System.out.println(service.delete(cart, index));
	}

	@Override
	public void update(Scanner scanner) {
		delete(scanner);
	}

	@Override
	public void print() {
		int i = 0;
		System.out.println("Cart list");
		for (ElectronicProduct eproduct : cart.getCartProduct()) {
			System.out.println((++i) + ") " + eproduct);
		}
	}

	@Override
	public int printMenu(Scanner scanner) {
		System.out.println("Cart Menu");
		System.out.println("	1.Add");
		System.out.println("	2.Edit");
		System.out.println("	3.Remove");
		System.out.println("	4.Print");
		System.out.println("	0.exit");
		return scanner.nextInt();
	}

	@Override
	public void manipulateCart(Scanner scanner) {
		int choice = 0;
		do {
			choice = printMenu(scanner);
			switch (choice) {
			case 1 -> add(scanner);
			case 2 -> delete(scanner);
			case 3 -> update(scanner);
			case 4 -> print();
			case 0 -> System.out.println("Bye.. Bye..");
			default -> System.out.println("Invalid Input");
			}
		} while (choice != 0);
	}

}