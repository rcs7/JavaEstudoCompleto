package classe;

public class Produto {
	String nome;
	double preco;
	//double desconto; // é uma variável pra cada instância
	//Pra que ela vire uma variável de class e deixe de ser de instância: static nela
	//agr desconto é uma variável que uma única cópia dentro da class Produto
	//Se eu mudar o valor de desconto mudo pra todas as instâncias
	static double desconto;
	
	//Criei o construtor padrão explicitamente
	Produto(){
		
	}
	/*não tem lógica passar uma variável que é de class, ou seja, que 
	 * possui o modificador static, dentro de uma instância do construtor.
	 * A forma correta do construtor tá mais abaixo. Essa aq tá errada*/
	/*Produto(String nome, double preco, double desconto){
		//As variáveis com this são as variáveis de instância
		this.nome = nome;
		this.preco= preco;
		this.desconto = desconto;
	} */
	Produto(String nome, double preco){
		//As variáveis com this são as variáveis de instância
		this.nome = nome;
		this.preco= preco;
	}
	
    double precoComDesconto() {
		return preco - preco * desconto;
	}
}
