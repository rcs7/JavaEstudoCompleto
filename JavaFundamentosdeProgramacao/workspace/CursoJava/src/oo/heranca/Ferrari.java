package oo.heranca;
//herda o comportamento padr�o que foi definido na class
public class Ferrari extends Carro{
	//quero que a ferrari tenha uma velocidade m�x diferente da classe pai Carro
	//Construtor de Ferrari
	public Ferrari() {
		VELOCIDADE_MAX = 350;
	}
	//sobeescrever o m�todo acelerar - sobeescrita de m�todo
	public void acelerar() {
		//para usar a classe pai fazendo igual ao que ela faz uso o super
		//mais eu poderia simplemente redefinir o m�todo acelerar de outra forma
		//Isso � pra redefenir sabendo que t� usando da classe pai, pois eu poderia ter
		//sobeescrito esse m�todo acelerarMais da classe pai aq, e a� como ele saberia
		//ql eu tva querendo usar? Para isso uso o super
		super.acelerarMais(20);
	}

	public int imprimiVelMaximaFerrari(){
		return VELOCIDADE_MAX;
	}

	//Give error because it's out of main: 
//	Ferrari f = new Ferrari();

}