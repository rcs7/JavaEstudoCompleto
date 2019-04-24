package oo.polimorfismo;

public class Comida {
	
	/**
	 * Peso em Kg 
	 */
	//com o cursor em cima da linha abaixo digite Alt+Shift+j(cria um java Doc)
	private double peso = 0;
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}
}
