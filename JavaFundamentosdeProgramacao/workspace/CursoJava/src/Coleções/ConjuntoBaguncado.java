package Coleções;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		//É um conjunto heteregênio e não é a melhor forma de criar um conjunto
		Set conjunto = new HashSet();//aperte Ctrl+Shift+o para importar
		//dá no msm por causa do polimorfismo
		//HashSet conjunto = new HashSet();//aperte Ctrl+Shift+o para importar
		
		//Esse método add retorna true se conseguiu add o elemento e false se não
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add..");
		//false  //true
		System.out.println(conjunto.add(1));//que já foi add anteriormente
		System.out.println(conjunto.add(10));
		//método size() está presente m todas as collections
        System.out.println("Size..."+conjunto.size());
        
        System.out.println("Remove...");
        //Se a remoção for bem sucedida ele retorna true e se não retorna false
        //retorna false pq aí é uma string e o 'a' que coloquei é um caracter(char)
        System.out.println(conjunto.remove("a"));
        //char diferente de string
        System.out.println(conjunto.remove('a'));//retorna true
        System.out.println("Size..."+conjunto.size());
        
        System.out.println("Contains...");
        //verifica se um elemento está contido ou não dentro da collection
        System.out.println(conjunto.contains('a'));//retorna false
        System.out.println(conjunto.contains(1));//retorna true
	
        //Criando outro conjunto
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        //união de 2 conjuntos: conjunto e nums. Add dentro do conjunto
        //conjunto o conjunto nums:
        //conjunto.addAll(nums);
        
        //Interseção de dois conjuntos
        conjunto.retainAll(nums);
        
        //conjunto interseção nums
        //o único elemento que é interseção entre esses conjs é 
        //o número 1. Logo o conjunto conjunto agora só tem um 
        //elemento o número 1.
        System.out.println("Size...");
        System.out.println(conjunto.size());
        
        conjunto.clear(); //Limpa o conjunto, ou seja, o deixa vazio
        System.out.println(conjunto.isEmpty());
       }
}
