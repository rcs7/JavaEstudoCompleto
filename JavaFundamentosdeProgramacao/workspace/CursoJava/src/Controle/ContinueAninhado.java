package Controle;

public class ContinueAninhado {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					//não imprime j = 2 em nenhum caso
					continue;
				}
				System.out.println(i+" "+j);
			}
		}
		System.out.println("Fim");
	}

}
