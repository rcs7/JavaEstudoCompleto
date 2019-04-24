package classe;

public class Desafio {
	int a = 2;
	//se static int a = 2; // como main é static tb eu poderia
	//simplesmente pôr lá na main
	//System.out.println(a); //que imprimiria 2
		
	public static void main(String[] args) {
		Desafio d = new Desafio();
		System.out.println(d.a);
        //isso dá erro aq na main, mas se fosse em outra class seria exatamente assim
		//e esse método teste tá ok
		//teste(); //Cannot make a static reference to the 
		//non-static method teste() from the type Desafio

	}
	
	void teste() {
		System.out.println(a); //imprime normalmente o a
	    //pois é test é um método de instância e a variável a tb é
		//de instância.
	}
 
	//Se eu tiver num método de instância e quiser acessar a um método
	//que pertence a classe é possível pq a classe sempre vem antes da 
	//instância
}
