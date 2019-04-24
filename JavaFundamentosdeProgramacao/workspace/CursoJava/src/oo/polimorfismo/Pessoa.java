package oo.polimorfismo;

public class Pessoa {
	/**
	 * Peso em Kg 
	 */
	//com o cursor em cima da linha abaixo digite Alt+Shift+j(cria um java Doc)
	private double peso = 0;
 
	//m�todo construtor de Pessoa
	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}
	
	public double getPeso() {
		return peso;
	}
	
	//Esses dois m�todos com o mesmo nome, mas recebendo par�metros
	//diferentes � um Polimorfismo est�tico = sobrecarga de m�todos
	//� uma forma burra de fazer
	/*public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	} */
		
	//Polimorfismo din�mico pra acabar com a perda
	//de tempo do polimorfismo est�tico visto acima
    public void comer(Comida comida) {
    	this.peso += comida.getPeso(); 
    }
//a� a chamada � assim!
//	pessoa.comer(arroz);
//	pessoa.comer(feijao);
//	pessoa.comer(sorvete);

//Varargs = "Var args"(falo assim)
  //agr come�o a mudan�a:

  //Mudo colocando o argumento pra (Comida... comidas) querendo dizer que agora eu 
  //posso passar qtas comidas eu quiser separadas por v�gulas que o java vai
  //pegar todos esses argumentos que s�o vari�veis(posso ter 1,2 ou 10 etc) e vai 
  //transformar isso em um Array e eu posso iterar sobre este Array e fazer a pessoa
  //comer todas as comidas que foram passadas por par�metro.

//    public void comer(Comida... comidas) {
 //       //se eu escrever: comidas+Atl+Espa�o vejo que comidas � um Array
  	   //pq o java transformou ele em um comidas[]
  	  //usando o for each
 // 	  for(Comida c:comidas){
  	//	this.peso += comida.getPeso(); 
  	 // }
      //a� a chamada � assim!
//  	pessoa.comer(arroz,feijao,sorvete);

}
