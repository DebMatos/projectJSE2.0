package io.altar.jseproject.service;

import io.altar.jseproject.repositories.ProductRepository;

public class ProductControler {

	static ProductRepository productRepository = ProductRepository.getInstance();

	public static boolean isEmpty() {
		if (productRepository.isEmpty()) {
			return true;
		} else
			return false;

	}

}
