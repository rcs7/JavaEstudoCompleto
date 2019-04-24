package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Genro {
	//� uma vari�vel de inst�ncia, ent�o pra eu possa acess�-la dentro do
	//m�todo main, eu tenho que criar uma inst�ncia dela.
	private String segredo ="Minha sogra fala muito";

	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei..."+euMesmo.segredo);
		//atributo default(pacote), ent�o l� na class Genro posso acessar esse
		//atributo, se eu criar l� uma inst�ncia de Filha, pois eles est�o no 
		//mesmo pacote.
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);
	
		//Como ele est� em pacote diferente preciso importar
		//Ctrl+Shift+o:
		Sogro sograo = new Sogro();
		//O atributo gostaDeCerveja est� na classe Sogro, mas �
		//p�blico e por isso que posso acess�-lo.
		System.out.println(sograo.gostaDeCerveja);
		
		//Como ele est� em pacote diferente preciso importar
		//Ctrl+Shift+o:
		//Sogra sogrinha = new Sogra();
		//Eu s� poderia acessar se eu estivesse no mesmo pacote
		//ou se eu recebesse essa informa��o por heran�a, pois 
		//o atributo � protected
		//System.out.println(sogrinha.);
		//dou Ctrl+Shift+o pra ele editar os imports
	}

}
