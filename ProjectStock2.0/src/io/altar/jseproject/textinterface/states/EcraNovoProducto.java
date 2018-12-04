package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.service.ProductControler;
import io.altar.jseproject.service.ShelfControler;

public class EcraNovoProducto implements State {

	@Override
	public int execute() {
		if(ShelfControler.isEmpty()) {
		System.out.println("-------------------------------------------");
		System.out.println("              Novo produto:");
		double pvp=scannerUtils.getDoubleFromScanner("PVP", true);
		double [] ivas= {23.0,16.0,6.0};
		double iva= scannerUtils.getValidDoubleFromScanner("Iva" , ivas, true);
		double discountValue= scannerUtils.getValidDoubleFromScanner("Desconto" , 100, true);
		System.out.println("-------------------------------------------");
		ProductControler.createProduct(discountValue, iva, pvp);}
		else {
			System.out.println("-------------------------------------------");
			System.out.println("              Novo produto:");
			double pvp=scannerUtils.getDoubleFromScanner("PVP", true);
			double [] ivas= {23.0,16.0,6.0};
			double iva= scannerUtils.getValidDoubleFromScanner("Iva" , ivas, true);
			double discountValue= scannerUtils.getValidDoubleFromScanner("Desconto" , 100, true);
			Long id=scannerUtils.getValidLongFromScanner("Id da prateleira", ProductControler.allShelvesIds(), true);
			ProductControler.createProductWhithShelf( discountValue, iva, pvp, id);
			System.out.println("-------------------------------------------");
		}
		return 1;
	}

}
