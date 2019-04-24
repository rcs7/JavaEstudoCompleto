//Arrays e collections

/*Java 8 trouxe várias novidades(funcionalidades) na API de collection
//Estruturas de dados que nos ajudam a referenciar vários objetos e uma única estrutura.

Array - homegênios(dados do mesmo tipo). É estático(tem tamanho fixo).
Estrutura indexada. Começando do índice 0. É um abjeto, ou seja, tem atributos e comportamentos.

Matriz não existe em java. É um array de arrays.

Collection - conjunto de várias estruturas de dados no java, que é algo mais moderno.
E elas têm um grande vantagem sobre os arrays, pq elas são estruturas dinâmicas, ou seja,
elas crescem a partir de adição de novos elementos.

As collections são dinâmicas e podem ser heterogêneas - misturas vários tipos(número, String, 
boolean, objeto etc), mas não há vantagem em fazer isso, pois não é boa prática. As collections
também podem ser homegênias é melhor.

Tipos de collections:
set - estruturas não ordenadas (por padrão)
      não indexadas
	  não aceita repetição, ex: 1. Então não posso pôr outro 1(ignora).
List - Indexada
        Aceita repetição
Map - Chave(Set)/Valor(List). 
Queue(Fila) - First in/First out (FIFO)
Stack(Pilha) - Last in/First out (LIFO)

//Aula sobre Array
//Crio a class Array dentro de um novo package chamado coleções
*/package Coleções;

public class Array {

	public static void main(String[] args) {
		double[] notasJoao = {7.0,8.7,6.2,4.9,9.7};
		//Ou - dá no msm!
		//double []notasJoao = {7.0,8.7,6.2,4.9,9.7};
		//double notasJoao[] = {7.0,8.7,6.2,4.9,9.7};
		double[] notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;
		//Daria erro:
		//notasPedro[5] = 9.2;
		//java.lang.ArrayIndexOutOfBoundsException: 5
		//at Coleções.Array.main(Array.java:16)
		//A de baixo dá erro!
		//[]double notasJoao= {7.0,8.7,6.2,4.9,9.7};
		//double[] notasPedro = new double[];
		//Obs: é obrigatória a definição do tamanho do Array
		//já na criação dele
		
		double totalJoao = 0;
		for(int i=0; i<notasJoao.length; i++) {
			totalJoao += notasJoao[i];
		}
		double totalPedro =0 ;
		for(int i=0; i<notasPedro.length; i++) {
			totalPedro += notasPedro[i];
		}
		
		System.out.println(totalJoao/notasJoao.length);
		System.out.println(totalPedro/notasPedro.length);
	
	}
}
// For (each) - serve tanto para Arrays qt pra collections
//Para percorrer um elemento e queremos partir do primeiro passar
//por todos e chegar até o último elemento.
//Se for de outro modo a forma que eu quero percorrer, então tenho que usar um for normal 
//e um índice.
// crio a class ForEach dentro do package collection
//Atalho Ctr + \ + espace = comenta td que tiver selecionado
//       Ctr + F
//Obs: Não escreve for each e sim for
package Coleções;
//serve para Arrays e Collections
public class ForEach {

	public static void main(String[] args) {
		double[] notasJoao = {7.0,8.7,6.2,4.9,9.7};
		//Ou - dá no msm!
		//double []notasJoao = {7.0,8.7,6.2,4.9,9.7};
		//double notasJoao[] = {7.0,8.7,6.2,4.9,9.7};
		double[] notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;
		//Daria erro:
		//notasPedro[5] = 9.2;
		//java.lang.ArrayIndexOutOfBoundsException: 5
		//at Coleções.Array.main(Array.java:16)
		//A de baixo dá erro!
		//[]double notasJoao= {7.0,8.7,6.2,4.9,9.7};
		//double[] notasPedro = new double[];
		//Obs: é obrigatória a definição do tamanho do Array
		//já na criação dele
		
		double totalJoao = 0;
		//for each: a variável nota recebe cada elemento do array por vez
		for(double nota: notasJoao) {
			totalJoao += nota;
		}
		
		double totalPedro =0 ;
		for(double nota: notasPedro) {
			totalPedro += nota;
		}
		
		System.out.println(totalJoao/notasJoao.length);
		System.out.println(totalPedro/notasPedro.length);
	}
}
//Em java não existe Matriz. Existe Array de Array
//Matriz : estrutura de 2 dimensões
//Array 2 Dim:
//   [0]          [1]        [2]
//[0][1][2]    [0][1][2]  [0][1][2]
//Não precisa ser uma esrutura simétrica, então posso ir colocando
//arrays dentro de arrays da forma que eu quiser

int[] a1; //Array de 1 dimen
int[][] a2; //Array de 2 dims
int[][][] a3; //Array de 3 dims
int a3[][][]; //Array de 3 dims
int[][][] multidim = new int[3][3][3];
int multidim[][][] = new int[3][3][3];

//Sintaxe válida, mas confunde, pois não é uma boa prática!
int [][]multidim[] = new int[3][3][3];
int [] []multidim[] = new int[3][3][3];

//Crio a class Matriz(Em java não existe Matriz e sim Array de Arrays) dentro do package 
//colleções
package Coleções;

public class Matriz {

	public static void main(String[] args) {
		//Primeira nota que é 1 trab e 1 prova e 1 trab e 1 prova
		//Array de Arrays
		//É como uma matriz de 2x2
		double[][] notasJoao = {{7.7, 8.6},{6.2,9.7}};
		
		double[][] notasPedro = new double[2][]; //o Array externo é composto por 
		//dois Arrays
		//Mas esses Arrays podem conter a qtd de elementos que eu quiser colocar
		//Posso ter nums variados. O primeiro elemento desse array externo pode ter, 
		//por ex, 3 elems
		//e o outro elemento deste Array externo ter 10, por ex.
		notasPedro[0] = new double[2];
		notasPedro[1] = new double[2];
		notasPedro[0][0] = 7.7;
		notasPedro[0][1] = 8.6;
		notasPedro[1][0] = 6.2;
		notasPedro[1][1] = 9.7;
	
		double totalJoao = 0;
		int qtdeNotasJoao = 0;
		
		for(int i=0; i<notasJoao.length; i++) {
			for(int j = 0; j<notasJoao[i].length;j++) {
				totalJoao += notasJoao[i][j];
				qtdeNotasJoao++;
			}
		}
	   //Usando for each
		double totalPedro = 0;
		int qtdeNotasPedro = 0;
		for(double[] notasParciais:notasPedro) {
			for(double nota: notasParciais) {
				totalPedro += nota;
				qtdeNotasPedro++;
			}
		}
		
		System.out.println(totalJoao/qtdeNotasJoao);
		System.out.println(totalPedro/qtdeNotasPedro);	
	}
	
//Set - é uma API do collection
//conjunto; não indexado; pode ser ordenada, mas por padrão ele não é ordenada.
//homogênea(dados do msm tipo) ou heterogêa(não é boa prática - ttaz desorganização).
//não aceita objetos igual, o segundo é iguinorado.

//Crio uma nova class dentro de coleções, chamada conjunto bagunçado.
package Coleções;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		//É um conjunto heteregênio e não é a melhor forma de criar um conjunto
		Set conjunto = new HashSet();//aperte Ctrl+Shift+o para importar
		//dá no msm por causa do polimorfismo
		//HashSet conjunto = new HashSet();//aperte Ctrl+Shift+o para importar
		
		//Esse método add retorna true se conseguiu add o elemento e false se não
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add..");
		//false  //true
		System.out.println(conjunto.add(1));//que já foi add anteriormente
		System.out.println(conjunto.add(10));
		//método size() está presente m todas as collections
        System.out.println("Size..."+conjunto.size());
        
        System.out.println("Remove...");
        //Se a remoção for bem sucedida ele retorna true e se não retorna false
        //retorna false pq aí é uma string e o 'a' que coloquei é um caracter(char)
        System.out.println(conjunto.remove("a"));
        //char diferente de string
        System.out.println(conjunto.remove('a'));//retorna true
        System.out.println("Size..."+conjunto.size());
        
        System.out.println("Contains...");
        //verifica se um elemento está contido ou não dentro da collection
        System.out.println(conjunto.contains('a'));//retorna false
        System.out.println(conjunto.contains(1));//retorna true
	
        //Criando outro conjunto
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        //união de 2 conjuntos: conjunto e nums. Add dentro do conjunto
        //conjunto o conjunto nums:
        //conjunto.addAll(nums);
        
        //Interseção de dois conjuntos
        conjunto.retainAll(nums);
        
        //conjunto interseção nums
        //o único elemento que é interseção entre esses conjs é 
        //o número 1. Logo o conjunto conjunto agora só tem um 
        //elemento o número 1.
        System.out.println("Size...");
        System.out.println(conjunto.size());
        
        conjunto.clear(); //Limpa o conjunto, ou seja, o deixa vazio
        System.out.println(conjunto.isEmpty());
       }
}
//Crio a class ConjuntoComportado
package Coleções;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Conjunto homogêneo. Usa Genérics"<>"
		//Set<String> aprovados = new HashSet<String>();
		//Esse abaixo faz um conjunto ordenado, se esse conjunto for de String ou de 
		//Números não importa. Na hr da impressão estará em ordem
		Set<String> aprovados = new TreeSet<String>();
		//Esse abaixo respeita a ordem de inserção na hora da impressão, coisa que o
		//HashSet não faz
		//Atalho Ctrl+Shift+o pra ele importar, caso não import
		//Set<String> aprovados = new LinkedHashSet<String>();
		//Set<String> aprovados = new HashSet<>(); poderia ser assim pq o java infere
		//Antes era assim: homogêneo
		//Set aprovados = new HashSet();
		aprovados.add("João");
		//aprovados.add(1);//dá erro pq não é do tipo String
		aprovados.add("Pedro");
		aprovados.add("Maria");
	    aprovados.add("Rafael");
		
		//pra imprimir os elementos do conjunto:
		//for each
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		//Obs que ele obedece ordem nenhuma, nem alfabética e nem de inserção
	    //Se eu fosse imprimir no caso de um conj. heterogêneo:
		for(Object nome: aprovados) {
			System.out.println(nome);
		}
	}
}
//Lista
//  Indexada
//  cresce dinâmicamente
//  homogênea e heterogênea(má prática)
//  Pode conter um elemento mais de uma vez dentro dele
//  Ordenado por ordem de inserção - LIFO.
//Crio a class Lista
package Coleções;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
        //dps de escrever este comando digito Crl+Shift+o p/ importar
		List<String> aprovados = new ArrayList<>();
		//ou
		//List<String> aprovados = new ArrayList<>();
		//ArrayList<String> aprovados = new ArrayList<String>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		//A diferença do List pro Set é que o List é indexado
		//Então tem o método get:
		System.out.println("Get...");
		System.out.println(aprovados.get(1));
		
		System.out.println("Add...");
		System.out.println(aprovados.add("Maria"));
		System.out.println("Size... "+aprovados.size());
		
		System.out.println("Remove...");
		//Retorna false pois é "Maria" e não "maria"
		System.out.println(aprovados.remove("maria"));
		System.out.println(aprovados.remove("Maria"));//true
		System.out.println("Size..." + aprovados.size());
 
		//for each
		for(String nome: aprovados) {
			System.out.println(nome);
		}
	}
}
//Fila - Queue -"Quiu"
//FIFO
//Critério de ordenação pode influenciar - por ex,
//Mais velhos primeiro, mais rico ou sei lá. Mas a fila 
//é smp FIFO. 
//crio a class Fila
package Coleções;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		//LinkedList é uma fila, posso por tb List no lugar de Queue 
		Queue<String> fila = new LinkedList<String>();
		//ou
		//Queue<String> fila = new LinkedList<>();
	    //Faz a mesma coisa que add, só q se houver algum problema na
		//hr de inserir ele só retorna false, mas se for o add ele joga um erro
		fila.offer("Maria");
		fila.offer("João");
		fila.offer("Pedro");
		//consula o primeiro elemento que está na fila e retorna sem o removê-lo
		//Qd a fila está vazia o peek retorna nullo, já o element não retorna nullo
		//ele simplesmente gera um erro pra vc
		//Esses dois métodos é como se alguém chegasse e perguntasse:
		//Quem é o primeiro da fila: alguém vai lá e responde.
		System.out.println("Peek/Element...");
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Poll/Remove...");
		//Imprime Maria, mas tb a remove!
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());//removi todos
		//A fila tá vazia, o método poll retorna null
		System.out.println(fila.poll());
		//A fila tá vazia, o remove retorna um erro!
		System.out.println(fila.remove());
  }
}
//Stack - "Isték" (Pilha)
//        LIFO
//        Critérios de ordenação pode influenciar
//  push() - coloca no topo da pilha
//  peek() - consulta quem tá no topo da pilha, mas
//não tira da pilha.
//  pop() - Além de retornar o objeto no topo, ele tb
//o retira.
//Crio a class Pilha
package Coleções;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack();
		//ou
		//Stack<String> pilha = new Stack<String>();
		//Coloca um elemento na pilha
		pilha.push("O Pequeno Príncipe");
		pilha.push("O Hobbit");
		pilha.push("Dom Quixote");
	
	//  peek() - consulta quem tá no topo da pilha, mas
		System.out.println("peek...");
		System.out.println(pilha.peek());
		
		System.out.println("pop...");
	//  pop() - Além de retornar o objeto no topo, ele tb
	//o retira.
		System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
       //Agr a pilha está vazia, se eu fiz um pop()
       //ele retorna um erro!
 //       System.out.println(pilha.pop());
       
        //Essa class - essa collection implementa tanto uma pilha qt uma fila tb
        Deque<String> pilha2 = new ArrayDeque<String>();
        //ou 
        //Deque<String> pilha2 = new ArrayDeque<>();
        //Coisas relacionadas a pilha
        System.out.println("Usando o 'Deque<String> pilha2 = new ArrayDeque<String>();'");
        pilha2.push("O Pequeno Príncipe2");
		pilha2.push("O Hobbit2");
		pilha2.push("Dom Quixote2");
	
	//  peek() - consulta quem tá no topo da pilha, mas
		System.out.println("peek...");
		System.out.println(pilha2.peek());
		
		System.out.println("pop...");
	//  pop() - Além de retornar o objeto no topo, ele tb
	//o retira.
		System.out.println(pilha2.pop());
        System.out.println(pilha2.pop());
        System.out.println(pilha2.pop());
       //Agr a pilha está vazia, se eu fiz um pop()
       //ele retorna um erro!
        //System.out.println(pilha.pop());
        
        //Olha só que funciona como se fosse uma fila tb:
        pilha2.poll();
	}
}
//Um atalho que eu não sabia: Ctrl + D apaga a linha

/*Map - Estrutura de chave e valor
      - Set / List -- chave / Valor
	  - Set / lis( estrutura que não aceita repetição, se eu colocar
	  valores repetidos, ele simplesmente substitui o primeiro valor 
      pelo segundo valor. Diferente do que o acontecia com o set que ele 
	  simplesmente ignora.
	  Estrutura dinâmica
	  Pode ser usado de forma heterogênea(não apropriado) e homogênea
	  Na chave eu não aceito repetição e no valor eu aceito repetição
	  
	  Na hr de percorrer um map, tenho 3 formas:
	  - Apenas as chaves
	  - Apenas valores
	  - Chave e valor ao mesmo tempo
	  */
	  
	  //Crio a class mapa
	  package Coleções;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		//Map<K, V>
		Map<Integer,String> aprovados = new HashMap<>();
		//ou Map<Integer, String> aprovados = new HashMap<Integer,String>();
		//O que antes era add agr é put aq em Map:
		//aprovados.put(key, value);
		//Se eu der um put e escrever um registro com um chave que já existe, 
		//haverá a substituição
		aprovados.put(1, "Pedro");
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Carlos");
		
		//3 formas de obter os dados usando Map
		//1 - obter o conjunto de chaves:
		System.out.println(aprovados.keySet()); //[1,2,3,4]
		//2 - obter os valores
		//[Pedro, Ana, Bia, Carlos]
		System.out.println(aprovados.values());
		//3 - obter o conjunto completo com chaves e valores
		//[1=Pedro, 2=Ana, 3=Bia, 4=Carlos]
		System.out.println(aprovados.entrySet());
		
	   //Usando o put insiro um registro com a chave 3 que já
	   //existia, então há uma substituição de registro
		aprovados.put(3, "Beatriz");
		//pegando o valor do registro através da chave, uso o get
		//obs: não é índice e sim a chave
		System.out.println(aprovados.get(3)); //Beatriz
	
		//O Map tb tem o método contais(diz se um elemento está no Map), mas ele possui duas formas
		//lembrando que o contains retorna true or false
		System.out.println(aprovados.containsKey(4)); //true
		System.out.println(aprovados.containsValue("Bia")); //false
	
		System.out.println("chaves...");
		
		//for each
		for(Integer codigo:aprovados.keySet()) {
			System.out.println(codigo);
		}
		
		System.out.println("Valores...");
		for(String nome: aprovados.values()) {
				System.out.println(nome);
		}
	   
		 System.out.println("Chaves/Valores...");
		 for(Entry<Integer, String> registro: aprovados.entrySet()) {
			 System.out.println(registro.getKey() + " "+registro.getValue());
		 }
	}
}

//hashcode() e equals(obj) - usados para comparar objetos
//Falando do hashcode lembro logo do hashset, hashMap etc, aqueles lá das collection. Na
//vdd tdos usam esse hashcode como uma forma de buscar os objetos em uma estrutura
//como o map, set etc. 
/*hashcode() compara os objetos de uma forma mais superficial, a partir de um único code
de um inteiro e uma vez se o hashcode bate aí sim ele passa pro equals(obj) pra ele dizer
se é igual ou não. No equals(obj) apenas os objetos com o mesmo hashcode são comparados.
A comparação com o hashcode é mais rápida e no equals a comparação é mais completa, lenta e profunda.

Uma vez que o hashcode e o equals(obj) bate, então esse objetos são considerados iguais. Então
para comparação preciso implementar os dois. Se um não bater com o outro acontecem erros, problemas.
*/

//crio a class endereco
package Coleções;

public class Endereco {
	String logradouro;
	int numero;
	String complemento;

//Aperto Shift+Alt+s e escolho a opção: Generate hashcode and equals e aí
//ele gera td esse código abaixo:	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
/////////////////////////Eu fiz abaixo////////////////////////
	//Construtor:
	Endereco(String logradouro, int numero, String complemento){
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		
		
	}
}
package Coleções;

public class EnderecoTest {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		Endereco endereco2 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		//false, pois estou comparando endereços
		// "==" compara endereços de memória
		System.out.println(endereco1 == endereco2);
		//Como eu não implementei o método equals(), estou usando o padrão
		//que no fundo ele tb eh "==", então tb compara endereços
		//false se eu não gerar o equals. A explicação tá lá no código
		//da class endereço. 
		//Se eu gerar aí dá true
		System.out.println(endereco1.equals(endereco2));
		
		//Posso fazer meu equals manualmente, mas o eclipse gera pra mim, eu fazendo
		//Ctrl+Shift+s
	}
}

//            Revisão           //
/*Linguagens não estruturadas: não possuem função, tem estruturas de controle básicas.
Baseadas em go to(era um pulo no meio do código pra um ponto e pra outro etc).
Linguagens estruturadas: deriavam 3 paradigmas super importantes até hj.
Paradigma Procedural: ator principal é a função;
formatarData(nacimento); nascimento é o dado.
Paradigma Funcional;
Orientado a Objetos: ator principal é o objeto;
nascimento.formatarData(); nascimento é o objeto.
Classe é o molde.
Objeto é a instância, é a realização de uma classe.
O que diferencia um objeto de um outro objeto são os dados que eles possuem.
Classes e onjetos têm Membros e estes podem ser atributos e comportamentos.
Membros estáticos são específicos da classe. Um atributo estático, só tenho
uma cópia dele e ele pertence a classe. Então, todas as instâncias vão enxergar 
um único atributo, um único valor e esse valor será compartilhado entre todas as
instâncias;
Membros de instância: cada instância de uma classe tem sua cópia específica.
Comportamentos são métodos.
Construtores são métodos especiais que a partir de uma classe cria um novo objeto, ou seja
uma instância daquela classe.
static método(não preciso criar uma instância para poder usar um método de class, basta eu simplesmente
colocar o nome da classe.nomeDoMetodo(), mas se ele não tiver marcado como static, eu tenho que criar um objeto
pra poder usar aquele método) ou atributo.
Atribuição por valor - smp que for tipo primitivo e eu fizer uma atribuição de uma variável b para uma variável a,
o que é feito é uma cópia de valor, então as duas variáveis ficam independentes uma da outra.
Atribuição por referência - De objetos, a atribuição na vdd passa uma referência, onde o objeto está armazenado na memória,
então recebo o endereço de memória, então as duas variáveis vão apontar pra um mesmo endereço na memória e se eu fizer alteração
do valor de um do objeto , a outra variável vai percever a mudança
pq as duas apontam pra um mesmo lugar. 
*/
