package classe;

//Eu ajeitei este c�digo pra que funcionasse o test do junit que 
//fiz dentro do pakage test
public class Calculadora {

	public double resultado;
	
	//Entrada -> Algoritmo -> Sa�da 
	public double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}
	
	//Entrada -> Algoritmo
	void acrescentar(double a) {
		resultado += a;
	}
	
	//Algoritmo -> Sa�da
	public double obterResultado() {
		return resultado;
	}
	
	//Algoritmo
	public void limpar() {
		resultado = 0;
	}
	
    
}
