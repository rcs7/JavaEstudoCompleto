package Cole��es;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		//LinkedList � uma fila, posso por tb List no lugar de Queue 
		Queue<String> fila = new LinkedList<String>();
		//ou
		//Queue<String> fila = new LinkedList<>();
	    //Faz a mesma coisa que add, s� q se houver algum problema na
		//hr de inserir ele s� retorna false, mas se for o add ele joga um erro
		fila.offer("Maria");
		fila.offer("Jo�o");
		fila.offer("Pedro");
		//consula o primeiro elemento que est� na fila e retorna sem o remov�-lo
		//Qd a fila est� vazia o peek retorna nullo, j� o element n�o retorna nullo
		//ele simplesmente gera um erro pra vc
		//Esses dois m�todos � como se algu�m chegasse e perguntasse:
		//Quem � o primeiro da fila: algu�m vai l� e responde.
		System.out.println("Peek/Element...");
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Poll/Remove...");
		//Imprime Maria, mas tb a remove!
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());//removi todos
		//A fila t� vazia, o m�todo poll retorna null
		System.out.println(fila.poll());
		//A fila t� vazia, o remove retorna um erro!
		System.out.println(fila.remove());
  }
}
