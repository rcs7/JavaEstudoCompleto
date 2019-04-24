package Coleções;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		//LinkedList é uma fila, posso por tb List no lugar de Queue 
		Queue<String> fila = new LinkedList<String>();
		//ou
		//Queue<String> fila = new LinkedList<>();
	    //Faz a mesma coisa que add, só q se houver algum problema na
		//hr de inserir ele só retorna false, mas se for o add ele joga um erro
		fila.offer("Maria");
		fila.offer("João");
		fila.offer("Pedro");
		//consula o primeiro elemento que está na fila e retorna sem o removê-lo
		//Qd a fila está vazia o peek retorna nullo, já o element não retorna nullo
		//ele simplesmente gera um erro pra vc
		//Esses dois métodos é como se alguém chegasse e perguntasse:
		//Quem é o primeiro da fila: alguém vai lá e responde.
		System.out.println("Peek/Element...");
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Poll/Remove...");
		//Imprime Maria, mas tb a remove!
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());//removi todos
		//A fila tá vazia, o método poll retorna null
		System.out.println(fila.poll());
		//A fila tá vazia, o remove retorna um erro!
		System.out.println(fila.remove());
  }
}
