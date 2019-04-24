package Coleções;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Conjunto homogêneo. Usa Genérics"<>"
		//Set<String> aprovados = new HashSet<String>();
		//Esse abaixo faz um conjunto ordenado, se esse conjunto for de String ou de 
		//Números não importa. Na hr da impressão estará em ordem
		Set<String> aprovados = new TreeSet<String>();
		//Esse abaixo respeita a ordem de inserção na hora da impressão, coisa que o
		//HashSet não faz
		//Atalho Ctrl+Shift+o pra ele importar, caso não import
		//Set<String> aprovados = new LinkedHashSet<String>();
		//Set<String> aprovados = new HashSet<>(); poderia ser assim pq o java infere
		//Antes era assim: homogêneo
		//Set aprovados = new HashSet();
		aprovados.add("João");
		//aprovados.add(1);//dá erro pq não é do tipo String
		aprovados.add("Pedro");
		aprovados.add("Maria");
	    aprovados.add("Rafael");
		
		//pra imprimir os elementos do conjunto:
		//for each
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		//Obs que ele obedece ordem nenhuma, nem alfabética e nem de inserção
	    //Se eu fosse imprimir no caso de um conj. heterogêneo:
		for(Object nome: aprovados) {
			System.out.println(nome);
		}
	}

}
