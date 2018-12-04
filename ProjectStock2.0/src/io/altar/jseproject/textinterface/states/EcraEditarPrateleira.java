package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.service.ShelfControler;

public class EcraEditarPrateleira implements State {

	@Override
	public int execute() {
		System.out.println(" Editar prateleira:");
		
		Long id=scannerUtils.getValidLongFromScanner(" Insira o id de uma prateleira",ShelfControler.getAllShelvesIds(),false);
	
		
	

		return 0;
	}

}
