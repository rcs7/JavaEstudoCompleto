package classe;

public class ValorVersusReferencia {
	
	static void porValor(double numero) {
		numero++;
	}
	
	static void porReferencia(Produto produto) {
		produto.preco++;
	}
	
	public static void main(String[] args) {
		double numero = 1;
		//final aq não quer dizer que os atributos da class que são
		//constantes e sim a referência que é constate
		final Produto produto = new Produto("Caneta", 1);
		//Já que usei o final, então eu não poderia fazer agora:
		//produto = new Produto(); daria erro!
	    Produto produto2 = produto;
	    produto2.nome = "Lápis";
	  	    	    		
		porValor(numero);
		porReferencia(produto);
				
		System.out.println(numero); //1
		System.out.println(produto.preco); //2
		System.out.println(produto.nome); //Lápis
	}
}
