package lpa;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Double horatrab, valorhora, salbruto, salliq, inss;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe as horas trabalhadas:");
		horatrab = ler.nextDouble();

		System.out.println("Valor da hora trabalhada :");
		valorhora = ler.nextDouble();

		salbruto = horatrab * valorhora;

		inss = salbruto * 0.12;

		salliq = salbruto - inss;

		System.out.println("O valor do salário bruto:" + salbruto);
		System.out.println("O valor do salário liquido:" + salliq);
		System.out.println("Desconto do INSS:" + inss);

	}

}
