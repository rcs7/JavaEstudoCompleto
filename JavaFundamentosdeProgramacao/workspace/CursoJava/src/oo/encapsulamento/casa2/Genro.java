package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Genro {
	//é uma variável de instância, então pra eu possa acessá-la dentro do
	//método main, eu tenho que criar uma instância dela.
	private String segredo ="Minha sogra fala muito";

	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei..."+euMesmo.segredo);
		//atributo default(pacote), então lá na class Genro posso acessar esse
		//atributo, se eu criar lá uma instância de Filha, pois eles estão no 
		//mesmo pacote.
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);
	
		//Como ele está em pacote diferente preciso importar
		//Ctrl+Shift+o:
		Sogro sograo = new Sogro();
		//O atributo gostaDeCerveja está na classe Sogro, mas é
		//público e por isso que posso acessá-lo.
		System.out.println(sograo.gostaDeCerveja);
		
		//Como ele está em pacote diferente preciso importar
		//Ctrl+Shift+o:
		//Sogra sogrinha = new Sogra();
		//Eu só poderia acessar se eu estivesse no mesmo pacote
		//ou se eu recebesse essa informação por herança, pois 
		//o atributo é protected
		//System.out.println(sogrinha.);
		//dou Ctrl+Shift+o pra ele editar os imports
	}

}
