package Controle;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
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
			nota = scanner.nextDouble();
			somaDasNotas += nota;
			
		}
		scanner.close();
		System.out.printf("A média é %.2f", somaDasNotas/3);
	}

}
