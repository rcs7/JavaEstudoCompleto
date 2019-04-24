package Controle;

public class BreakAninhado {

	public static void main(String[] args) {
		//Coloco um Breakpoint na linnha do for
		//Faço isso selecionando com o mouse do lado no número
		//da linha que está o for e dps clico no inseto do Debbug lá em cima
		//e dps rodo o código Crtl+(Fn+F11). Agr é só ir apertando Fn+F6
	//Estilo, go to(de antigamente). Evite o break rotulado. Mas só pra entender
	//	externo: for(int i =0; i<5; i++) - externo é o rótulo
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j == 2) {
					//Sai desse for interno e vai novamente pro externo q é qd
					//há um incremento do i
					//break externo; qd chegar no break saia do laço chamado externo 
					break;
					
				}
			    System.out.println(i + " "+ j);
			}
				
		}
	 System.out.println("Fim!");
	}

}
