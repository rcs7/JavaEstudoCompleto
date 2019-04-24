package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
        //crio uma instância de Produto
		Produto produto1 = new Produto();
		produto1.nome = "Notebook Acer 15' GB";
		produto1.preco = 2300;
		//produto1 é 0.15 mas se eu mexer no desconto em qlq lugar muda aq tb pq ele é static
	// 	produto1.desconto = 0.15;
        //bora pô da maneira certa:
         //É ESSA LINHA DE BAIXO, MAS ELE PÔS MAIS LÁ EM BAIXO
		//	Produto.desconto = 0.15; //uso a class.atributoStatic
		
		//mexi na variável desconto que é static, logo muda em todas as instâncias. Ou seja, 
		//o desconto do produto1 passa a ser 0.05 tb 
		//Não tem mta lógica passar desconto dentro do construtor pq ele tá ligado com uma 
		//instância do Produto e desconto é static. Tem a ver com a class
        // Produto produto2 = new Produto("Caneta BIC Preta",2.83, 0.05);
		//Editando o construtor 
		//Agr sim!:::
		Produto produto2 = new Produto("Caneta BIC Preta",2.83);
		
		Produto.desconto = 0.15;

		System.out.println(produto1.precoComDesconto());
		System.out.println(produto2.precoComDesconto());
	}

}
