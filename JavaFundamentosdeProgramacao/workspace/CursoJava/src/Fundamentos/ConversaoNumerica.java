package Fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args) {
		//Convers�o expl�cita:
		//float f = 0.1; // isso d� erro,
		//diz que n�o posso converter double para int
		float f = (float) 0.1;
		System.out.println(f);
	
		//Convers�o expl�cita
		int i1 = (int) 7.9; // double para int, imprime 7
		System.out.println(i1);
		
		//Convers�o Impl�cita
		int i2 = 'a'; //imprime 97
		System.out.println(i2);
		
		//Convers�o Impl�cita
		double d = 1001; //int para double
		System.out.println(d); //1001.0
		
		
	}

}
