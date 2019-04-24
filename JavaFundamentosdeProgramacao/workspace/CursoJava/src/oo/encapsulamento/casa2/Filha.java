package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

//Ao coolocar a heran�a aperto Ctrl+shift+o pra aparecer o import
//Java n�o tem heran�a m�ltipla, logo uma class n�o pode herdar de 
//mais de uma classe. Aq sogra � a classe mais gen�rica e Filha �
//a classe mais espec�fica.
//C++ suporta heran�a m�ltipla
public class Filha extends Sogra{
	//atributo default(pacote), ent�o l� na class Genro posso acessar esse
	//atributo, se eu criar l� uma inst�ncia de Filha, pois eles est�o no 
	//mesmo pacote. 
	//� uma vari�vel de inst�ncia, ent�o pra acess�-la tenho que criar uma 
	//int�ncia(objeto) da classe que ela pertence.
	String segredoDoCasal ="Meu marido est� quase sendo demitido";

	public static void main(String[] args) {
	
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem..."+euMesma.segredoDoCasal);
	     
		//O atributo na classe Genro � privado, logo n�o pode ser acessado
		//a partir da classe Filha, mesmo eles sendo do msm pacote e se eu 
		//criar uma inst�ncia aq
		//Genro meuAmor = new Genro();
		//Gera erro!
		//System.out.println(meuAmor.segredo);
	
		Sogro papai = new Sogro();
    	//dou um Ctrl+Shift+o pra importar a class j� que �
		//de outro package
		//o atributo pode ser acessado pq ele � p�blico
		System.out.println(papai.gostaDeCerveja);
	
		//Sogra mamae = new Sogra();
		//dou um Ctrl+Shift+o pra importar a class j� que �
		//de outro package
		//d� erro pq o atributo � protected,ent�o
		//s� pode ser acessado pela mesma classe que est�
		//o atributo ou por classes que est�o no mesmo pacote
		//ou que s�o passados por heran�a. D� erro aq pq eu n�o
		//preciso criar uma inst�ncia do objeto pra acessar esse 
		//atributo, j� que ele � protected e a classe Filha o
		//herdou por heran�a
		//System.out.println(mamae.segredoDeFamilia);
	//	Ent�o a forma correta de acessar este atributo �:
		Sogra mamae = new Sogra();
		System.out.println(euMesma.segredoDeFamilia);
	}
}
