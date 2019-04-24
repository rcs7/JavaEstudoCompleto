package Controle;

public class Switch {
	public static void main(String[] args) {
	String faixa = "amarela";
	//Se eu colocar faixa = "preta" ele imprime td.
	//Ou seja, pq não tem break, ele imprime da escolhida e tds os cases abaixo
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
	default: //pode ou não existir. Se faixa fosse branca, entraria aq.
		//Ele poderia tá em qlq lugar mas aí era pra eu pôr o break dps dele.
		System.out.println("Não sei nada!");
	}
  }
}
