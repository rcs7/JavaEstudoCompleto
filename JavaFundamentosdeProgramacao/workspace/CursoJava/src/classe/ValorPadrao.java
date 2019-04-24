package classe;

public class ValorPadrao {
	static int a;
	static boolean b;
	//Variáveis de class e de instância são inicializadas automaticamente
	//por padrão com 0, até o char, mas boolean é com false, pois em java
	//não é permitido 0 e 1 pra definir variáveis, mas só true e false.
	public static void main(String[] args) {
		System.out.println(a); // 0 por padrão
		System.out.println(b); // false por padrão
		int b;
		//System.out.println(b); //vai dar erro pq a variável é local
		//e precisa ser inicializada explicitamente.
		b =0;
		System.out.println(b); // agr sim funciona
		Object c; // é uma variável local
		//System.out.println(c); // dá erro pq eh local e local não é inicializada por padão
		//eu preciso iniciá-la explicitamente.
		c = null;
		System.out.println(c); // Agr sim!
		
	}

}
