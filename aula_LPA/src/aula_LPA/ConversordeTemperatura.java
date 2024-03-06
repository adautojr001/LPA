package aula_LPA;

import java.util.Scanner;

public class ConversordeTemperatura {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);

		System.out.println("Informe a temperatura em graus Celsius:");
		double celsius = temp.nextDouble();

		double fahrenheit = (celsius * 1.8) + 32;

		System.out.println("A temperatura informada convertida em Fahrenheit é:\n" + fahrenheit);

	}

}
