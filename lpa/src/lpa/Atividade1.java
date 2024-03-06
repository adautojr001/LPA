package lpa;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		String nome;
		int idade;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o nome:");
		nome = ler.next();

		System.out.println("Informe a idade:");
		idade = ler.nextInt();

		System.out.println("O usuário: " + nome + " tem " + idade + " anos");

	}

}
