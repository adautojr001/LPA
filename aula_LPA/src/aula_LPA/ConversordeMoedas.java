package aula_LPA;

import java.util.Scanner;

public class ConversordeMoedas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor em R$:");
		double valorReal = ler.nextDouble();

		System.out.println("Informe a cotação (valor/dia) da moeda corrente:");
		double valorCotacao = ler.nextDouble();

		double valorAtual = valorReal * valorCotacao;

		System.out.println("O valor da moeda referente a conversão é:\nR$ " + valorAtual+"0");

	}

}
