package aula_LPA;

import java.util.Scanner;

public class CustoCombustivel {

	public static void main(String[] args) {
		// Declaração de variáveis
		double valorLitro, kmPercorrido, mediaConsumo;

		// Chamada do método Scan biblioteca importada:(import java.util.Scanner;)
		Scanner ler = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Informe a distancia do percurso em /km:");
		kmPercorrido = ler.nextDouble();

		System.out.println("Informe a média de consumo por litro:");
		mediaConsumo = ler.nextDouble();

		System.out.println("Valor por litro:");
		valorLitro = ler.nextDouble();

		// Processamento
		double autonomia = kmPercorrido / mediaConsumo;

		double custoTotal = autonomia * valorLitro;

		// Saída
		System.out.println("Quantidade de litros gastos na viagem:\n" + autonomia + " Ltrs");
		System.out.println("O custo total de combustível da viagem:\nR$" + custoTotal);

	}

}
