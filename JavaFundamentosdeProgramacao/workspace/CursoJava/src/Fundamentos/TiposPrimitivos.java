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
		char c3 = '\u0050'; //cód da tab unicode do 'P'
		System.out.printf("%c %c %c\n", c1, c2,c3);
		System.out.println(c1); //imprime a
		System.out.println(c1+0); //imprime 97 
			
		//Tipos primitivos inteiros
		//Vou pÔr q os valores máximos positivos de cada inteiro
		byte b = 127; //Se eu colocasse 128 dava erro pq ele só vai até 127
		short s = 32767;
		int i = 2_147_483_647; // esses '_' é pra ficaar mais legível, mas pode ser sem
		long l = 9_223_372_036_854_775_807L; //Tem q por o L para dizer que não é inteiro pq o java
		//reconhece como um int e não é, é long
		System.out.printf("%d %d %d %d\n", b,s,i,l);
		//Imprimo td em binário e percebo que cada um tem um bit a menos
		//tipo o byte era pra ser 01111111 mas só aparece 1111111, pois o 0
		//é o bit mais significativo q significa que o número é positivo,
		//se fosse negativo seria 1
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		//System.out.println(Integer.toBinaryString(l));;
		
	    //Tipos primitivos reais (ponto flutuante)
		//Em java por padrão o tipo flutuante é double, tanto é que se eu 
		//for usar o float tenho que colocar esse f aí de baixo do ex:
		float f = 3.1416f;
		double d = 2.45;
		System.out.printf("%f %f \n",f, d);
		System.out.printf("%.2f %.1f\n",f, d);
	}

}
