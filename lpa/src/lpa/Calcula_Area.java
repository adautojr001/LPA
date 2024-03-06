package lpa;

import java.util.Scanner;

public class Calcula_Area {

	public static void main(String[] args) {
		double hp, lp, ha = 0.35, la = 0.3, qtd;

		Scanner user = new Scanner(System.in);

		System.out.println("Informe a altura da parede:");
		hp = user.nextDouble();

		System.out.println("Informe a largura da parede:");
		lp = user.nextDouble();

		qtd = (hp * lp) / (ha * la);

		System.out.println("A quantidade de revestimento usado para acabar a parede eh:" + qtd);

	}

}
