package io.altar.jseproject.textinterface.stateMachine;

import io.altar.jseproject.textinterface.states.EcraNovaPrateleira;
import io.altar.jseproject.textinterface.states.EcraNovoProducto;
import io.altar.jseproject.textinterface.states.MenuInicial;
import io.altar.jseproject.textinterface.states.MenuListarPrateleiras;
import io.altar.jseproject.textinterface.states.MenuListarProdutos;
import io.altar.jseproject.textinterface.states.State;

	public class StateMachine {

		public static void main(String[] args) {
	StateMachine fsm= new StateMachine();
	int opcao=0;

	while(true){
		opcao=fsm.states[fsm.currentState].execute();
		fsm.currentState=fsm.transitionMatrix[fsm.currentState][opcao-1];
		
		if(fsm.currentState==0&& opcao==3){
			break;}
	}
		}

		public State[] states = { new MenuInicial(),  //0
								new MenuListarProdutos(), //1
								new MenuListarPrateleiras(), //2
								new EcraNovoProducto(),//3
								new EcraNovaPrateleira()}; //4

		private int transitionMatrix[][] = {{1, 2 },       //0
											{3,1,1,1,0 },   //1  Produtos
											{4,2,2,2,0 },   //2  Prateleiras
											{1},			 //3 Novo produto
											{2}  			 //4 Nova prateleira
											}; 

		private int currentState = 0;
	}


