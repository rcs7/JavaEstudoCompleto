package Controle;

public class Switch {
	public static void main(String[] args) {
	String faixa = "amarela";
	//Se eu colocar faixa = "preta" ele imprime td.
	//Ou seja, pq n�o tem break, ele imprime da escolhida e tds os cases abaixo
	//Menos o default
	switch(faixa.toLowerCase()) {
	case "preta":
		System.out.println("Sei fazer o 'Bassai-Dai/Jion/kanku-Dai'");
	case "marrom":
		System.out.println("Sei fazer o '2'");
	case "roxa":
		System.out.println("Sei fazer o '3'");
	case "verde":
		System.out.println("Sei fazer o '4'");
	case "laranja":
		System.out.println("Sei fazer o '5'");
	case "vermelha":
		System.out.println("Sei fazer o 'Bassai-Dai/Jion/kanku-Dai'");
	case "amarela":
		System.out.println("Sei fazer o 'Bassai-Dai/Jion/kanku-Dai'");
	default: //pode ou n�o existir. Se faixa fosse branca, entraria aq.
		//Ele poderia t� em qlq lugar mas a� era pra eu p�r o break dps dele.
		System.out.println("N�o sei nada!");
	}
  }
}
