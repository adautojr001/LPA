
public class Principal {

	public static void main(String[] args) {
		Aluno adauto = new Aluno();
		adauto.bim1 = 7.0;
		adauto.bim2 = 8.0;
		adauto.bim3 = 8.0;
		adauto.bim4 = 7.0;

		System.out.println(adauto.media());
		System.out.println(adauto.aprovado());

	}

}
