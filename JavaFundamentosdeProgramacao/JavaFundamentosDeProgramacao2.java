/*Crio um novo pacote em cima de src, chamado controle
com uma e a Class com o nome If*/
double nota = 9.5;
		double nota2 = 6.5;
		double nota3 = 4.5;
		boolean bomComportamento = false;
		
		if(nota >= 9 && bomComportamento); {
			System.out.println("Quadro de honra!");
		}
		
		if(nota2 >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Recuperação");
		}
		
		if(nota3 >= 9) {
			System.out.println("Quadro de honra!");
		}else if(nota >= 7) {
		    System.out.println("Aprovado!");
		}else if(nota >= 3) {
			System.out.println("Recuperação + Trabalho");
		}else { //O else não é obrigatório
			System.out.println("Reprovado!");
		}
		
	}

//Crio a Class IfElse
			double nota = 6.5;
		
		if(nota >= 9) {
			System.out.println("Quadro de Honra!");
		}else {
			if(nota >= 7) {
				System.out.println("Aprovado!");
			}else {
				if(nota >= 5.5) {
					System.out.println("Recuperação!");
				}else {
					if(nota >= 3.5) {
						System.out.println("Recuperação + Trabalho!");
					}else {
						System.out.println("Reprovado!");
					}
				}
			}
		}
	}

}

//Crio a Class WhileIndeterminado
		
	
		//lê do teclado
		Scanner scanner = new Scanner(System.in);
	   // usei o Scanner, aparece automaticamente o import lá em cima
	   //import java.util.Scanner;
       //Se não aparecesse o import eu poderia digitar Ctrl+Shift+o 
	   //E ele apareceria o import

	   
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		//Qd não sei qts vezes preciso rodar o laço. Coloco a condição dentro do while 
		//de permanência! Pra permanecer no laço ql eh a condição? Essa é posta dentro 
		//do laço:
		//Esse valor -1 é chamado de sentinela. Podia ser outro num qlq
		while(nota != -1) {
			
			//escreva as notas assim: 9,3 e não 9.3(dá erro assim)
			//O Scanner interpreta português
			//SSe minha máq estiver configurada no padrão americano
			//aí sim, eu digitaria 9.3
			nota = scanner.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				somaDasNotas += nota; //somaDasNotas = somaDasNotas + nota
				numeroDeNotas++;
			}
		}
		//Não é obrigatório, mas é uma boa prática, pois
		//o Scanner consome recursos da minha máq!
		scanner.close();
		System.out.printf("A média é %.2f", somaDasNotas/numeroDeNotas);
	}

//Cria a Class WhileDeterminado
		Scanner scanner = new Scanner(System.in);
	   // usei o Scanner, aparece automaticamente o import lá em cima
	   //import java.util.Scanner;
	   //Se não aparecesse o import eu poderia digitar Ctrl+Shift+o 
	   //E ele apareceria o import

		double somaDasNotas = 0;
		double nota = 0;
		
		int indice = 0;
		
		//Laço While executado com uma qtd determinada de vezes
		//Lembrando que a condição do while é de permanência
		while(indice <3) {
			//escreva as notas assim: 9,3 e não 9.3(dá erro assim)
			//O Scanner interpreta português
			//SSe minha máq estiver configurada no padrão americano
			//aí sim, eu digitaria 9.3
			nota = scanner.nextDouble();
			somaDasNotas +=nota;
			indice++;
		}
		//Não é obrigado, mas é boa prática
		scanner.close();
		System.out.printf("A média é %.2f", somaDasNotas/3);
	}
	
//crio a Class For
		//Qd tenho uma determinada de vezes que quero que repita
		//uso o for
		//Se não aparecesse o import eu poderia digitar Ctrl+Shift+o 
	    //E ele apareceria o import
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		//Use o for em qtds determinadas de vezes, melhor do que usar while determinado
		//Deixe pra usar while qd a qtd de vezes for indeterminada
		for(int indice = 0; indice <3; indice++){
			//lembre-se que Scanner recebe número em português já que meu teclado tá em Port
			//9,3 ok, mas 9.3 dá erro! Sò pegaria se o teclado estivesse no padrão americano
			nota = scanner.nextDouble();
			somaDasNotas += nota;
			
		}
		scanner.close();
		System.out.printf("A média é %.2f", somaDasNotas/3);
	}

//crio a Class DoWhile	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		do {
			nota = scanner.nextDouble();
			
			if(nota <= 10 && nota >=0) {
				somaDasNotas += nota; //atribuição aditiva
				numeroDeNotas++;
			}
		}while(nota != -1); //Não esquecer do ';'

		//O laço mais comum é o for do que o while
		//O laço mais comum é o while do que o do while
		scanner.close();
		System.out.printf("A média é %.2f", somaDasNotas/numeroDeNotas);
	}
//Crio a class Switch ainda dentro do package controle
//switch(valor), onde o valor pode ser um enum, 'letra(caractere)', 
//inteiro mais não pode ser long e uma "string". Obrigatóriamente dps dele vem
//um bloco de código, ou seja, tem que tem {}, não podendo vir após ele
//apenas uma sentença.
/*

  switch(valor){
	case ? :
		Sentença;
		break;
}
  switch(valor){
	case ?:
    case ??:
		Sentença;
  }

  switch(valor){
	case?: Sentença1;break;
	case??: Sentença2;break;
	default: Sentença3; //pode vir em qlq ordem. Se esse default nã estiver na
	última posição, coloque o break nele tb.
  }
  
  Posso ter switch sem break! Mas com o break é mais padrão.
  */
 String faixa = "amarela";
	//Se eu colocar faixa = "preta" ele imprime td.
	//Ou seja, pq não tem break, ele imprime da escolhida e tds os cases abaixo
	//Menos o default
	switch(faixa.toLowerCase()) {
	case "preta":
		System.out.println("Sei fazer o 'Bassai-Dai/Jion/kanku-Dai'");
	case "marrom":
		System.out.println("Sei fazer o '2'");
	case "roxa":
		System.out.println("Sei fazer o '3'");
	case "verde":
		System.out.println("Sei fazer o '4'");
	case "laranja":
		System.out.println("Sei fazer o '5'");
	case "vermelha":
		System.out.println("Sei fazer o 'Bassai-Dai/Jion/kanku-Dai'");
	case "amarela":
		System.out.println("Sei fazer o 'Bassai-Dai/Jion/kanku-Dai'");
	default: //pode ou não existir. Se faixa fosse branca, entraria aq.
		//Ele poderia tá em qlq lugar mas aí era pra eu pôr o break dps dele.
		System.out.println("Não sei nada!");
	}
  }

//Crio uma nova Class SwitchComBreak
//Obs que eu poderia ter escrito o código do break de forma meio desorganizada.
//E dps só clicar em Ctrl+Shift+f que ele deixaria assim como está, td organizado.
  String conceito = "";
		int nota = 0;

		switch (nota) {
		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
		case 0:
			conceito = "E";
			break;
		default:
			conceito = null;
			break;// Esse break é desnecessário
		// mas por segurança, pra se eu quiser trocar a ordem por ex.
		}
		if (conceito != null) {
			System.out.println("Conceito " + conceito);
		} else {
			System.out.println("Nota inválida!");
		}
	}
//Crio a class Break
public class Break {

	public static void main(String[] args) {
		for(int i =1; i < 5; i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);
		}
	}

}
//clico 2 vezes na linha 6 pra criar um ponto q se chama breakpoint. 
//Dps clico no insetozinho q fica do lado da setinha verde de run. Dps clico em windows
//show view -> Debbug. E dps vou em show view -> Breakpoint
//Vou na janela variável pra ficar vendo a execução do código.
//Executo o cód. com ru ou Fn+F11
//E vou apertando em uma setinha laranja que tem lá em cima 
//cujo atalho é Fn+F6 e dps de executar tds os passos, aperto F8 pra encerrar o programa
//posso selecionar uma parte de cód e digitar Shift+Ctrl+i
//tipo, seleciono if(i==2)e faço isso mostra false 

//Pra trocar de perspectiva posso tb clicar em Ctrl+((Fn+F8)é a que fica passando as perspectivas) 
//q mostra as perspectivas que eu já abri.
//Ou window->Perspective->Open Perspective e seleciono a que quero.

//Atalhos: Ctrl + (Fn+F6) muda as classes abertas(os arqs)
//         Ctrl + (Fn+F7) muda as abas abertas

//Crio a class BreakAninhado

public class BreakAninhado {

	public static void main(String[] args) {
		//Coloco um Breakpoint na linnha do for
		//Faço isso selecionando com o mouse do lado no número
		//da linha que está o for e dps clico no inseto do Debbug lá em cima
		//e dps rodo o código Crtl+(Fn+F11). Agr é só ir apertando Fn+F6
	//Estilo, go to(de antigamente). Evite o break rotulado. Mas só pra entender
	//	externo: for(int i =0; i<5; i++) - externo é o rótulo
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j == 2) {
					//Sai desse for interno e vai novamente pro externo q é qd
					//há um incremento do i
					//break externo; qd chegar no break saia do laço chamado externo 
					break;
					
				}
			    System.out.println(i + " "+ j);
			}
				
		}
	 System.out.println("Fim!");
	}

}

//Crio a Class Continue

public class BreakAninhado {

	public static void main(String[] args) {
//Coloco um Breakpoint na linnha do for
				//Faço isso selecionando com o mouse do lado no número
				//da linha que está o for e dps clico no inseto do Debbug lá em cima
				//e dps rodo o código Crtl+(Fn+F11). Agr é só ir apertando Fn+F6
	
		//o continue aborta a excução em questão e continua. Então é impresso 0 1 3 4 Fim!
				for(int i =0; i<5; i++) {
					if(i == 2) {
							//Sai desse for interno e vai novamente pro externo q é qd
							//há um incremento do i
							continue;
							
					}
					System.out.println(i);
					
						
				}
			 System.out.println("Fim!");
	}

}

//Crio a Class ContinueAninhado
	for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					//não imprime j = 2 em nenhum caso
					continue;
				}
				System.out.println(i+" "+j);
			}
	}
	System.out.println("Fim");
	
/*	
	Exercícios: Estruturas de Controle
Seção 4, aula 43
Estruturas de Controle

1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

2. Criar um programa informa se o ano atual é um ano bissexto;

3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".

4. Criar um programa que receba um número e diga se ele é um número primo.

5. Refatorar o exercício 04, utilizando a estrutura switch.

6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.

7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.

8. Criar um programa que receba uma palavra e imprime no console letra por letra.

9. Crie um programa que recebe 10 valores e ao final imprima o maior número.*/


