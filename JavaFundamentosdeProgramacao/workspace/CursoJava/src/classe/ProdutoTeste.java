package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
        //crio uma inst�ncia de Produto
		Produto produto1 = new Produto();
		produto1.nome = "Notebook Acer 15' GB";
		produto1.preco = 2300;
		//produto1 � 0.15 mas se eu mexer no desconto em qlq lugar muda aq tb pq ele � static
	// 	produto1.desconto = 0.15;
        //bora p� da maneira certa:
         //� ESSA LINHA DE BAIXO, MAS ELE P�S MAIS L� EM BAIXO
		//	Produto.desconto = 0.15; //uso a class.atributoStatic
		
		//mexi na vari�vel desconto que � static, logo muda em todas as inst�ncias. Ou seja, 
		//o desconto do produto1 passa a ser 0.05 tb 
		//N�o tem mta l�gica passar desconto dentro do construtor pq ele t� ligado com uma 
		//inst�ncia do Produto e desconto � static. Tem a ver com a class
        // Produto produto2 = new Produto("Caneta BIC Preta",2.83, 0.05);
		//Editando o construtor 
		//Agr sim!:::
		Produto produto2 = new Produto("Caneta BIC Preta",2.83);
		
		Produto.desconto = 0.15;

		System.out.println(produto1.precoComDesconto());
		System.out.println(produto2.precoComDesconto());
	}

}
