package classe;

public class ValorPadrao {
	static int a;
	static boolean b;
	//Vari�veis de class e de inst�ncia s�o inicializadas automaticamente
	//por padr�o com 0, at� o char, mas boolean � com false, pois em java
	//n�o � permitido 0 e 1 pra definir vari�veis, mas s� true e false.
	public static void main(String[] args) {
		System.out.println(a); // 0 por padr�o
		System.out.println(b); // false por padr�o
		int b;
		//System.out.println(b); //vai dar erro pq a vari�vel � local
		//e precisa ser inicializada explicitamente.
		b =0;
		System.out.println(b); // agr sim funciona
		Object c; // � uma vari�vel local
		//System.out.println(c); // d� erro pq eh local e local n�o � inicializada por pad�o
		//eu preciso inici�-la explicitamente.
		c = null;
		System.out.println(c); // Agr sim!
		
	}

}
