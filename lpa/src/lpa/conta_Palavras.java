package lpa;

import java.util.Scanner;

public class conta_Palavras {

	public static void main(String[] args) {

		String palavras;

		Scanner user = new Scanner(System.in);

		System.out.println("Digite um texto:");
		palavras = user.nextLine();

		palavras = palavras.replace("", "");

		int espaco = palavras.length();

		System.out.println("O texto informado possui: " + espaco + " caracteres!");

	}

}
