package Fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		//Operadores Lógicos
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		
		// & e | é pra operações bit a bit ou qd quero q ele analise tda a sentença
		//qd de início ele poderia já ter a resposta(desnecessário)
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
	    
		//ou exclusivo: diferentes = true e iguais = false
		//ou seja ele gosta do diferente
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("TV 50 = " + comprouTv50);
		System.out.println("TV 32 = " + comprouTv32);
		
		//Operador unário intruso
		System.out.println("Fome = "+ !comprouSorvete);
	}

}
