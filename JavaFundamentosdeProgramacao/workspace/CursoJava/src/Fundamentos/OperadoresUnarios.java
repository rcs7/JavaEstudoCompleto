package Fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		//Incremento e decremento
		num1++; //p�s fixado
		System.out.println(num1);
		--num1; //pr� fixado
		System.out.println(num1);
		
		//Incremento antes da compara��o e o decremento depois da compara��o
		//Linha abaixo � m� programa��o pq tem ficar pensando! Facilite a leitura!
		System.out.println(++num1 == num2--);
		System.out.println(num1); //2
		System.out.println(num2); //1
		System.out.println(++num1 == num2--); //false
		
		//Complemento Bin�rio '~' - inver�o de cada bit de 50
		System.out.println(Integer.toBinaryString(50)); // 110010
		System.out.println(Integer.toBinaryString(~50)); // 110010
		//resulta em 1111111..111001101 pega td que era 0 antes e vira um e inverte o resto tb
		//32 bits = 4 bytes de um n�mero inteiro

		//Nega��o l�gica
		System.out.println(!true);//False	
	}

}
