package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		Arroz arroz = new Arroz();
		arroz.setPeso(0.250);
		
		Feijao feijao = new Feijao();
		feijao.setPeso(0.280);
		
		Sorvete sorvete = new Sorvete();
		sorvete.setPeso(0.160);
		
		Pessoa pessoa = new Pessoa(80.7);
		pessoa.comer(arroz);
		pessoa.comer(feijao);
		pessoa.comer(sorvete);
		/*Olhe como � o m�todo na classe Pessoa:
     //Polimorfismo din�mico pra acabar com a perda
	//de tempo do polimorfismo est�tico visto acima
    public void comer(Comida comida) {
    	this.peso += comida.getPeso(); 
    }*/
		
		
		System.out.println(pessoa.getPeso());
		
				
	}

}
