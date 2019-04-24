package classe;

public class DataTeste {

	public static void main(String[] args) {
		//Instancia��o da class Data == cria��o do objeto
		// O tipo da var nascimento � Data. 
		//Cria��o do objeto a partir do construtor impl�cito padr�o
		//Construtor padr�o implpicito � esse que n�o recebe nenhum par�metro
		//ao criar o objeto
		Data nascimento = new Data(); 
        //Tirei essa linha de cima ao criar um construtor expl�cito l� na class Data
		nascimento.dia = 19;
        nascimento.mes = 11;
        nascimento.ano = 1987;
        
        Data casamento = new Data(8,9,2010);
		//Data nascimento = new Data(19,11,1997);
		
        //System.out.println(nascimento.dia + "/"+nascimento.mes+"/"+nascimento.ano);
        //System.out.printf("%d/%d/%d\n", nascimento.dia,nascimento.mes,nascimento.ano);
        System.out.println(nascimento.formatar());
        System.out.println(casamento.formatar());

	}

}
