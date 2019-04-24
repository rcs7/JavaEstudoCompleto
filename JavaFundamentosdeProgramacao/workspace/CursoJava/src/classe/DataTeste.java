package classe;

public class DataTeste {

	public static void main(String[] args) {
		//Instanciação da class Data == criação do objeto
		// O tipo da var nascimento é Data. 
		//Criação do objeto a partir do construtor implícito padrão
		//Construtor padrão implpicito é esse que não recebe nenhum parâmetro
		//ao criar o objeto
		Data nascimento = new Data(); 
        //Tirei essa linha de cima ao criar um construtor explícito lá na class Data
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
