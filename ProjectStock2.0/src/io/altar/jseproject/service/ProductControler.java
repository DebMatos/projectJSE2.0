package io.altar.jseproject.service;

import java.util.ArrayList;
import java.util.Iterator;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;

public class ProductControler {

	static ProductRepository productRepository = ProductRepository.getInstance();
	static ShelfRepository shelfRepository = ShelfRepository.getInstance();

	public static boolean isEmpty() {
		if (productRepository.isEmpty()) {
			return true;
		} else
			return false;
	}

	public static Product createProduct(double discountValue, double iva, double pvp) {

		Product produto = new Product(discountValue, iva, pvp);
		productRepository.save(produto);
		return produto;
	}
	
	public static Product createProductWhithShelf( double discountValue, double iva, double pvp, Long id) {
		
		ArrayList<Long> shelvesIds = new ArrayList<Long>();
		//shelvesIds=allShelvesIds();
		shelvesIds.add(id);
		Product produto = new Product(shelvesIds, discountValue, iva, pvp);
		productRepository.save(produto);
		
		Shelf shelf = shelfRepository.findById(id);
		
		shelf.setProduct(produto.getId());
		
		return produto;
	}
	
	public boolean hasIdInShelf(Long id) {
		if (shelfRepository.findById(id) == null) {
			return false;
		} else
			return true;
	}

	
	public static ArrayList<Long> allShelvesIds() {
		
			ArrayList<Long> shelvesIds = new ArrayList<Long>();
			Iterator<Shelf> it = shelfRepository.getAll();
			while (it.hasNext()) {
				Long ids = it.next().getId();
				shelvesIds.add(ids);
			}
		
		return shelvesIds;
		
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
