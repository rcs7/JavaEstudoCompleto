package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Tipo primitivo boleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b", bo1, bo2);
	
		//Tipo primitivo caracter
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050'; //c�d da tab unicode do 'P'
		System.out.printf("%c %c %c\n", c1, c2,c3);
		System.out.println(c1); //imprime a
		System.out.println(c1+0); //imprime 97 
			
		//Tipos primitivos inteiros
		//Vou p�r q os valores m�ximos positivos de cada inteiro
		byte b = 127; //Se eu colocasse 128 dava erro pq ele s� vai at� 127
		short s = 32767;
		int i = 2_147_483_647; // esses '_' � pra ficaar mais leg�vel, mas pode ser sem
		long l = 9_223_372_036_854_775_807L; //Tem q por o L para dizer que n�o � inteiro pq o java
		//reconhece como um int e n�o �, � long
		System.out.printf("%d %d %d %d\n", b,s,i,l);
		//Imprimo td em bin�rio e percebo que cada um tem um bit a menos
		//tipo o byte era pra ser 01111111 mas s� aparece 1111111, pois o 0
		//� o bit mais significativo q significa que o n�mero � positivo,
		//se fosse negativo seria 1
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		//System.out.println(Integer.toBinaryString(l));;
		
	    //Tipos primitivos reais (ponto flutuante)
		//Em java por padr�o o tipo flutuante � double, tanto � que se eu 
		//for usar o float tenho que colocar esse f a� de baixo do ex:
		float f = 3.1416f;
		double d = 2.45;
		System.out.printf("%f %f \n",f, d);
		System.out.printf("%.2f %.1f\n",f, d);
	}

}
