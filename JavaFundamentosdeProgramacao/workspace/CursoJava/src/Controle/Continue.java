package Controle;

public class Continue {

	public static void main(String[] args) {
		//Coloco um Breakpoint na linnha do for
				//Faço isso selecionando com o mouse do lado no número
				//da linha que está o for e dps clico no inseto do Debbug lá em cima
				//e dps rodo o código Crtl+(Fn+F11). Agr é só ir apertando Fn+F6
	
		//o continue aborta a excução em questão e continua. Então é impresso 0 1 3 4 Fim!
				for(int i =0; i<5; i++) {
					if(i == 2) {
							//Sai desse for interno e vai novamente pro externo q é qd
							//há um incremento do i
							continue;
							
					}
					System.out.println(i);
					
						
				}
			 System.out.println("Fim!");
	}

}
