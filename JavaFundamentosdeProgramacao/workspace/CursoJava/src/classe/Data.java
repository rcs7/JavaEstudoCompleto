package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	//Posso ter mais de um construtor
	//Posso ent�o criar o construtor padr�o
	Data(){
		
	}
	
	//Construtor expl�cito, ao cri�-lo eu desativo o construtor 
	//que era o impl�cito
	Data (int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	
/*	
Data(){
	this(1,1,2017); // Referencia o construtor abaixo e eh v�lido
}
Data(int dia, int mes, int ano){
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
}
*/
	//m�todo
	String formatar() {
		return String.format("%d/%d/%d",dia,mes,ano);
	}
}
