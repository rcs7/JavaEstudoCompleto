package oo.heranca;
//herda o comportamento padrão que foi definido na class
public class Ferrari extends Carro{
	//quero que a ferrari tenha uma velocidade máx diferente da classe pai Carro
	//Construtor de Ferrari
	public Ferrari() {
		VELOCIDADE_MAX = 350;
	}
	//sobeescrever o método acelerar - sobeescrita de método
	public void acelerar() {
		//para usar a classe pai fazendo igual ao que ela faz uso o super
		//mais eu poderia simplemente redefinir o método acelerar de outra forma
		//Isso é pra redefenir sabendo que tô usando da classe pai, pois eu poderia ter
		//sobeescrito esse método acelerarMais da classe pai aq, e aí como ele saberia
		//ql eu tva querendo usar? Para isso uso o super
		super.acelerarMais(20);
	}

	public int imprimiVelMaximaFerrari(){
		return VELOCIDADE_MAX;
	}

	//Give error because it's out of main: 
//	Ferrari f = new Ferrari();

}