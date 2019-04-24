package Cole��es;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Conjunto homog�neo. Usa Gen�rics"<>"
		//Set<String> aprovados = new HashSet<String>();
		//Esse abaixo faz um conjunto ordenado, se esse conjunto for de String ou de 
		//N�meros n�o importa. Na hr da impress�o estar� em ordem
		Set<String> aprovados = new TreeSet<String>();
		//Esse abaixo respeita a ordem de inser��o na hora da impress�o, coisa que o
		//HashSet n�o faz
		//Atalho Ctrl+Shift+o pra ele importar, caso n�o import
		//Set<String> aprovados = new LinkedHashSet<String>();
		//Set<String> aprovados = new HashSet<>(); poderia ser assim pq o java infere
		//Antes era assim: homog�neo
		//Set aprovados = new HashSet();
		aprovados.add("Jo�o");
		//aprovados.add(1);//d� erro pq n�o � do tipo String
		aprovados.add("Pedro");
		aprovados.add("Maria");
	    aprovados.add("Rafael");
		
		//pra imprimir os elementos do conjunto:
		//for each
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		//Obs que ele obedece ordem nenhuma, nem alfab�tica e nem de inser��o
	    //Se eu fosse imprimir no caso de um conj. heterog�neo:
		for(Object nome: aprovados) {
			System.out.println(nome);
		}
	}

}
