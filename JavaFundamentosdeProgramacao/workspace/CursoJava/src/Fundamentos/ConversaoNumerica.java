package Fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args) {
		//Conversão explícita:
		//float f = 0.1; // isso dá erro,
		//diz que não posso converter double para int
		float f = (float) 0.1;
		System.out.println(f);
	
		//Conversão explícita
		int i1 = (int) 7.9; // double para int, imprime 7
		System.out.println(i1);
		
		//Conversão Implícita
		int i2 = 'a'; //imprime 97
		System.out.println(i2);
		
		//Conversão Implícita
		double d = 1001; //int para double
		System.out.println(d); //1001.0
		
		
	}

}
