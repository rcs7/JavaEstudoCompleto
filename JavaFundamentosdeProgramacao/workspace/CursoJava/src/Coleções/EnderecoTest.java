package Cole��es;

public class EnderecoTest {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		Endereco endereco2 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		//false, pois estou comparando endere�os
		// "==" compara endere�os de mem�ria
		System.out.println(endereco1 == endereco2);
		//Como eu n�o implementei o m�todo equals(), estou usando o padr�o
		//que no fundo ele tb eh "==", ent�o tb compara endere�os
		//false se eu n�o gerar o equals. A explica��o t� l� no c�digo
		//da class endere�o. 
		//Se eu gerar a� d� true
		System.out.println(endereco1.equals(endereco2));
		
		//Posso fazer meu equals manualmente, mas o eclipse gera pra mim, eu fazendo
		//Ctrl+Shift+s
	}
}
