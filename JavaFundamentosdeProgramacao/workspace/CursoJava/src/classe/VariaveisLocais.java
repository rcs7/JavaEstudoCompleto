package classe;

public class VariaveisLocais {
	
	int a1=2; //vari�vel de inst�ncia;
	
	void teste1() {
		int a1 = 3; //� vis�vel apenas dentro deste m�todo, ela eh local
		System.out.println(a);
		System.out.println(a1); //referencia a vari�vel local
		System.out.println(this.a1);//referencia a vari�vel que t� l� fora que � a de inst�ncia
		//Essa ordem de comandos que est�o comentados daria erro!
		//A ordem no m�todo � sequ�ncial
		//System.out.println(a3);
        //int a3 = 1;
		if(a1<3) {
		//	int a2 = 3;
		}
		//Essa linha abaixo daria erro, pois a2 s� � enxergada dentro do
		//escopo do if
		//System.out.println(a2);
	}
	//a delcara��o da vari�vel pode ser ap�s o m�todo
	//pq a VM primeiro procura as vari�veis e s� dps procura os m�todos
	//mas � boa pr�tica p�r no in�cio
	int a; //Vari�vel de inst�ncia
	
	
	
}
