package Controle;

import java.util.Scanner;

public class WhileDeterminado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
	
}
