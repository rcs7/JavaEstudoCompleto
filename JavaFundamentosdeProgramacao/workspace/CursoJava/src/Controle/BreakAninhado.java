package Controle;

public class BreakAninhado {

	public static void main(String[] args) {
		//Coloco um Breakpoint na linnha do for
		//Fa�o isso selecionando com o mouse do lado no n�mero
		//da linha que est� o for e dps clico no inseto do Debbug l� em cima
		//e dps rodo o c�digo Crtl+(Fn+F11). Agr � s� ir apertando Fn+F6
	//Estilo, go to(de antigamente). Evite o break rotulado. Mas s� pra entender
	//	externo: for(int i =0; i<5; i++) - externo � o r�tulo
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j == 2) {
					//Sai desse for interno e vai novamente pro externo q � qd
					//h� um incremento do i
					//break externo; qd chegar no break saia do la�o chamado externo 
					break;
					
				}
			    System.out.println(i + " "+ j);
			}
				
		}
	 System.out.println("Fim!");
	}

}
