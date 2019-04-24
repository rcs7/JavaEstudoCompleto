package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		
		do {
			nota = scanner.nextDouble();
			
			if(nota <= 10 && nota >=0) {
				somaDasNotas += nota; //atribui��o aditiva
				numeroDeNotas++;
			}
		}while(nota != -1); //N�o esquecer do ';'

		//O la�o mais comum � o for do que o while
		//O la�o mais comum � o while do que o do while
		scanner.close();
		System.out.printf("A m�dia � %.2f", somaDasNotas/numeroDeNotas);
	}

}
