package Controle;

public class Continue {

	public static void main(String[] args) {
		//Coloco um Breakpoint na linnha do for
				//Fa�o isso selecionando com o mouse do lado no n�mero
				//da linha que est� o for e dps clico no inseto do Debbug l� em cima
				//e dps rodo o c�digo Crtl+(Fn+F11). Agr � s� ir apertando Fn+F6
	
		//o continue aborta a excu��o em quest�o e continua. Ent�o � impresso 0 1 3 4 Fim!
				for(int i =0; i<5; i++) {
					if(i == 2) {
							//Sai desse for interno e vai novamente pro externo q � qd
							//h� um incremento do i
							continue;
							
					}
					System.out.println(i);
					
						
				}
			 System.out.println("Fim!");
	}

}
