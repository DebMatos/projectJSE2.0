package io.altar.jseproject.textinterface.states;

import java.util.ArrayList;
import java.util.Iterator;

import io.altar.jseproject.service.ProductControler;
import io.altar.jseproject.service.ShelfControler;

public class MenuListarPrateleiras implements State {

	@Override
	public int execute() {

		int[] opcoes;
		if (ProductControler.isEmpty()) {
			System.out.println("-------------------------------------------");
			System.out.println("         Prateleiras");
			System.out.println("");
			System.out.println("1) Criar nova prateleira");
			System.out.println("5) Voltar ao ecra anterior");
			System.out.println("-------------------------------------------");
			opcoes = new int[] { 1, 5 };
			return scannerUtils.getValidIntFromScanner("Por favor selecione uma das opcoes", opcoes);
		} else {
			allShelves();
			System.out.println("-------------------------------------------");
			System.out.println("           Prateleiras");
			System.out.println("");
			System.out.println("1) Criar nova prateleira");
			System.out.println("2) Editar prateleira existente");
			System.out.println("3) Consultar detalhe de uma prateleira");
			System.out.println("4) Remover uma prateleira");
			System.out.println("5) Voltar ao ecra anterior");
			System.out.println("-------------------------------------------");
			opcoes = new int[] { 1, 2, 3, 4, 5 };
			return scannerUtils.getValidIntFromScanner("Por favor selecione uma das opcoes", opcoes);
		}
	}
	
public void allShelves() {
		
		ArrayList prateleiras=ShelfControler.getAllShelves();
		 Iterator<String> it = prateleiras.iterator();
		    while (it.hasNext()) {
			
				System.out.println(it.next().toString());
			}
		}
	
	
}
