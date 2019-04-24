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
		//final aq n�o quer dizer que os atributos da class que s�o
		//constantes e sim a refer�ncia que � constate
		final Produto produto = new Produto("Caneta", 1);
		//J� que usei o final, ent�o eu n�o poderia fazer agora:
		//produto = new Produto(); daria erro!
	    Produto produto2 = produto;
	    produto2.nome = "L�pis";
	  	    	    		
		porValor(numero);
		porReferencia(produto);
				
		System.out.println(numero); //1
		System.out.println(produto.preco); //2
		System.out.println(produto.nome); //L�pis
	}
}
