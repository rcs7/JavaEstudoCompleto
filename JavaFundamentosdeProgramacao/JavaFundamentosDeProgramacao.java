//R:\Udemy\Java Fundamentos de Programação\workspace\CursoJava
//Java : Fundamentos de Programação

//James Gosling - conhecido como o fundador da Java
//1990 - Green Project - Criação da linguagem Oak	
//1992 - Projeto Star 7 (*7) - Dispositivo para controlar uma casa inteligente
//1994 - Criação da Internet - Tim Berners Lee
//1994 - Oak foi rebatizada para Java
//1995 - Lançamento do Java e tb Javascript - Java tva mt popularizado o LibryScript
//(não sei se era msm esse novo) foi rebatizado para Javascript
//1996 - JDK 1.0
//2002 - JDK 1.4
//2004 - JDK 5.0  Trouxe mais novidades <Generics>, foreach, annotations, enum
//2006 - JDK 6.0 Web Services,  JDBC 4.0, rhino, foi disponibilizado como código aberto
//2010 - ORACLE comprou a SUM e passou a ser a proprietária do java, a VM passou a ser
//desenvolvida
//2011 - JDK 7.0 switch com "string", operador, 1_000_000
//2014 - JDK 8.0 lambda, stream, nashorn - paradigma funcional
//java 9:
/*Leia este post: http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-9/*/

//Por que aprender java:
//9 milhões de devs(desenvolvedores) no mundo
//97? dos computadores das empresas executam java
//Plataforma de desenvolvimento mais utilizadas
//Linguagem mais utilizada do mundo
//Androi nativamente usando java
//Java surgiu a partir da linguagem C e a C gerou vários tipos de linguagens
//(Liguagens C-Like):
//Swiff, Javascript, C#, C++, Objective C, PHP
//Linguagem central e mais fácil e modernoa do q C - conceitos de programação objeto e tb paradigma funcional
//Escolha segura pq mtas empresas usam Java

//Estrutura de dados: fila(FIFO), lista, pilha(LIFO), árvore, tabela
//Estrutura básicas de dados: int, float ...

//JDK - voltado para desenvolvimnto
//JRE - voltado para execução
//ECLIPSE

//baixo o JDK noo site da ORACLE: Java SE Development Kit 
//baixo o eclipse: Eclipse IDE for java EE Developers que é a versão mais completa e serve já pra web tb
//Colocarei tds os meu arqs dentro da pasta R:\Udemy\Java Fundamentos de Programação\workspace

//instalado o eclipse, fecho a parte de boas-vindas
//Dentro do eclipse eu mudo a perspectiva colocando java, pois ela vem java EE
//clico em window -> show view -> console pra q apareça o console
//fecho todas as outras abas e deixo só a do console aberta 
//fecho as outras abas q estão abertas
//mudo o tema: windows preference->General->appereance e mudo o thema pra dark
//tb vou lá em collors and font lá em basic e mudo pra 26 o tam da font

//É importante estar na persspectiva java pra ver as mesmas configs do prof(Ctrl+F8 pra mudar perspectiva)
//Se eu fechar alguma janela q eu queria a recupero em window -> show view.
//lá encontro o Packge Explorer e clico nele pra a janela dele ficar aparecendo	

//Criando o projeto
//new -> Java Project com o name CursoJava
//Se eu quisesse importar meu projeto é botao direito -> import->General->Existent Project Into Workspace 
//e lá procuro a pasta e seleciono e só. Para exportar é só ir lá onde tá salvo o projeto, ou seja, na workspace 
//e copiar e colar na pasta q quero	 

//Pacote(Pasta)
//class(Arquivo, nem smp é)
//Main(porta de entrada de um programa java, dentro da classe posso ter ou não uma main)

//Fazendo o primeiro programa:
//Em cima da pasta src ->botao direito-> new->class
//coloco o name do packge : Fundamementos e a classname: PrimeiroPrograma
//classe criada, entao dentro dela escrevo main e dps aperto Ctrl+Espaco(principal atalho do eclipse)
//a tecla Ctrl+Shift+f formata o código novamente

//Existem 3 tipos de comentários no Java:
//,/**/ e 
//E esse comentário é o javadoc /** */ ele cria uma pág la com as informações do meu código
//ele possui vários metadados:
//@author ABC
//@since 1.0
//@version 3.0

//Lá em cima do pacote fudamentos, crio uma nova class chamada de comentário
//crio uma class main dentro dele, escrevo main e dps clico em Ctrl+Espaço
//comente lá com "//" aí obs q td o q escrevo ele diz como se tivesse errado aí eu clico
//Ctrl+1 e seleciono disable spell check. Pq ele só corrige certo o inglês
//os @s dos comentários deste tipo q eu crio vão ser visto lá na pág web criada

//Java é Fortemente Tipada. Tem que dizer q tipo é pra poder criar a variável. E a partir do momento
//que foi criado o tipo dela, ela eh esse tipo e pronto.
//Em Java as variáveis são case sensitive, ex: a variável casa é diferente da Casa.

//Convenções:
//Variáveis comelCase. Ex: casaDePapel
//Constantes: NAVIO_ESCOLA

//Outra classe agr. Lembrando que é dentro do package Fundamentos
//Class chamada VariaveisEConstantes
//ex de contante: Obs: Uso o final
final double PI = 3.1416;

//obs: na hr de compilar, deixe aberto só a class q eu quero compilar, é
//melhor pra não ter q ficar escolhendo, já que no nosso projeto ele tá fazendo classes
//independentes.
System.out.println("área é "+ area + "m2.");
System.out.printf("Área é %f m2.", area);
System.out.printf("Área é %.2f m2.\n", area);

//Agr outra class dentro do msm pacote chamada notação ponto
// qd coloco um "." pode ser dados ou comportamento
String s = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");
System.out.println(s);//out é um dado e println() é um comportamento
//comportamento tem "()"
//System é uma class que possui uma class out que possui essa função println

//Criando mais uma class a Import dentro deste msm pacote Fundamentos
//Atalho : Syso + Ctrl + Espaço + Enter aparece o System.out.println();
//Falando sobre os imports
//Atalho: Ctrl + Shift + T vejo todas as classes que estou trabalhando
//Se eu digitar System eu vejo que ele está dentro da class java.lang e ele está disponível 
//por padrão em qlq cód que for digitado sem precisar de import-
//Classe Double tb posso usar e nem aparece nenhum import dentro do cód
//Class Button, eu posso usar, mas lá aparece um import java.awt.Button;
//OBS: Tem que digitar But enfim e digitar Ctrl+Espaço pra aparecer a opção da class Button pra que o java ajude
//e coloque lá em cima o import desta class. Se o aluno escrever normal, não aparece o import 
//e dá erro pq o Java não reconhece. 
//Se eu deixar um import que eu não uso lá e apertar
//Ctrl+Shift+o ele os tira

//TIPOS PRIMITIVOS
//Em java tudo é class, exceto os tipos primitivos
//só tem aquele valor que a própria variável carrega, já os objetos
//tem dados e comportamentos
//8 tipos primitivos de Java (pois nem td eh objeto!)
//  NUMÉRICOS
//Inteiro:
//byte 8 bits sendo o bit mais significativo representando o sinal dele 01110101 o 0 é o sinal
//0 é positivo e 1 é negativo
//short = 2 bytes
//int = 4 bytes 
//long = 8 bytes
//  NUMÉRICOS
//Ponto flutuante:
//float = 4 bytes
//double = 8 bytes
//    CHAR
//1 caractere
//    BOOLEAN
// True e false
//Em java não aceitá-se 0 e 1 pra definir vdd e falso!

//Crio a class ainda dentro do msm pacote, chamada TiposPrimitivos

//Tipo primitivo boleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b", bo1, bo2);
	
		//Tipo primitivo caracter
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050'; //cód da tab unicode do 'P'
		System.out.printf("%c %c %c\n", c1, c2,c3);
		System.out.println(c1); //imprime a
		System.out.println(c1+0); //imprime 97 
			
		//Tipos primitivos inteiros
		//Vou pÔr q os valores máximos positivos de cada inteiro
		byte b = 127; //Se eu colocasse 128 dava erro pq ele só vai até 127
		short s = 32767;
		int i = 2_147_483_647; // esses '_' é pra ficaar mais legível, mas pode ser sem
		long l = 9_223_372_036_854_775_807L; //Tem q por o L para dizer que não é inteiro pq o java
		//reconhece como um int e não é, é long
		System.out.printf("%d %d %d %d\n", b,s,i,l);
		//Imprimo td em binário e percebo que cada um tem um bit a menos
		//tipo o byte era pra ser 01111111 mas só aparece 1111111, pois o 0
		//é o bit mais significativo q significa que o número é positivo,
		//se fosse negativo seria 1
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		//System.out.println(Integer.toBinaryString(l));;
		
	    //Tipos primitivos reais (ponto flutuante)
		//Em java por padrão o tipo flutuante é double, tanto é que se eu 
		//for usar o float tenho que colocar esse f aí de baixo do ex:
		float f = 3.1416f;
		double d = 2.45;
		System.out.printf("%f %f \n",f, d);
		System.out.printf("%.2f %.1f\n",f, d);

//Objetos primitivos (Wrappers =  envoltório) - tb são 8
//crio a class ObjetosPrimitivosWrappers
		Character c = 'a';
		Boolean bo = true;
		
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		
		Float f = 5.1f;
		Double d = 6.1;
		
		System.out.println(bo.toString().length());
		//Que eh o ms que fazer
		System.out.println("true".length());

//Conversões(Primitivos)
//Implícitas - Não há possibilidade de perda de informação. Ex: float para um Double. Ex: int para long.
//Explícitas(cast)- qd há a possibilidade de perda ao converter de 
//um tipo pra outro. Ex: de double para float. Ex: float para int

//Crio uma nova classe chamada ConversaoNumerica

//Conversão explícita:
		//float f = 0.1; // isso dá erro,
		//diz que não posso converter double para int
		float f = (float) 0.1;
		System.out.println(f);
	
		//Conversão explícita
		int i1 = (int) 7.9; // double para int, imprime 7
		System.out.println(i1);
		
		//Conversão Implícita
		int i2 = 'a'; //imprime 97
		System.out.println(i2);
		
		//Conversão Implícita
		double d = 1001; //int para double
		System.out.println(d); //1001.0
	
//Crio a Class ConversaoStringNumero
		//tela que o Java tem pronta pra receber um trato do usuário
		String resposta1 = JOptionPane.showInputDialog("Qual é a nota 1");
		String resposta2 = JOptionPane.showInputDialog("Qual é a nota 2");
	
		System.out.println(resposta1 + resposta2);
	
		//converter string em double
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double total = nota1 + nota2;
		
		System.out.println(total/2);
		
		//Inteiros
		byte n1 = Byte.parseByte("1");
	    System.out.println(n1);
		short n2 = Short.parseShort("2");
		System.out.println(n2);
		int n3 = Integer.parseInt("3");
		System.out.println(n3);
		long n4 = Long.parseLong("4");
		System.out.println(n4);
		
		//Reais(Ponto flutuante)
		float n5 = Float.parseFloat("1.2");
		System.out.println(n5);
		double n6 = Double.parseDouble("2.4");
		System.out.println(n6);
		
		//Booleano
		boolean fal = Boolean.parseBoolean("false");
		System.out.println(fal);
		
//Crio class chamada ConversaoNumeroString
		public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString());
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2));
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num2).length());
		
/* Operadores - Tabela de Precedência
Seção 3, aula 22
Operadores - Tabela de Precedência

Recursos para esta aula
Operadores Java - Tabela de Precedência.pdf  */

//Crio a Class OperadoresAritmeticos
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		//operadores: +, -, * e %
		//+, - é da esq para a direita
		int soma = num1 + num2 + num3 + 6;
		System.out.println(soma);
		System.out.println(num1 - num2 - num3);
	
		//Cuidado com a precedência:
		System.out.println(num1 + num3 * num2 / 2);
		System.out.println((num1 + num3) * num2 / 2);
	
		//Resto da divisão
		System.out.println(10 % 3);

//Crio a Class OperadoresRelacionais
//Operadores relacionais: ==, !=, >=, <=, >, <
	int num1 = 97;
	int num2 = 'a'; // 'a' é convertido implicitamente para 97

	System.out.println(num1 == num2);
	System.out.println(3 != 2);
	System.out.println(3 >= 2);
	System.out.println(3 <= 2);
	System.out.println(3 > 2);
	System.out.println(3 < 2);

//Crio a Class OperadoresLogicos
	//Operadores Lógicos
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		
		// & e | é pra operações bit a bit ou qd quero q ele analise tda a sentença
		//qd de início ele poderia já ter a resposta(desnecessário)
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
	    
		//ou exclusivo: diferentes = true e iguais = false
		//ou seja ele gosta do diferente
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("TV 50 = " + comprouTv50);
		System.out.println("TV 32 = " + comprouTv32);
		
		//Operador unário intruso
		System.out.println("Fome = "+ !comprouSorvete);

//Crio a Class OperadoresAtribuicao
int a = 7;
		int b = 3;
		
		b += a; //b = b+a;
		b *= 4; //b = b*4;
		b /= 2; //b = b/2;
		b -= 2; //b = b-2;
		b %= 2; //b = b%2;
		
		System.out.println(b);
//Crio a Class OperadoresUnarios
int num1 = 1;
		int num2 = 2;
		
		//Incremento e decremento
		num1++; //pós fixado
		System.out.println(num1);
		--num1; //pré fixado
		System.out.println(num1);
		
		//Incremento antes da comparação e o decremento depois da comparação
		//Linha abaixo é má programação pq tem ficar pensando! Facilite a leitura!
		System.out.println(++num1 == num2--);
		System.out.println(num1); //2
		System.out.println(num2); //1
		System.out.println(++num1 == num2--); //false
		
		//Complemento Binário '~' - inverão de cada bit de 50
		System.out.println(Integer.toBinaryString(50)); // 110010
		System.out.println(Integer.toBinaryString(~50)); // 110010
		//resulta em 1111111..111001101 pega td que era 0 antes e vira um e inverte o resto tb
		//32 bits = 4 bytes de um número inteiro

		//Negação lógica
		System.out.println(!true);//False	

//Crio a Class OperadorTernario
		double nota = 7.1;
		String resultado = nota >= 7 ? "Aprovado" : "Recuperação"; //Aprovado
		System.out.println(resultado);

//JVM - Java Virtual Machine(Máquina Virtual Java): Não foi o Java que inventou essa conceituação de MV.
//Ele simplemente usou esse conceito pra conseguir o "Escreva uma vez e rode em qlq lugar". Escrevo em Java
//e ele é compilado pra Byte Code(Como se fosse um java virtual que qlq MV tem que entender esse Byte Code)
//e aí a MV traduz pra o ambiente específico no qual a MV foi construída. Ex: Uma MV foi constida pra Windows
//(ou Blu-ray )(ou Android), ela pega o Byte Code e tranforma em comandos que ele entenda. Ou seja, eu escrevo 
//um código em Java e ele é convertido pra Byte Code e esse Byte Code é interpretado pela MV.
//Existe MV pra tal coisa(Eletrodoméstico, S.O, dispositivo móvel etc), se existir, então o java com certeza 
//será utilizado dentro dela. Obs: JVMs(Máquinas virtuas) são feitas específicas para cada dispositivo.
//Então a complexidade passa exatamente para que constroe as MVs e não pra os que constroem o Java pq o Byte Code 
//é universal.

// JRE - Java Runtime Environment(Ambiente de execução Java) é pra qd quero executar um programa em Java. Vou
//intalar na máq do meu cliente, na minha máq em ksa que eu não uso pra desenvvolver. Ou seja, ele vai ser responsável 
//por executar um programa Java e fazer com que o usuário Java possa utilizar Java.
//Dentro dele tem a VM que tb é a base dele.

// JDK - Java Development Kit (Kit de Desenvolvimento Java).
//Dentro dele tem a VM que tb é a base dele. Dentro do JDK 
//tenho coisas que são específicas para programador: debbuguer, compilador,
//gerador de documentação. Qd uso o Eclipse não preciso necessariamente instalar o JDK.
//Só com o JRE já daria certo pq dentro do Eclipse já tem compilador , Debbuger etc. 
//Mas é importante a instalação do JDk pq se por ex eu quero saber o que tem dentro da class String, Math posso depurar
//e ver o que tem lá dentro. Ou sej, instale pq ele te dá alguns conjuntos de coisas que talvez vc precise de algo mais
//avançado.

//Java - comando para executar um programa em Java.
//Javac - Java Compiler - serve pra compilar um arquivo Java. Gera um arq .java e um .class que é um Byte Code que é um binário.

//Lá no Eclipse qd eu vou em Project-> Build Automatically
//qd eu salvo um projeto ele gera automaticamente um arq .class. Qd salvo ele roda o javac que transforma o arq .java em .class.

/*Processo de compilação*/
//Escrevo o arquivo .java... dps salvo ou executo o compilador-> Compilação (javac)-> Byte Code(.class)- e é esse arq .class que 
//é um arq binário e que tem dentro o Byte Code que a ling universal que todas as MV entendem e aí ele é interpretado pela máq 
//virtual JVM que possui dentro dela um interpretador deste arq e ele converte o Byte code em chamadas para o seu S.O(ou da 
//plataforma que estou executando aquele programa) e aí o interpretador transforma isso em código nativo. Só a MV que entende o 
//Byte code e ela é específica para cada plataforma.  

/*Na Máq virtual há um conceito chamado de Hotspot que são pontos extremamente usados na sua aplicação. Então ao invés da VM ficar 
pegando Byte code e transformando para chamadas nativas, ela pega aquele ponto, compila pra uma chamada nativa e fica usando aquele 
cód sem precisar fazer a conversão(a interpretação de Byte code pra chamadas nativas), ela ja gera o cód nativo pronto. Ou seja otimiza para
ganhar velocidade.*/

/*Crio um arq lá no notpad Compilacao.java
 public class Compilacao{
	 public static void main(String[] args){
		System.out.println("Teste compilação manula");
	 }
 }
 e dps vou lá no cmd e entro em Desktop que é onde irei salvar o arquivo q fiz
 vou lá em C:\Program Files\Java\jdk1.8.0_151\bin
 copio isso e acrescento javac tipo assim: 
 "C:\Program Files\Java\jdk1.8.0_151\bin\javac"
  e o nome do arquivo. java. Ou seja, o comando é esse:
  "C:\Program Files\Java\jdk1.8.0_151\bin\javac" Compilacao.java
  
  Pronto, lá em Desktop já foi gerado o arq.class, ou seja,
  Compilalcao.class
  
  Agr lá msm no cmd digito o msm comando sendo que agr nao é javac e sim 
  só java e o nome do arq sem o .java:
  "C:\Program Files\Java\jdk1.8.0_151\bin\java" Compilacao
  */

//Abro lá a class que fiz antigamente chamada Comentarios e vou lá em Project->
//Generate Javadoc e seleciono o executável do java doc pra que ele faça o precessamento.
//E só quem tem o javadoc é oo jdk, então vou lá na pasta do jdk na pasta bin e abro o 
//javadoc.exe a pasta de destino já tá selecionada: R:\Udemy\Java Fundamentos de 
// Programação\workspace\CursoJava\doc, aí clico em next e finish e yes.
//Então ele gera lá no eclipse no canto esquerdo a pastinha Doc
//Vou lá em R:\Udemy\Java Fundamentos de Programação\workspace\CursoJava\doc e clico em
//index.html. Pronto agr é só dá uma olhada na pág lá. Encorage-se a usar o javadoc e posso
//publicar isso pro seu time. Mas obs, crie com comentários relevantes.

/*Exercícios: Conceitos Básicos
Seção 3, aula 32
Fundamentos

Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

*/