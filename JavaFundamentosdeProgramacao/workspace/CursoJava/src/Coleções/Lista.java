package Cole��es;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
        //dps de escrever este comando digito Crl+Shift+o p/ importar
		List<String> aprovados = new ArrayList<>();
		//ou
		//List<String> aprovados = new ArrayList<>();
		//ArrayList<String> aprovados = new ArrayList<String>();
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		//A diferen�a do List pro Set � que o List � indexado
		//Ent�o tem o m�todo get:
		System.out.println("Get...");
		System.out.println(aprovados.get(1));
		
		System.out.println("Add...");
		System.out.println(aprovados.add("Maria"));
		System.out.println("Size... "+aprovados.size());
		
		System.out.println("Remove...");
		//Retorna false pois � "Maria" e n�o "maria"
		System.out.println(aprovados.remove("maria"));
		System.out.println(aprovados.remove("Maria"));//true
		System.out.println("Size..." + aprovados.size());
 
		//for each
		for(String nome: aprovados) {
			System.out.println(nome);
		}
	}
}
