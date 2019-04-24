 //Pilares da POO
 /*
1-                 ENCAPSULAMENTO
 vc não precisa conhecer o que há dentro dos objetos
 para que vc possa usar aqueles objetos. O objeto é como se fosse uma caixa preta.
 O que é importante é conhecer a interface de comunicação daquele objeto com o mundo.
 Que seria a forma com que vc interage com aquele objeto. O objeto em si é o mecanismo 
 no qual eu tenho o encapsulamento. O que fica visível pra quem vai usar o objeto é a 
 interface de comunicação que são os atributos(que eu eventualmente coloque como visíveis)
e os métodos. É o fato de agr ter agrupamento entre dados e comportamentos. Isso antes era
solto. Eu tinha funções e dados. As funções operavam em cima de dados e retornavam mais dados
que entravam em outra funções e assim ía. Posso esconder alguns detalhes de implementação, posso
ter um objeto que tem 30 métodos, mas apenas 2 deles estão disponíveis pra que outros objetos acessem.
Não preciso conhecer o objeto pra usá-lo. E o encapsulamento é o fato de ter uma cápsula que  comporta
atributos e métodos.
Auto-acoplamento é qd td mundo depende de todo mundo.
Capsula - é o objeto.

Níveis de visibilidade de um atributo/método:
-public: visível e acessível pra todo mundo, ou seja, pra qlq outra classe.
Tá disponível pra ser usado por outro objetos, ou seja, ele pertence a interface
daquele objeto.
-protected:visível na própria classe, visível dentro do mesmo pacote
e é transmiido por herança para uma classe que esteja em outro pacote.
-default(pacote): qd não digo nda em relação a visibilidade.
O próprio objeto enxerga e tb todos objetos ou classes que 
estão dentro do mesmo pacote.
-private: visível só dentro do objeto no qual ele 
foi definido.

2-				HERANÇA
É uma das formas de se reutilizar código. Eu escrevo código em um lugar e consigo herdar esses atributos 
e métodos para um outro objeto, ou seja, uma outra classe sem precisar ter que escrever novamente. Lembre
que java é classcentríco. Recebe-se um código por herança. A herança é do tipo enum.
Na vdd existem duas formas de herdar código:
COMPOSIÇÃO - sala é composta por cadeira, cadeira é composta por madeira e por aí vai
Carro é composto por motor. Motor é composto pro peças. Então a partir da composição, dentro do objeto não preciso 
escrever td relacionado ao carro pq qd eu for montar o carro, eu monto o carro a partir do motor... Então reutilizo 
código a partir da composição. É a relação tem um.
HERANÇA - é um. Mamífero é um Animal. Mamífero aquático é um mamífero que por consequentemente tb é um animal.
Posso ter uma classe mais Genérica(Super classe) chamada Animal e uma classe mais Específica chamada Anfíbio. Logo,
o Anfíbio pode herdar os comportamentos de Animal. A partir do momento que eu vou descendo eu vou especializando.
Obs: Nem toda hierarquia significa herança. Ex:soldado, cabo, sargento, tenente, capitão não é uma herança.
É um - herança;
Tem um - uma composição;

3-              POLIMORFÍSMO
Multiplas formas. Existem 2 tipos de polimorfismo:
1-Polimorfismo estático - sobrecarga de métodos. 
2--Polimorfismo dinâmico - pra ser implementado, preciso que antes haja a herança. Ex: Classe mais genérica que é Carro
e uma classe mais específica que é Cívic e Ferrari
Civic c = new Civic();
Carro c = new Civic();
Carro c = new Ferrari();
//MaisGenérico c = new maisEspecífica();
//tô criando uma variável mais genérica e instanciar objetos que são filhos daquela classe.
O polimorfismo existe qd vc tem uma variável do tipo Carro e essa única variável do tipo Carro
ela pode assumir múltiplas formas. Ex: A mesma variável c pode assumir multiplas formas:
 Carro c = new Civic();
 c = new Ferrari();
 c= new Corola();
 c = new Celta();
 c = new Gol();
 
 Ex: boolean estacionarCarroNaGaragem(Carro c){}
 estacionarCarroNaGaragem(new Civic());
 estacionarCarroNaGaragem(new Ferrari());
 */
 
 //Crio a class Sogro dentro de um novo pacote chamado oo.encapsulamento.casa1
 //Dentro do mesmo pacote vou criar a class Sogra
 
 //Crio a class Sogro dentro de um novo pacote chamado oo.encapsulamento.casa1
 //Dentro do mesmo pacote vou criar a class Sogra
 
 //Crio a class Genro dentro de um novo pacote chamado oo.encapsulamento.casa2
 //Dentro do mesmo pacote vou criar a class Sogra
 
 //Por enquanto tá mostrando 2 package um é oo.encapsulamento.casa1 e dentro tem 2 classes
 //Sogro e Sogra e outro package oo.encapsulamento.casa2 que dentro tem 2 classes Filha e Genro
 //Dentro de Package explore tem uma setinha e lá tem package pesentation e tem lá
 //a opção hierarchical
 //Agr vejo um pacote oo.encapsulamento e dentro dele tem 2 package casa1 que tem as classes Sogro 
 //e Sogra e casa2 que tem as classes
 package oo.encapsulamento.casa1;

public class Sogro {
	public boolean gostaDeCerveja = true;
}
package oo.encapsulamento.casa1;

public class Sogra {
	//Eu só poderia acessar se eu estivesse no mesmo pacote
	//ou se eu recebesse essa informação por herança, pois 
	//o atributo é protected
	protected String segredoDeFamilia ="Temos uma conta na Suíça";
}
package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Genro {
	//é uma variável de instância, então pra eu possa acessá-la dentro do
	//método main, eu tenho que criar uma instância dela.
	private String segredo ="Minha sogra fala muito";

	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei..."+euMesmo.segredo);
		//atributo default(pacote), então lá na class Genro posso acessar esse
		//atributo, se eu criar lá uma instância de Filha, pois eles estão no 
		//mesmo pacote.
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);
	
		//Como ele está em pacote diferente preciso importar
		//Ctrl+Shift+o:
		Sogro sograo = new Sogro();
		//O atributo gostaDeCerveja está na classe Sogro, mas é
		//público e por isso que posso acessá-lo.
		System.out.println(sograo.gostaDeCerveja);
		
		//Como ele está em pacote diferente preciso importar
		//Ctrl+Shift+o:
		//Sogra sogrinha = new Sogra();
		//Eu só poderia acessar se eu estivesse no mesmo pacote
		//ou se eu recebesse essa informação por herança, pois 
		//o atributo é protected
		//System.out.println(sogrinha.);
		//dou Ctrl+Shift+o pra ele editar os imports
	}

}
package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

//Ao coolocar a herança aperto Ctrl+shift+o pra aparecer o import
//Java não tem herança múltipla, logo uma class não pode herdar de 
//mais de uma classe. Aq sogra é a classe mais genérica e Filha é
//a classe mais específica.
//C++ suporta herança múltipla
public class Filha extends Sogra{
	//atributo default(pacote), então lá na class Genro posso acessar esse
	//atributo, se eu criar lá uma instância de Filha, pois eles estão no 
	//mesmo pacote. 
	//é uma variável de instância, então pra acessá-la tenho que criar uma 
	//intância(objeto) da classe que ela pertence.
	String segredoDoCasal ="Meu marido está quase sendo demitido";

	public static void main(String[] args) {
	
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabem..."+euMesma.segredoDoCasal);
	     
		//O atributo na classe Genro é privado, logo não pode ser acessado
		//a partir da classe Filha, mesmo eles sendo do msm pacote e se eu 
		//criar uma instância aq
		//Genro meuAmor = new Genro();
		//Gera erro!
		//System.out.println(meuAmor.segredo);
	
		Sogro papai = new Sogro();
    	//dou um Ctrl+Shift+o pra importar a class já que é
		//de outro package
		//o atributo pode ser acessado pq ele é público
		System.out.println(papai.gostaDeCerveja);
	
		//Sogra mamae = new Sogra();
		//dou um Ctrl+Shift+o pra importar a class já que é
		//de outro package
		//dá erro pq o atributo é protected,então
		//só pode ser acessado pela mesma classe que está
		//o atributo ou por classes que estão no mesmo pacote
		//ou que são passados por herança. Dá erro aq pq eu não
		//preciso criar uma instância do objeto pra acessar esse 
		//atributo, já que ele é protected e a classe Filha o
		//herdou por herança
		//System.out.println(mamae.segredoDeFamilia);
	//	Então a forma correta de acessar este atributo é:
		Sogra mamae = new Sogra();
		System.out.println(euMesma.segredoDeFamilia);
	}
}


//crio um novo package oo.heranca e uma nova classe dentro dele
//chamada Carro
package oo.heranca;

public class Carro {
	protected int VELOCIDADE_MAX = 200;
	//poderia ser assim e a class especializada que 
	//ajeitaria o valor dela
	//protected int VELOCIDADE_MAX;
    //Deixe maiúscula pra poder lembrar que deveria ser uma cte
	private int velocidadeAtual = 0;
	
	//Um método final é de certa forma um método constante, ou seja
	//que não pode ser modificado pelas classes filhas
	//Métodos protected é feito pra ser usado na classe filha
	protected final void acelerarMais(int velocidade) {
		if(velocidadeAtual + velocidade > VELOCIDADE_MAX) {
			velocidadeAtual = VELOCIDADE_MAX; 
		}else {
			velocidadeAtual += velocidade;
			
		}
		
	}
	
	protected final void frearMais(int velocidade) {
		if(velocidadeAtual - velocidade < 0) {
			velocidadeAtual = 0;
		}else {
			velocidadeAtual -= velocidade;
		}
	}
	
	public void acelerar() {
		acelerarMais(5);
	}
	
	public void frear() {
		frearMais(5);
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
}
package oo.heranca;
//herda o comportamento padrão que foi definido na class
public class Civic extends Carro{
}
package oo.heranca;
//herda o comportamento padrão que foi definido na class
public class Ferrari extends Carro{
	//quero que a ferrari tenha uma velocidade máx diferente da classe pai Carro
	//Construtor de Ferrari
	public Ferrari() {
		VELOCIDADE_MAX = 350;
	}
	//sobeescrever o método acelerar - sobeescrita de método
	public void acelerar() {
		//para usar a classe pai fazendo igual ao que ela faz uso o super
		//mais eu poderia simplemente redefinir o método acelerar de outra forma
		//Isso é pra redefenir sabendo que tô usando da classe pai, pois eu poderia ter
		//sobeescrevido esse método acelerarMais da classe pai aq, e aí como ele saberia
		//ql eu tva querendo usar? Para isso uso o super
		super.acelerarMais(20);
	}
}
package oo.heranca;

public class TestDrive {

	public static void main(String[] args) {
       Carro c = new Civic();
       c.acelerar();
       System.out.println(c.getVelocidadeAtual());
	
       //a variável c mudou!
       c = new Ferrari();
       c.acelerar();
       System.out.println(c.getVelocidadeAtual());
	}
}

//Dentro do pacote oo acrescento no nome dele .polimorfismo e fica 
//oo.polimorfismo crio a classe Comida
package oo.polimorfismo;

public class Comida {
	
	/**
	 * Peso em Kg 
	 */
	//com o cursor em cima da linha abaixo digite Alt+Shift+j(cria um java Doc)
	private double peso = 0;
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}
}
package oo.polimorfismo;

public class Arroz extends Comida{
	
}
package oo.polimorfismo;

//criei esta class apertando lá em cima do arquivo Arroz.java
//e apertando Ctrl+c e dps Ctrl+v e apenas mudando o nome da Classe
//então ela jáé criada como uma extensão de Comida, como arroz era.
public class Feijao extends Comida{
	
}
package oo.polimorfismo;

public class Pessoa {
	/**
	 * Peso em Kg 
	 */
	//com o cursor em cima da linha abaixo digite Alt+Shift+j(cria um java Doc)
	private double peso = 0;
 
	//método construtor de Pessoa
	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}
	
	public double getPeso() {
		return peso;
	}
	
	//Esses dois métodos com o mesmo nome, mas recebendo parâmetros
	//diferentes é um Polimorfismo estático = sobrecarga de métodos
	//É uma forma burra de fazer
	/*public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	} */
		
	//Polimorfismo dinâmico pra acabar com a perda
	//de tempo do polimorfismo estático visto acima
    public void comer(Comida comida) {
    	this.peso += comida.getPeso(); 
    }
//aí a chamada é assim!
//	pessoa.comer(arroz);
//	pessoa.comer(feijao);
//	pessoa.comer(sorvete);
}
package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		Arroz arroz = new Arroz();
		arroz.setPeso(0.250);
		
		Feijao feijao = new Feijao();
		feijao.setPeso(0.280);
		
		Sorvete sorvete = new Sorvete();
		sorvete.setPeso(0.160);
		
		Pessoa pessoa = new Pessoa(80.7);
		pessoa.comer(arroz);
		pessoa.comer(feijao);
		pessoa.comer(sorvete);
		/*Olhe como é o método na classe Pessoa:
     //Polimorfismo dinâmico pra acabar com a perda
	//de tempo do polimorfismo estático visto acima
    public void comer(Comida comida) {
    	this.peso += comida.getPeso(); 
    }*/
		
		
		System.out.println(pessoa.getPeso());
		
				
	}

}
package oo.polimorfismo;

public class Sorvete extends Comida{
	
}

/*Linguagens e API

Fazem parte da linguagem java as Palavras reservadas são todas em minúsculo.
A palavra String não é reservada e sim faz
parte da API de Java. São poucas palavras. 
São 52 palavras reservadas do java. Principais:
Modificadores de acesso: private, protected e public,(default não se escreve, é só 
eu não colocar nda!). As palavras reservadas sé o core da linguagem.
Modificadores de classe, variáveis e métodos: abstract, class, extends, final, implements,
interface, native, new, static, stricfp, synchronizes, transient, valatile.
Operador: instanceof(para defenir uma instância de um objeto).
Estruturas de controle: xase, continue, default(no caso do switch), do, else, for, if, break, 
return, switch, while.
Tratamentos de erro: assert, catch, finally, throw, throws, try.
Controle de pacotes: import, package.
Tipos primitivos: boolean, byte, short, int, long, float, double, char.
Variáveis de referência: super, this.
Retorno método: void(ausência de retorno).
Não utilizados: const, qoto.
Literais reservados: null, true, false.


API - Appication Programming Interface. Me dá 
diversas funcionalidades para coisas do cotidiano.
Ex: Classe para acessar arquivos, pra interface gráficas,
para acessar banco de dados, para imprimir no console,
para obter algo do teclado. São milhares e milhares de classes.
Inclusive tem a API oficial do java que faz parte do próprio JDK
que vem no JRE como padão. Existem APIs que outras pessoas desenvolvem
que não vem nativamente no JRE, só vem a padrão. Existem
diversas outras APIs pra acessar web services, para consumir JSON, XML.
API são as classes que outras pessoas criam com funcionalidades para que eu
possa reusar. Tem APIs oficiais, que segem uma especificação oficial, como é
o caso do JPA, que não vem nativamente no JRE. Eu mesmo posso construir uma API
para fazer algo. Empresas criam APIs de validação, coisas que são reusáveis no pro-
jeto da empresa. API tem milhares e milhares de opções.
APIs existem pra que vc já tenha várias coisas prontas, pra que vc não tenha que 
reinventar a roda e tentar fazer um botão do zero, umma conexão com um banco de dados 
do zero etc. Qt mais API vc conheça do  java mais fluente a sua programação.




*/



