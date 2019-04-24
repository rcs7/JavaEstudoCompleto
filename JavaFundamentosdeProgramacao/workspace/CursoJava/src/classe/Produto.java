package classe;

public class Produto {
	String nome;
	double preco;
	//double desconto; // � uma vari�vel pra cada inst�ncia
	//Pra que ela vire uma vari�vel de class e deixe de ser de inst�ncia: static nela
	//agr desconto � uma vari�vel que uma �nica c�pia dentro da class Produto
	//Se eu mudar o valor de desconto mudo pra todas as inst�ncias
	static double desconto;
	
	//Criei o construtor padr�o explicitamente
	Produto(){
		
	}
	/*n�o tem l�gica passar uma vari�vel que � de class, ou seja, que 
	 * possui o modificador static, dentro de uma inst�ncia do construtor.
	 * A forma correta do construtor t� mais abaixo. Essa aq t� errada*/
	/*Produto(String nome, double preco, double desconto){
		//As vari�veis com this s�o as vari�veis de inst�ncia
		this.nome = nome;
		this.preco= preco;
		this.desconto = desconto;
	} */
	Produto(String nome, double preco){
		//As vari�veis com this s�o as vari�veis de inst�ncia
		this.nome = nome;
		this.preco= preco;
	}
	
    double precoComDesconto() {
		return preco - preco * desconto;
	}
}
