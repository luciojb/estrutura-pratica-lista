package Main;

import lista.ListaDuplamenteEncadeadaCircular;

public class TesteListaDuplaCircular {
	public static void main(String[] args) {
		ListaDuplamenteEncadeadaCircular l = new ListaDuplamenteEncadeadaCircular();
		
		for (int i = 1; i<10; i++){
			l.inserirInicio(i*2);
		}
		
		l.mostraLista();
		
		ListaDuplamenteEncadeadaCircular l1 = new ListaDuplamenteEncadeadaCircular();
		
		for (int i = 1; i<10; i++){
			l1.inserirFim(i*2);
		}
		
		l1.mostraLista();
		
		l.removerNodo(4);
		l.removerNodo(2);
		l.removerNodo(18);
		l.mostraLista();
		
		l1.removerNodo(4);
		l1.removerNodo(2);
		l1.removerNodo(18);
		l1.mostraLista();
		
		
		ListaDuplamenteEncadeadaCircular l2 = new ListaDuplamenteEncadeadaCircular();
		System.out.println("\n\nLISTA 2 : \n\n");
		l2.inserirFim(1);
		l2.inserirFim(1);
		l2.inserirFim(1);
		l2.inserirFim(1);
		l2.inserirFim(1);
		l2.inserirFim(1);
		l2.inserirFim(1);
		l2.inserirFim(1);
		l2.inserirFim(1);
		l2.inserirFim(1);
		
		l2.inserirFim(2);
		l2.inserirFim(3);
		l2.inserirFim(4);
		l2.inserirFim(5);
		
		l2.mostraLista();
		
		System.out.println("Total = "+l2.contarNodos());
		
		int maior = l2.retornaMaiorNodo();
		if(maior!=0)
			System.out.println("Maior nodo = "+maior);
		
		l2.removerNodo(1);
		l2.removerNodo(5);
		l2.removerNodo(3);
		
		System.out.println("Lista Depois da Remoção: ");
		l2.mostraLista();
		
		System.out.println("HAHAHAHAHA");
		maior = l2.retornaMaiorNodo();
		
		if(maior!=0)
			System.out.println("Maior nodo = "+maior);
		
		
		
	}
}
