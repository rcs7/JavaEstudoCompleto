package Cole��es;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		//� um conjunto hetereg�nio e n�o � a melhor forma de criar um conjunto
		Set conjunto = new HashSet();//aperte Ctrl+Shift+o para importar
		//d� no msm por causa do polimorfismo
		//HashSet conjunto = new HashSet();//aperte Ctrl+Shift+o para importar
		
		//Esse m�todo add retorna true se conseguiu add o elemento e false se n�o
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add..");
		//false  //true
		System.out.println(conjunto.add(1));//que j� foi add anteriormente
		System.out.println(conjunto.add(10));
		//m�todo size() est� presente m todas as collections
        System.out.println("Size..."+conjunto.size());
        
        System.out.println("Remove...");
        //Se a remo��o for bem sucedida ele retorna true e se n�o retorna false
        //retorna false pq a� � uma string e o 'a' que coloquei � um caracter(char)
        System.out.println(conjunto.remove("a"));
        //char diferente de string
        System.out.println(conjunto.remove('a'));//retorna true
        System.out.println("Size..."+conjunto.size());
        
        System.out.println("Contains...");
        //verifica se um elemento est� contido ou n�o dentro da collection
        System.out.println(conjunto.contains('a'));//retorna false
        System.out.println(conjunto.contains(1));//retorna true
	
        //Criando outro conjunto
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        //uni�o de 2 conjuntos: conjunto e nums. Add dentro do conjunto
        //conjunto o conjunto nums:
        //conjunto.addAll(nums);
        
        //Interse��o de dois conjuntos
        conjunto.retainAll(nums);
        
        //conjunto interse��o nums
        //o �nico elemento que � interse��o entre esses conjs � 
        //o n�mero 1. Logo o conjunto conjunto agora s� tem um 
        //elemento o n�mero 1.
        System.out.println("Size...");
        System.out.println(conjunto.size());
        
        conjunto.clear(); //Limpa o conjunto, ou seja, o deixa vazio
        System.out.println(conjunto.isEmpty());
       }
}
