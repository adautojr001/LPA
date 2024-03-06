package lpa;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		double celsius, kelvin, reaumur, rankine, fahrenheit;

		Scanner user = new Scanner(System.in);

		System.out.println("Informe a temperatura em graus Celsius:");
		celsius = user.nextDouble();

		fahrenheit = (celsius * 1.8) + 32;
		kelvin = (celsius + 273.15);
		reaumur = (celsius * 0.8);
		rankine = fahrenheit + 459.67;

		System.out.println("A temperatura convertida para Fahrenheit eh:" + fahrenheit + "° graus");
		System.out.println("A temperatura convertida para Kelvin eh:" + kelvin + "° graus");
		System.out.println("A temperatura convertida para Reaumur eh:" + reaumur + "° graus");
		System.out.println("A temperatura convertida para Rankine eh:" + rankine + "° graus");
	}

}
