package lpa;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		double a, b, soma;

		// importando biblioteca Scanner
		Scanner ler = new Scanner(System.in);

		// Entrada
		System.out.println("Informe o 1° número:");
		a = ler.nextDouble();

		System.out.println("Informe o 2° número:");
		b = ler.nextDouble();

		// Processamento
		soma = a + b;

		// Saída
		System.out.println("O resultado da soma é:" + soma);

	}

}
