package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.service.ShelfControler;

public class EcraNovaPrateleira implements State {

	@Override
	public int execute() {
		if(ShelfControler.isEmpty()) {
			System.out.println("-------------------------------------------");
			System.out.println("              Nova prateleira:");
			String capacity=scannerUtils.getStringFromScanner("Capacidade",false);
			double rentPrice=scannerUtils.getDoubleFromScanner("Preco aluguer/dia", false);
			System.out.println("-------------------------------------------");
			ShelfControler.createShelf(capacity, rentPrice);
		return 1;
	}else {
		System.out.println("-------------------------------------------");
		System.out.println("              Nova prateleira:");
		String capacity=scannerUtils.getStringFromScanner("Capacidade",false);
		double rentPrice=scannerUtils.getDoubleFromScanner("Preco aluguer/dia", false);
		System.out.println("-------------------------------------------");
		return 1;
	}
	}

}

	
//	private String capacity;
//	private Long productId;
//	private double rentPrice;