package Main;

import lista.ListaDuplamenteEncadeada;

public class TesteListaDupla {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
		
		for (int i = 1; i<10; i++){
			l.inserirInicio(i*2);
		}
		
		l.mostraLista();
		
		ListaDuplamenteEncadeada l1 = new ListaDuplamenteEncadeada();
		
		for (int i = 1; i<10; i++){
			l1.inserirFim(i*2);
		}
		
		l1.mostraLista();
		
		l.removerNodo(4);
		l.mostraLista();
		
		l1.removerNodo(8);
		l1.mostraLista();
	}

}
