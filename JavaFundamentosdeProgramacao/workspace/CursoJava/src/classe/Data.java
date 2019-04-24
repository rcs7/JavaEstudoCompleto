package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	//Posso ter mais de um construtor
	//Posso então criar o construtor padrão
	Data(){
		
	}
	
	//Construtor explícito, ao criá-lo eu desativo o construtor 
	//que era o implícito
	Data (int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	
/*	
Data(){
	this(1,1,2017); // Referencia o construtor abaixo e eh válido
}
Data(int dia, int mes, int ano){
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
}
*/
	//método
	String formatar() {
		return String.format("%d/%d/%d",dia,mes,ano);
	}
}
