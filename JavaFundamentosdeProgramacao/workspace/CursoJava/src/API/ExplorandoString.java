package API;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = "Leo"+"nardo";
	
		//Alguns m�todos importantes
		System.out.println(nome.toUpperCase()); //LEONARDO
		System.out.println(nome);//Leonardo
	    
		
		//Obs extra, String n�o tem o m�todo reverse(), 
		//s� quem tem � a StringBuilder, que veremos na pr�xima aula
		
		System.out.println(nome.length());
		System.out.println(nome.substring(0,3));//beginIndex, endIndex. Retorna Leo
		//retorna o primeiro �ndice que ele encontra esse caractere: 6
		System.out.println(nome.indexOf('d'));
		//retorna d
		System.out.println(nome.charAt(6));
		//Compare duas Strings sem levar em considea��o as letras mai�sculas e min�sculas
		System.out.println(nome.equalsIgnoreCase("leonardo"));//(anotherString)
	    //pra saber se uma String come�a com tal trecho
		System.out.println(nome.startsWith("Leo"));//(Preffix) //true
		System.out.println(nome.endsWith("ardo"));//(suffix) //true
		System.out.println(nome.isEmpty()); //false
		System.out.println(nome.concat(" � legal").concat("!")); //retorna String
		
		//A String � imut�vel:
		System.out.println(nome); //Leonardo
	    //Se eu quiser mud�-la:
		//LEO � legal!
		nome = nome.toUpperCase().substring(0,3).concat(" � legal!");
	
	}

}