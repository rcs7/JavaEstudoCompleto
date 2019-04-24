	package Cole��es;
	
	public class Array {
	
		public static void main(String[] args) {
			double[] notasJoao = {7.0,8.7,6.2,4.9,9.7};
			//Ou - d� no msm!
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
			//at Cole��es.Array.main(Array.java:16)
			//A de baixo d� erro!
			//[]double notasJoao= {7.0,8.7,6.2,4.9,9.7};
			//double[] notasPedro = new double[];
			//Obs: � obrigat�ria a defini��o do tamanho do Array
			//j� na cria��o dele
			
			double totalJoao = 0;
			for(int i=0; i<notasJoao.length; i++) {
				totalJoao += notasJoao[i];
			}
			double totalPedro =0 ;
			for(int i=0; i<notasPedro.length; i++) {
				totalPedro += notasPedro[i];
			}
			
			System.out.println(totalJoao/notasJoao.length);
			System.out.println(totalPedro/notasPedro.length);
		
		}
	
	}
