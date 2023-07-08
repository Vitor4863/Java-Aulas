package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		System.out.println();
		System.out.println("Product data: " );
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
	     int quantity = sc.nextInt();
		Product product = new Product(name , price , quantity);
		product.setName("Computer");
		System.out.println("Updated "+ product.getName());
		
		product.setPrice(200);
		System.out.println("Updated " + product.getPrice());
		product.setQuantity(14);
		System.out.println("Updated " + product.getQuantity());
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}