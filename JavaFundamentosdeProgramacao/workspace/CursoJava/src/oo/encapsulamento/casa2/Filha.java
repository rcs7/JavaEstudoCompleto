package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

//Ao coolocar a herança aperto Ctrl+shift+o pra aparecer o import
//Java não tem herança múltipla, logo uma class não pode herdar de 
//mais de uma classe. Aq sogra é a classe mais genérica e Filha é
//a classe mais específica.
//C++ suporta herança múltipla
public class Filha extends Sogra{
	//atributo default(pacote), então lá na class Genro posso acessar esse
	//atributo, se eu criar lá uma instância de Filha, pois eles estão no 
	//mesmo pacote. 
	//é uma variável de instância, então pra acessá-la tenho que criar uma 
	//intância(objeto) da classe que ela pertence.
	String segredoDoCasal ="Meu marido está quase sendo demitido";

	public static void main(String[] args) {
	
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabem..."+euMesma.segredoDoCasal);
	     
		//O atributo na classe Genro é privado, logo não pode ser acessado
		//a partir da classe Filha, mesmo eles sendo do msm pacote e se eu 
		//criar uma instância aq
		//Genro meuAmor = new Genro();
		//Gera erro!
		//System.out.println(meuAmor.segredo);
	
		Sogro papai = new Sogro();
    	//dou um Ctrl+Shift+o pra importar a class já que é
		//de outro package
		//o atributo pode ser acessado pq ele é público
		System.out.println(papai.gostaDeCerveja);
	
		//Sogra mamae = new Sogra();
		//dou um Ctrl+Shift+o pra importar a class já que é
		//de outro package
		//dá erro pq o atributo é protected,então
		//só pode ser acessado pela mesma classe que está
		//o atributo ou por classes que estão no mesmo pacote
		//ou que são passados por herança. Dá erro aq pq eu não
		//preciso criar uma instância do objeto pra acessar esse 
		//atributo, já que ele é protected e a classe Filha o
		//herdou por herança
		//System.out.println(mamae.segredoDeFamilia);
	//	Então a forma correta de acessar este atributo é:
		Sogra mamae = new Sogra();
		System.out.println(euMesma.segredoDeFamilia);
	}
}
