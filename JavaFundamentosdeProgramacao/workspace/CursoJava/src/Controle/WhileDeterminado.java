package Controle;

import java.util.Scanner;

public class WhileDeterminado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;
		
		int indice = 0;
		
		//La�o While executado com uma qtd determinada de vezes
		//Lembrando que a condi��o do while � de perman�ncia
		while(indice <3) {
			//escreva as notas assim: 9,3 e n�o 9.3(d� erro assim)
			//O Scanner interpreta portugu�s
			//SSe minha m�q estiver configurada no padr�o americano
			//a� sim, eu digitaria 9.3
			nota = scanner.nextDouble();
			somaDasNotas +=nota;
			indice++;
		}
		//N�o � obrigado, mas � boa pr�tica
		scanner.close();
		System.out.printf("A m�dia � %.2f", somaDasNotas/3);
	}
	
}
