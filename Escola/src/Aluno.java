
public class Aluno {
	double bim1, bim2, bim3, bim4;

	public int media() {
		int total = 0;
		total += bim1;
		total += bim2;
		total += bim3;
		total += bim4;

		return total / 4;
	}

	public boolean aprovado() {
		int media = media();
		if (media >= 7.0)

			return true;
		return false;
	}
}
