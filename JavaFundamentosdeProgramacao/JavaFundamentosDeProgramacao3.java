//Um arq é uma Class, então o nome de sua Classe reflete o nome do arquivo.
//Mas um arq pode ter mais de uma Class. Qd lembro de Arquivo .java já lembro das classes

//class Nome{
	//Atributos == dados
	//Comportamentos == Métodos
//}

//Classe define um tipo. E um tipo define tb uma estrutura de dados. Ou seja, a class define uma estrutura
//de dados que eu criei, específico pro meu problema.
//A Classe é uma simplifiicação do mundo, ela representa uma abstração.

//Java é classecentríco.
//Apartir de uma Classe eu posso criar vários objetos. A Class é a estrutura de dados e os objetos são os dados.
//Intância é sinônimo de objeto(Intância = Objeto). Qd eu digo que vou instanciar uma class quero dizer que vou 
//criar um objeto apartir desta class. 
//Classe = molde de carro; Objeto = carro.

//Membros de uma classe: Variáveis/constantes, Construtores, Métodos e outras classes(podemos ter isso).

//Notação Ponto:
/*Classe.atributo
  Classe.metodo(param)
  
  obj.atributo
  obj.metodo(param)
*/

//Método - ação que o objeto executa.
/*retorno nome (params(tipo nome))
  String obterDiaDaSemana(int dia, int mes, int ano){
  
  }
  nome (params(tipo nome)) é a assinatura do método.
Não posso ter um método com o msm nome e com 2 
parametros ints. Mas posso ter um método com o msm
nome mas um com um param int e o outro com um param
String, por exemplo. Obs que o que importa não é os
nomes do params e sim os seus tipos. 
Ou seja, não posso ter dois métodos com a mesma assinatura. */

//Criando o Objeto Data
//Crio a Class Data. Criando junto o novo package classe
//E dentro do mesmo package crio uma nova class chamada DataTeste
//essa class terá o método main nela.
package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	//Posso ter mais de um construtor
	//Posso então criar o construtor padrão
	Data(){
		
	}
	
	//Construtor explícito, ao criá-lo eu desativo o construtor 
	//que era o implícito
	Data (int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	//método
	String formatar() {
		return String.format("%d/%d/%d",dia,mes,ano);
	}
}

package classe;

public class DataTeste {

	public static void main(String[] args) {
		//Instanciação da class Data == criação do objeto
		// O tipo da var nascimento é Data. 
		//Criação do objeto a partir do construtor implícito padrão
		//Construtor padrão implpicito é esse que não recebe nenhum parâmetro
		//ao criar o objeto
		Data nascimento = new Data(); 
        //Tirei essa linha de cima ao criar um construtor explícito lá na class Data
		nascimento.dia = 19;
        nascimento.mes = 11;
        nascimento.ano = 1987;
        
        Data casamento = new Data(8,9,2010);
		//Data nascimento = new Data(19,11,1997);
		
        //System.out.println(nascimento.dia + "/"+nascimento.mes+"/"+nascimento.ano);
        //System.out.printf("%d/%d/%d\n", nascimento.dia,nascimento.mes,nascimento.ano);
        System.out.println(nascimento.formatar());
        System.out.println(casamento.formatar());

	}

}

//Obs sempre salve a class. Aq se eu não salvar os atributos da 
//class Data, não terei como acessá-los dentro da class DataTeste

//Construtor - O nome dele tem que ser EXATAMENTE igual ao da class
//Ele tem o tipo de RETORNO IMPLÍCITO, pois ele smp retorna o tipo 
//no ql ele se refere. Ele retorna um novo objeto do tipo da class a 
//ql ele pertence. Então nunca escrevo o tipo do retorno de um construtor.
//Ou seja, tb não posso colocar void, ou seja, ele retorna implicitamente
//um objeto da class a ql ele pertence.
// (algum modificador) NomeContrutor(params)
//Pode ter um ou mais parâmetros. Um ou mais construtor, mas com parêmtros 
//diferentes e dps o corpo do construtor.

// 4 tipos de métodos 
/*Entrada -> Algoritmo -> Saída*/
/*			 Algoritmo -> Saída*/
/*Entrada -> Algoritmo */
/* Algoritmo */
package classe;

public class Calculadora {

	double resultado;
	
	//Entrada -> Algoritmo -> Saída 
	double somar(double a, double b) {
		resultado = a +b;
		return resultado;
	}
	
	//Entrada -> Algoritmo
	void acrescentar(double a) {
		resultado += a;
	}
	
	//Algoritmo -> Saída
	double obterResultado() {
		return resultado;
	}
	
	//Algoritmo
	void limpar() {
		resultado = 0;
	}    
}

package classe;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.somar(2.3, 4.5));
		
		calc.acrescentar(10);
		System.out.println(calc.obterResultado());
		
		calc.limpar();
		System.out.println(calc.obterResultado());
	}
}

/*Variáveis ou métodos de instância == de objeto

Variáveis ou métodos de class == Usar o modificador static*/

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
//    Desafio!!!!!!!!!!!!!!!
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

/*Atribuição : Por Valor x por Referência
Atribuição por Valor - Tipos primitivos (int, long, char, double etc) :
int a = 2;
int b = 2; //cópia. A variável a é independente da
variável b. Se eu sair mundando o valor das duas isso não muda
em nda o valor da outra.
Sá por curiosidade, se eu crio uma variável int c e não coloco
nada nela. Por padrão é atribuído 0 a ela. E no caso de variável 
booleana é atribuído false a ela. Na char tb é 0. Double etc tb é 0.

Atribuição por Referência - Objetos
Object a = new Object(); //Object é o pai de todos os objetos em java,
ou seja, a String, qlq class que eu crie tb tem uma relação com a class Object.
O que ocorre:
            Memória
Object a
0x5fab760c(endereço de um lugar na memória) ------> Instância de Objeto
Object b = a;
Object b
0x5fab760c(endereço de um lugar na memória) ------> Instância de Objeto
Logo a variável a e a variável b apontam pra um mesmo lugar na memória.
Se eu alterar um atributo apartir de uma das referências, as duas vão enxergar a mudança.
E se eu criar uma variável do tipo Object, por ex
Object c e não atribui nada a ela, ela não aponta pra algum endereço, ela recebe como 
valor default o null(Não aponta pra nenhum objeto).
Se eu fizer c. gera um erro chamado null poin exception (Excessão de ponto nulo)
*/
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

//this =  a instância(objeto) atual, a que está sendo criada naquele momento
//This() - método; representa o Construtor.
/*
Data(){
	this(1,1,2017); // Referencia o construtor abaixo e eh válido
}
Data(int dia, int mes, int ano){
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
}
*/

//Crio a class Variaveis locais
public class VariaveisLocais {
	int a1=2; //variável de instância;
	
	void teste1() {
		int a1 = 3; //é visível apenas dentro deste método, ela eh local
		System.out.println(a);
		System.out.println(a1); //referencia a variável local
		System.out.println(this.a1);//referencia a variável que tá lá fora que é a de instância
		//Essa ordem de comandos que estão comentados daria erro!
		//A ordem no método é sequêncial
		//System.out.println(a3);
        //int a3 = 1;
		if(a1<3) {
		//	int a2 = 3;
		}
		//Essa linha abaixo daria erro, pois a2 só é enxergada dentro do
		//escopo do if
		//System.out.println(a2);
	}
	//a delcaração da variável pode ser após o método
	//pq a VM primeiro procura as variáveis e só dps procura os métodos
	//mas é boa prática pôr no início
	int a; //Variável de instância	
}
//crio a class ValorPadrao
package classe;

public class ValorPadrao {
	static int a;
	static boolean b;
	//Variáveis de class e de instância são inicializadas automaticamente
	//por padrão com 0, até o char, mas boolean é com false, pois em java
	//não é permitido 0 e 1 pra definir variáveis, mas só true e false.
	public static void main(String[] args) {
		System.out.println(a); // 0 por padrão
		System.out.println(b); // false por padrão
		int b;
		//System.out.println(b); //vai dar erro pq a variável é local
		//e precisa ser inicializada explicitamente.
		b =0;
		System.out.println(b); // agr sim funciona
		Object c; // é uma variável local
		//System.out.println(c); // dá erro pq eh local e local não é inicializada por padão
		//eu preciso iniciá-la explicitamente.
		c = null;
		System.out.println(c); // Agr sim!		
	}
}
