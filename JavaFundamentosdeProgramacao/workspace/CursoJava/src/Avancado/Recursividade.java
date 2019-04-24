package Avancado;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println(fatoriaFor(5)); //120	
		System.out.println(fatorial(5));
	}

	//Fatorial sem recursivade
	private static int fatoriaFor(int numero) {
		int fatorial = 1;
		
		for(int i=1; i <= numero; i++) {
			fatorial = fatorial *i;
		}
	return fatorial;
	}

	private static int fatorial(int numero) {
		if(numero <= 1) {
			return 1;
		}
		return numero * fatorial(numero-1);
	}

}