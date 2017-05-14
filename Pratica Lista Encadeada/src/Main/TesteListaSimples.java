package Main;

import lista.ListaSimples;

public class TesteListaSimples {

	public static void main(String[] args) {
		ListaSimples l = new ListaSimples();
		
		for (int i = 1; i<10; i++){
			l.inserirInicio(i*2);
		}
		
		l.mostraLista();
		
		ListaSimples l1 = new ListaSimples();
		
		for (int i = 1; i<10; i++){
			l1.inserirFim(i*2);
		}
		
		l1.mostraLista();
		
		l.removerNodo(4);
		l.mostraLista();
		
		if (l.contarNodos()!=0){
			System.out.println("Total de nodos: "+l.contarNodos());
		} else {
			System.out.println("Lista Vazia!");
		}
		
		System.out.println("Altura a partir do terceiro = "+l.calculaAltura(3));
	}
}
