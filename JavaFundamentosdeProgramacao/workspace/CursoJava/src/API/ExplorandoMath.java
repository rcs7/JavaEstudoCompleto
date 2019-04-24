package API;

public class ExplorandoMath {

	public static void main(String[] args) {
		// sin, cos, tag, log...
		System.out.println(Math.PI); // 3.1415...
		System.out.println(Math.pow(2,3)); //2^3 =8 . Imprime 8
        //Se o valor for positivo, ele retorna o próprio valor, se 
		//for negativo retorna ele positivo
		System.out.println(Math.abs(-10.5)); //10.5
		System.out.println(Math.min(10,11)); //10
		System.out.println(Math.max(10, 7)); //10
		System.out.println(Math.ceil(6.22)); // arredonda pra cima 7.0
		System.out.println(Math.floor(6.76));// arredonda para baixo 6.0
		
		//Gera um número double randômico aleatório entre 0 e 1
		
		System.out.println(Math.random());
	}

}
