package Controle;

public class If {

	public static void main(String[] args) {
			double nota = 9.5;
			double nota2 = 6.5;
			double nota3 = 4.5;
			boolean bomComportamento = false;
			
			if(nota >= 9 && bomComportamento); {
				System.out.println("Quadro de honra!");
			}
			
			if(nota2 >= 7) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Recuperação");
			}
			
			if(nota3 >= 9) {
				System.out.println("Quadro de honra!");
			}else if(nota >= 7) {
			    System.out.println("Aprovado!");
			}else if(nota >= 3) {
				System.out.println("Recuperação + Trabalho");
			}else { //O else não é obrigatório
				System.out.println("Reprovado!");
			}
			
		}
	
}
