package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> listaProdutos = new ArrayList<>();

		listaProdutos.add(new Product("tv", 900.00));
		listaProdutos.add(new Product("Mouse", 50.00));
		listaProdutos.add(new Product("Tablet", 350.50));
		listaProdutos.add(new Product("HD case", 80.90));

		// Reference Method com metodo estatico
		listaProdutos.removeIf(Product::staticProductPredicate);
		for (Product p : listaProdutos) {
			System.out.println(p);
		}

	}

}
