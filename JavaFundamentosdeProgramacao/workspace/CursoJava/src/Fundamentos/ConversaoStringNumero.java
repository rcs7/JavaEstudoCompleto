package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		//tela que o Java tem pronta pra receber um trato do usu�rio
		String resposta1 = JOptionPane.showInputDialog("Qual � a nota 1");
		String resposta2 = JOptionPane.showInputDialog("Qual � a nota 2");
	
		System.out.println(resposta1 + resposta2);
	
		//converter string em double
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double total = nota1 + nota2;
		
		System.out.println(total/2);
		
		//Inteiros
		byte n1 = Byte.parseByte("1");
	    System.out.println(n1);
		short n2 = Short.parseShort("2");
		System.out.println(n2);
		int n3 = Integer.parseInt("3");
		System.out.println(n3);
		long n4 = Long.parseLong("4");
		System.out.println(n4);
		
		//Reais(Ponto flutuante)
		float n5 = Float.parseFloat("1.2");
		System.out.println(n5);
		double n6 = Double.parseDouble("2.4");
		System.out.println(n6);
		
		//Boolean
		boolean fal = Boolean.parseBoolean("false");
		System.out.println(fal);
		
	}

}
