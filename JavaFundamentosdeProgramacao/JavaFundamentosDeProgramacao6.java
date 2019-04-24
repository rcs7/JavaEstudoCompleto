//API do Java

/* Explorando String
String - seq de caracteres delimitados por "".
É um objeto imutável(não consigo alterá-la), ou seja, mesmo aplincado um monte
de médotos que a API do java oferece para String ela não muda.
Mas se eu quiser mudá-la faço ela = ela.métodos...
Pool(piscina-grande conjunto) de String. 
Ex:Crio uma String "Ana" e "Bia". O java joga elas dentro 
desta grande Pool. E na segunda vez que eu for usar a palavra Ana, ele
não cria uma nova instância de String com a palavra Ana, ele simplesmente
reusa. Isso é feito pra diminuir o consumo de memória.

Crio uma nova class chamada ExplorandoString dentro de um novo pacote chamado
API 
*/
package API;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = "Leo"+"nardo";
	
		//Alguns métodos importantes
		System.out.println(nome.toUpperCase()); //LEONARDO
		System.out.println(nome);//Leonardo
		System.out.println(nome.length());
		System.out.println(nome.substring(0,3));//beginIndex, endIndex. Retorna Leo
		//retorna o primeiro índice que ele encontra esse caractere: 6
		System.out.println(nome.indexOf('d'));
		//retorna d
		System.out.println(nome.charAt(6));
		//Compare duas Strings sem levar em consideação as letras maiúsculas e minúsculas
		System.out.println(nome.equalsIgnoreCase("leonardo"));//(anotherString)
	    //pra saber se uma String começa com tal trecho
		System.out.println(nome.startsWith("Leo"));//(Preffix) //true
		System.out.println(nome.endsWith("ardo"));//(suffix) //true
		System.out.println(nome.isEmpty()); //false
		System.out.println(nome.concat(" é legal").concat("!")); //retorna String
		
		//A String é imutável:
		System.out.println(nome); //Leonardo
	    //Se eu quiser mudá-la:
		//LEO é legal!
		nome = nome.toUpperCase().substring(0,3).concat(" é legal!");
	
	}
}
//Pool de String: se eu fizer "a"+"b"+"c" fica lá:
//"a" "b" "c" "ab" "abc". Ou seja, a qtd de String salvas é
//grande. Significa que eu devo ter cuidado na hora das concatenações.
//Solução: StingBuilder, pois esse tipo de String é mutável.

//crio a class ExplorandoStringBuilder dentro do mesmo pacote API
package API;

public class ExplorandoStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//vai anexar uma determinada string ao StringBuilder
	    //OBS: Na StringBuilder o que trabalho mais é a questão do
		//append e dps a converto para uma String, usando toString
		//StringBuilder é melhor performance do que usar o + pra concatenar
		//como a String normal faz
		sb.append("Joao");
		sb.append(",").append("Maria");
		sb.append(",").append("Pedro");
		
		//Esse tipo de String é mutável
		//Esse método muda realmente a StringBuilder, mas alguns 
		//não mudam como é o caso do substring(,);
		sb.reverse(); //inverte tda a String
		
		//Pra imprimir uma StringBuider no console
		System.out.println(sb.toString());//ordeP,airaM,oãoJ
		//Esse método não muda o conteúdo da StringBuild:
		System.out.println(sb.substring(1,3)); //rd
		System.out.println(sb.toString());//ordeP,airaM,oãoJ
	}
}

//API ainda nova class ExplorandoMath.
/*A class Math possui vários métodos estáticos, ou seja, eu não preciso criar
umas instância de Math pra usar os métodos contidos nela.
Métodos estático chamo a class.nomeDoMetodo e pronto.
*/
package API;

public class ExplorandoMath {

	public static void main(String[] args) {
		// sin, cos, tag, log...
		System.out.println(Math.PI); // 3.1415...
		System.out.println(Math.pow(2,3)); //2^3 =8 . Imprime 8
        //Se o valor for positivo, ele retorna o próprio valor, se 
		//for negativo retorna ele positivo
		System.out.println(Math.abs(-10.5)); //10.5
		System.out.println(Math.min(10,11)); //10
		System.out.println(Math.max(10, 7)); //10
		System.out.println(Math.ceil(6.22)); // arredonda pra cima 7.0
		System.out.println(Math.floor(6.76));// arredonda para baixo 6.0
		
		//Gera um número double randômico aleatório entre 0 e 1
		
		System.out.println(Math.random());
	}
}

//Recursividade: Técnica na qual eu tenho uma função que chama ela mesma para resolver
//um determinado problema, seja ele maatemático(Ex: fatorial) ou não.
//Obrigatoriamente, o método pra ser recursivo tem que chamar ele mesmo.
//Condição de parada, pois se não gera um problema chamado Stack Over Flow, ou seja,
//a pilha de execução do seu programa estourou.

//Avançado

//Crio um novo pacote chamado Avancado e o nome da class é Recursividade.
package Avancado;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println(fatoriaFor(5)); //120	
		System.out.println(fatorial(5));
	}

	//Fatorial sem recursivade
	private static int fatoriaFor(int numero) {
		int fatorial = 1;
		
		for(int i=1; i <= numero; i++) {
			fatorial = fatorial *i;
		}
	return fatorial;
	}

	private static int fatorial(int numero) {
		if(numero <= 1) {
			return 1;
		}
		return numero * fatorial(numero-1);
	}
}

//Varargs = "Var args"(falo assim)
//executo a class jantar q eu ja fiz lá no package oo->Polimorfismo->Pessoa
//Vejo como era o método antes:
//Polimorfismo dinâmico pra acabar com a perda
	//de tempo do polimorfismo estático visto acima
    public void comer(Comida comida) {
    	this.peso += comida.getPeso(); 
    }
//aí a chamada é assim!
//	pessoa.comer(arroz);
//	pessoa.comer(feijao);
//	pessoa.comer(sorvete);

//agr começo a mudança:

//Mudo colocando o argumento pra (Comida... comidas) querendo dizer que agora eu 
//posso passar qtas comidas eu quiser separadas por vígulas que o java vai
//pegar todos esses argumentos que são variáveis(posso ter 1,2 ou 10 etc) e vai 
//transformar isso em um Array e eu posso iterar sobre este Array e fazer a pessoa
//comer todas as comidas que foram passadas por parâmetro.

  public void comer(Comida... comidas) {
      //se eu escrever: comidas+Atl+Espaço vejo que comidas é um Array
	  //pq o java transformou ele em um comidas[]
	  //usando o for each
	  for(Comida c:comidas){
		this.peso += comida.getPeso(); 
	  }
  }
//aí a chamada é assim!
//	pessoa.comer(arroz,feijao,sorvete);


package classe;

//Eu ajeitei este código pra que funcionasse o test do junit que fiz dentro do pakage test
public class Calculadora {

/*usando o JUNIT do eclipse pra testar esta classe:*/
	public double resultado;
	
	//Entrada -> Algoritmo -> Saída 
	public double somar(double a, double b) {
		resultado = a +b;
		return resultado;
	}
	
	//Entrada -> Algoritmo
	void acrescentar(double a) {
		resultado += a;
	}
	
	//Algoritmo -> Saída
	public double obterResultado() {
		return resultado;
	}
	
	//Algoritmo
	public void limpar() {
		resultado = 0;
	}
}
/*clico em cima de src e escolho new->JUnit test e lá coloco o nome do package Teste e a classe eu chamo de 
CalculadoraTeste e lá deixo marcada a opção de setUp que ele vai vir com a opção @Before e na opção Classe under tests escolho a classe que quero testar que no caso é a classe Calculadora. Criada a classe de teste fora, crio um objeto Calculadora c fora do @Before e dentro do SetUp, ou seja, dentro do @Before eu isntancio o obj c que é do tipo Calculadora e pronto agr é só fazer os testes. A classe CalculadoraTest.Java fica assim:
*/

package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classe.Calculadora;

class CalculadoraTeste {

	Calculadora c;
	@BeforeEach
	void setUp() throws Exception {
		c = new Calculadora();
	}

	@Test
	void testSomar() {
		assertEquals(4.0, c.somar(3.0, 1.0));
	}
	@Test /*obs q não precisa ser o msm nome da função.*/
	void testSomardoisequatro() {
		assertEquals(6.0, c.somar(2.0, 4.0));
	}
	
	@Test
	void testObterResultado() {
		assertEquals(c.resultado,c.obterResultado());
	}
}
