package Coleções;

public class EnderecoTest {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		Endereco endereco2 = new Endereco("Rua Loop Infinito", 1, "Sala 1001");
		//false, pois estou comparando endereços
		// "==" compara endereços de memória
		System.out.println(endereco1 == endereco2);
		//Como eu não implementei o método equals(), estou usando o padrão
		//que no fundo ele tb eh "==", então tb compara endereços
		//false se eu não gerar o equals. A explicação tá lá no código
		//da class endereço. 
		//Se eu gerar aí dá true
		System.out.println(endereco1.equals(endereco2));
		
		//Posso fazer meu equals manualmente, mas o eclipse gera pra mim, eu fazendo
		//Ctrl+Shift+s
	}
}
