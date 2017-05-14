package lista;

public class ListaDuplamenteEncadeada {
	private NodoDuplo inicio = null, fim = null, aux = null;
	
	public void inserirInicio(int num){
		NodoDuplo novo = new NodoDuplo();
		novo.num = num;
		
		if (inicio == null){
			//Vazia, inicio e fim recebem o elemento
			inicio = novo;
			fim = novo;
			novo.prox = null;
			novo.ant = null;
		} else {
			//A lista contém elementos, e o novo elemento será inserido no inicio da lista
			novo.prox = inicio;
			inicio.ant=novo;
			novo.ant=null;
			inicio = novo;
		}
		System.out.println("Valor inserido com sucesso! ");
	}
	
	public void mostraLista(){
		if (inicio == null){
			System.out.println("Lista Vazia!");
		} else {
			System.out.println("Mostrando toda a lista:");
			aux = inicio;
			while(aux != null){
				System.out.println("Num: "+aux.num+";\n");
				aux =  aux.prox;
			}
		}
	}
	
	public void inserirFim(int num){
		NodoDuplo novo = new NodoDuplo();
		novo.num = num;
		
		if (inicio == null){
			//Vazia, inicio e fim recebem o elemento
			inicio = novo;
			fim = novo;
			novo.prox = null;
			novo.ant = null;
		} else {
			//A lista contém elementos, e o novo elemento será inserido no fim da lista
			fim.prox = novo;
			novo.ant = fim;
			novo.prox = null;
			fim = novo;
		}
		System.out.println("Iserido com sucesso!!");
	}
	
	public void removerNodo(int num){
		int ocorrencias = 0;
		if(inicio == null){
			System.out.println("Lista Vazia");
		} else {
			aux = inicio;
			while (aux != null) {
				if (aux.num == num){
					ocorrencias++;
					if(aux == inicio){
						inicio =  aux.prox;
						if(inicio != null){
							inicio.ant = null;
						}
						inicio.ant = null;
						aux = inicio;
					} else if(aux == fim){
						fim = fim.ant;
						fim.prox = null;
						aux = null;
					} else {
						aux.ant.prox = aux.prox;
						aux.prox.ant = aux.ant;
						aux.ant = null;
						aux =  aux.prox;
					}
				} else {
					aux = aux.prox;
				}
			}
		}
		if (ocorrencias == 0){
			System.out.println("Número não encontrado.");
		} else {
			System.out.println("Removidos "+ocorrencias+" números "+num+".");
		}
	}
}