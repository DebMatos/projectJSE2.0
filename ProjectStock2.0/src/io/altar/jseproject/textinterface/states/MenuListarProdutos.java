package io.altar.jseproject.textinterface.states;


import io.altar.jseproject.service.ProductControler;

public class MenuListarProdutos implements State {

	
	
	@Override
	public int execute() {
		int[] opcoes;
		if(ProductControler.isEmpty()){
			System.out.println("Por favor selecione uma das seguintes opcoes:");
			System.out.println("1) Criar novo produto");
			System.out.println("5) Voltar ao ecra anterior");
			 opcoes = new int[]{1,5};
			 return scannerUtils.getValidIntFromScanner("Por favor selecione uma das seguintes opcoes:", opcoes);
		}else{
		
		System.out.println("Por favor selecione uma das seguintes opcoes:");
		System.out.println("1) Criar novo produto");
		System.out.println("2) Editar produto existente");
		System.out.println("3) Consultar detalhe de um produto");
		System.out.println("4) Remover um produto");
		System.out.println("5) Voltar ao ecra anterior");
		opcoes= new int[]{1,2,3,4,5};
		return scannerUtils.getValidIntFromScanner("Por favor selecione uma das seguintes opcoes:", opcoes);}
	}

}
