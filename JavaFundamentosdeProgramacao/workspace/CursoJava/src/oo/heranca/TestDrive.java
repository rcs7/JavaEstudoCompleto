package oo.heranca;

public class TestDrive {

	public static void main(String[] args) {
       Carro c = new Civic();
       c.acelerar();
       //imprime 5
       System.out.println(c.getVelocidadeAtual());
	
       //a vari�vel c mudou!
       c = new Ferrari();
       c.acelerar();
       //imprime 20
       System.out.println(c.getVelocidadeAtual());
	   
       Ferrari f = new Ferrari();
  
       //Imprime a velocidade de Ferrari, independente do valor
       //que tem no Carro l�, pois o obj � uma ferrari!
       //Mesmo que o m�todo seja l� da class pai Carro, msm
       //esse m�todo imprimeVelMaxima() sendo de Carro,
       //pois o construtor de Ferrari, j� mudou a VELOCIDADE_MAX
       //imprime 350
       System.out.println(f.imprimiVelMaxima());
       
       //Imprime a velocidade de Ferrari, independente do valor
       //que tem no Carro l�, pois o obj � uma ferrari!
       //imprime 350
       System.out.println(f.imprimiVelMaximaFerrari());
       
       Carro c2 = new Civic();
       //Imprime a velocidade do Carro!
       //Imprime 200
       System.out.println(c2.imprimiVelMaxima());
    
      }
}
