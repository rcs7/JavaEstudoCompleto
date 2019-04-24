package API;

public class ExplorandoStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		//vai anexar uma determinada string ao StringBuilder
	    //OBS: Na StringBuilder o que trabalho mais � a quest�o do
		//append e dps a converto para uma String, usando toString
		//StringBuilder � melhor performance do que usar o + pra concatenar
		//como a String normal faz
		sb.append("Joao");
		sb.append(",").append("Maria");
		sb.append(",").append("Pedro");
		
		//Esse tipo de String � mut�vel
		//Esse m�todo muda realmente a StringBuilder, mas alguns 
		//n�o mudam como � o caso do substring(,);
		sb.reverse(); //inverte tda a String
		
		//Pra imprimir uma StringBuider no console
		System.out.println(sb.toString());//ordeP,airaM,o�oJ
		//Esse m�todo n�o muda o conte�do da StringBuilder:
		System.out.println(sb.substring(1,3)); //rd
		System.out.println(sb.toString());//ordeP,airaM,o�oJ
	}

}
