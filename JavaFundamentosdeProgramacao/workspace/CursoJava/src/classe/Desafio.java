package classe;

public class Desafio {
	int a = 2;
	//se static int a = 2; // como main � static tb eu poderia
	//simplesmente p�r l� na main
	//System.out.println(a); //que imprimiria 2
		
	public static void main(String[] args) {
		Desafio d = new Desafio();
		System.out.println(d.a);
        //isso d� erro aq na main, mas se fosse em outra class seria exatamente assim
		//e esse m�todo teste t� ok
		//teste(); //Cannot make a static reference to the 
		//non-static method teste() from the type Desafio

	}
	
	void teste() {
		System.out.println(a); //imprime normalmente o a
	    //pois � test � um m�todo de inst�ncia e a vari�vel a tb �
		//de inst�ncia.
	}
 
	//Se eu tiver num m�todo de inst�ncia e quiser acessar a um m�todo
	//que pertence a classe � poss�vel pq a classe sempre vem antes da 
	//inst�ncia
}
