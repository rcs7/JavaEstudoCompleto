package Coleções;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack();
		//ou
		//Stack<String> pilha = new Stack<String>();
		//Coloca um elemento na pilha
		pilha.push("O Pequeno Príncipe");
		pilha.push("O Hobbit");
		pilha.push("Dom Quixote");
	
	//  peek() - consulta quem tá no topo da pilha, mas
		System.out.println("peek...");
		System.out.println(pilha.peek());
		
		System.out.println("pop...");
	//  pop() - Além de retornar o objeto no topo, ele tb
	//o retira.
		System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
       //Agr a pilha está vazia, se eu fiz um pop()
       //ele retorna um erro!
 //       System.out.println(pilha.pop());
       
        //Essa class - essa collection implementa tanto uma pilha qt uma fila tb
        Deque<String> pilha2 = new ArrayDeque<String>();
        //ou 
        //Deque<String> pilha2 = new ArrayDeque<>();
        //Coisas relacionadas a pilha
        System.out.println("Usando o 'Deque<String> pilha2 = new ArrayDeque<String>();'");
        pilha2.push("O Pequeno Príncipe2");
		pilha2.push("O Hobbit2");
		pilha2.push("Dom Quixote2");
	
	//  peek() - consulta quem tá no topo da pilha, mas
		System.out.println("peek...");
		System.out.println(pilha2.peek());
		
		System.out.println("pop...");
	//  pop() - Além de retornar o objeto no topo, ele tb
	//o retira.
		System.out.println(pilha2.pop());
        System.out.println(pilha2.pop());
        System.out.println(pilha2.pop());
       //Agr a pilha está vazia, se eu fiz um pop()
       //ele retorna um erro!
        //System.out.println(pilha.pop());
        
        //Olha só que funciona como se fosse uma fila tb:
        pilha2.poll();
	}
}