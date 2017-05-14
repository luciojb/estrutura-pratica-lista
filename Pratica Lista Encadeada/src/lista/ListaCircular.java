package lista;

public class ListaCircular {
private Nodo inicio = null, fim = null, aux = null, anterior = null;
	
	public void inserirInicio(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		
		if (inicio == null){
			//Vazia, inicio e fim recebem o elemento
			inicio = novo;
			fim = novo;
			fim.prox = inicio;
		} else {
			//A lista contém elementos, e o novo elemento será inserido no inicio da lista
			novo.prox = inicio;
			inicio = novo;
			fim.prox = inicio;
		}
		System.out.println("Valor inserido com sucesso! ");
	}
	
	public void mostraLista(){
		if (inicio == null){
			System.out.println("Lista Vazia!");
		} else {
			System.out.println("Mostrando toda a lista:");
			aux = inicio;
			do{
				System.out.println("Num: "+aux.num+";\n");
				aux = aux.prox;
			}while(aux != inicio);
		}
	}
	
	
	public void inserirFim(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		
		if (inicio == null){
			//Vazia, inicio e fim recebem o elemento
			inicio = novo;
			fim = novo;
			fim.prox = inicio;
		} else {
			//A lista contém elementos, e o novo elemento será inserido no fim da lista
			
			fim.prox = novo;
			fim = novo;
			fim.prox = inicio;
		}
	}
	
	public void removerNodo(int num){
		int ocorrencias = 0;
		if(inicio == null){
			System.out.println("Lista Vazia");
		} else {
			aux = inicio;
			anterior = null;
			do {
				if (aux.num == num){
					ocorrencias++;
					if (inicio == fim){
						inicio = null;
					}
					if(aux == inicio){
						inicio = aux.prox;
						fim.prox = inicio;
						aux = inicio;
					} else if(aux == fim){
						fim = anterior;
						fim.prox = inicio;
						aux = inicio;
					} else {
						anterior.prox = aux.prox;
						aux = aux.prox;
					}
				} else {
					anterior = aux;
					aux = aux.prox;
				}
			}while (aux != inicio);
		}
		if (ocorrencias == 0){
			System.out.println("Número não encontrado.");
		} else {
			System.out.println("Removidos "+ocorrencias+" números "+num+".");
		}
	}
	
	public int contarNodos(){
		int ocorrencias = 0;
		if(inicio != null){
			aux = inicio;
			ocorrencias++;
			while(aux.prox != null){
				aux = aux.prox;
				ocorrencias++;
			}
		}
		return ocorrencias;
	}
	
	public int calculaAltura(int posicao){
		int indice = 0;
		if(inicio != null){
			aux= inicio;
			while(aux.prox != null && indice != posicao){
				aux = aux.prox;
				indice++;
			}
		}
		int tamanho = contarNodos()-indice;
		return tamanho<0?0:tamanho;
	}
}
