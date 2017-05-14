package Main;

import lista.ListaCircular;
public class TesteListaCircular {

	public static void main(String[] args) {
		ListaCircular l = new ListaCircular();
		
		for (int i = 1; i<10; i++){
			l.inserirInicio(i*2);
		}
		
		l.mostraLista();
		
		ListaCircular l1 = new ListaCircular();
		
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
		
	}

}
