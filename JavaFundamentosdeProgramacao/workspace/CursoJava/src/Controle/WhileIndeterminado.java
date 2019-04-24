package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		//lê do teclado
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		//Qd não sei qts vezes preciso rodar o laço. Coloco a condição dentro do while 
		//de permanência! Pra permanecer no laço ql eh a condição? Essa é posta dentro 
		//do laço:
		//Esse valor -1 é chamado de sentinela. Podia ser outro num qlq
		while(nota != -1) {
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

}
