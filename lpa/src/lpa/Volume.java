package lpa;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		double volume, altura, raio;

		Scanner user = new Scanner(System.in);

		System.out.println("Informe a altura do recipiente:");
		altura = user.nextDouble();

		System.out.println("Informe o diâmetro do recipiente:");
		raio = user.nextDouble();

		volume = (3.14159 * raio * raio * altura);

		System.out.println("O volume do recipiente corresponde a : " + volume + " m³");

	}

}
