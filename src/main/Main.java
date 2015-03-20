package main;

import java.util.Scanner;

public class Main {
	static int getNumeroCinco(int primeiro, int segundo) {
		return primeiro + segundo;
	}
	
	static String juntarPalavras(String palavra1, String palavra2) {
		return palavra1 +  " " + palavra2;
	}
	
	public static void main(String[] args) {
		Animal galinha = new Animal("Galinha", 5);

		for (int index = 0; index < 5; index = index + 1) {
			System.out.println(juntarPalavras("Eu estou", "estudando"));
		}
		
		int index = 0;
		while (index < 5) {
			System.out.println(juntarPalavras("Eu estou", "estudando"));
			index = index + 1;
		}
		
		Scanner leitor = new Scanner(System.in);
		String texto = leitor.nextLine();
		System.out.println(texto);

		String a = "ahsks23";
		int b = Integer.parseInt(a);
		
//		System.out.println("Digite o comprimento do rabo do macaco:");
//		Scanner in = new Scanner(System.in);
//		int comprimento = in.nextInt();
//		Macaco joey = new Macaco(comprimento);
//		System.out.println(joey.getComprimentoRabo());
	}
}
