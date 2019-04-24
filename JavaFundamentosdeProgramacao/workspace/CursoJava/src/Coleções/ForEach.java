package Coleções;

public class ForEach {

	public static void main(String[] args) {
		double[] notasJoao = {7.0,8.7,6.2,4.9,9.7};
		//Ou - dá no msm!
		//double []notasJoao = {7.0,8.7,6.2,4.9,9.7};
		//double notasJoao[] = {7.0,8.7,6.2,4.9,9.7};
		double[] notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;
		//Daria erro:
		//notasPedro[5] = 9.2;
		//java.lang.ArrayIndexOutOfBoundsException: 5
		//at Coleções.Array.main(Array.java:16)
		//A de baixo dá erro!
		//[]double notasJoao= {7.0,8.7,6.2,4.9,9.7};
		//double[] notasPedro = new double[];
		//Obs: é obrigatória a definição do tamanho do Array
		//já na criação dele
		
		double totalJoao = 0;
		//for each: a variável nota recebe cada elemento do array por vez
		for(double nota: notasJoao) {
			totalJoao += nota;
		}
		
		double totalPedro =0 ;
		for(double nota: notasPedro) {
			totalPedro += nota;
		}
		
		System.out.println(totalJoao/notasJoao.length);
		System.out.println(totalPedro/notasPedro.length);
	
	}
}
