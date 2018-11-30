package io.altar.jseproject.textinterface.states;

public class MenuInicial implements State {

	@Override
	public int execute() {
		System.out.println("-------------------------------------------");
		System.out.println("              Menu inicial");
		System.out.println("");
		System.out.println("1) Listar produtos");
		System.out.println("2) Listar prateleiras");
		System.out.println("3) Sair");
		System.out.println("-------------------------------------------");
		int[] opcoes={1,2,3};
		return scannerUtils.getValidIntFromScanner("Por favor selecione uma das opcoes ", opcoes);
	}

}
