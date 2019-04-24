package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		//l� do teclado
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		//Qd n�o sei qts vezes preciso rodar o la�o. Coloco a condi��o dentro do while 
		//de perman�ncia! Pra permanecer no la�o ql eh a condi��o? Essa � posta dentro 
		//do la�o:
		//Esse valor -1 � chamado de sentinela. Podia ser outro num qlq
		while(nota != -1) {
			nota = scanner.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				somaDasNotas += nota; //somaDasNotas = somaDasNotas + nota
				numeroDeNotas++;
			}
		}
		//N�o � obrigat�rio, mas � uma boa pr�tica, pois
		//o Scanner consome recursos da minha m�q!
		scanner.close();
		System.out.printf("A m�dia � %.2f", somaDasNotas/numeroDeNotas);
	}

}
