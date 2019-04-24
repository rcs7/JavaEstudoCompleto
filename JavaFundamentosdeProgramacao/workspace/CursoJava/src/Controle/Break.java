package Controle;

public class Break {

	public static void main(String[] args) {
        for(int i =1; i < 5; i++) {
			if (i == 2) {
				//ao encontrar o break sai do for e nçao apenas do if!
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Fim");
	}

}
