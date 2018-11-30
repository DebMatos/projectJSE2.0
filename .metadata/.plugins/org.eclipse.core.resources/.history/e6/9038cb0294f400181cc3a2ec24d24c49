package io.altar.jseproject.service;

import java.util.ArrayList;
import java.util.Iterator;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.ProductRepository;

public class ProductControler {

	static ProductRepository productRepository = ProductRepository.getInstance();

	public static boolean isEmpty() {
		if (productRepository.isEmpty()) {
			return true;
		} else
			return false;
	}

	public static String createProduct(double discountValue, double iva, double pvp) {

		Product produto = new Product(discountValue, iva, pvp);
		productRepository.save(produto);
		return produto.toString();
	}

	public static ArrayList<String> getAllProducts() {

		ArrayList<String> produtos = new ArrayList<String>();
		Iterator<Product> it = productRepository.getAll();
		while (it.hasNext()) {
			String produto = it.next().toString();
			produtos.add(produto);
		}
		return produtos;
	}
}
