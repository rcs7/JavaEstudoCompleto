package classe;

public class VariaveisLocais {
	
	int a1=2; //variável de instância;
	
	void teste1() {
		int a1 = 3; //é visível apenas dentro deste método, ela eh local
		System.out.println(a);
		System.out.println(a1); //referencia a variável local
		System.out.println(this.a1);//referencia a variável que tá lá fora que é a de instância
		//Essa ordem de comandos que estão comentados daria erro!
		//A ordem no método é sequêncial
		//System.out.println(a3);
        //int a3 = 1;
		if(a1<3) {
		//	int a2 = 3;
		}
		//Essa linha abaixo daria erro, pois a2 só é enxergada dentro do
		//escopo do if
		//System.out.println(a2);
	}
	//a delcaração da variável pode ser após o método
	//pq a VM primeiro procura as variáveis e só dps procura os métodos
	//mas é boa prática pôr no início
	int a; //Variável de instância
	
	
	
}
