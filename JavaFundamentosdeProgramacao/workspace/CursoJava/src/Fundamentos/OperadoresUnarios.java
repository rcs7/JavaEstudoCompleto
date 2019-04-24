package Fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
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
	}

}
