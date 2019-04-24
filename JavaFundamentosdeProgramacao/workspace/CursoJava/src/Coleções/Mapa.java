package Coleções;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		//Map<K, V>
		Map<Integer,String> aprovados = new HashMap<>();
		//ou Map<Integer, String> aprovados = new HashMap<Integer,String>();
		//O que antes era add agr é put aq em Map:
		//aprovados.put(key, value);
		//Se eu der um put e escrever um registro com um chave que já existe, 
		//haverá a substituição
		aprovados.put(1, "Pedro");
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Carlos");
		
		//3 formas de obter os dados usando Map
		//1 - obter o conjunto de chaves:
		System.out.println(aprovados.keySet()); //[1,2,3,4]
		//2 - obter os valores
		//[Pedro, Ana, Bia, Carlos]
		System.out.println(aprovados.values());
		//3 - obter o conjunto completo com chaves e valores
		//[1=Pedro, 2=Ana, 3=Bia, 4=Carlos]
		System.out.println(aprovados.entrySet());
		
	   //Usando o put insiro um registro com a chave 3 que já
	   //existia, então há uma substituição de registro
		aprovados.put(3, "Beatriz");
		//pegando o valor do registro através da chave, uso o get
		//obs: não é índice e sim a chave
		System.out.println(aprovados.get(3)); //Beatriz
	
		//O Map tb tem o método contais(diz se um elemento está no Map), mas ele possui duas formas
		//lembrando que o contains retorna true or false
		System.out.println(aprovados.containsKey(4)); //true
		System.out.println(aprovados.containsValue("Bia")); //false
	
		System.out.println("chaves...");
		
		//for each
		for(Integer codigo:aprovados.keySet()) {
			System.out.println(codigo);
		}
		
		System.out.println("Valores...");
		for(String nome: aprovados.values()) {
				System.out.println(nome);
		}
	   
		 System.out.println("Chaves/Valores...");
		 for(Entry<Integer, String> registro: aprovados.entrySet()) {
			 System.out.println(registro.getKey() + " "+registro.getValue());
		 }
	}
}
