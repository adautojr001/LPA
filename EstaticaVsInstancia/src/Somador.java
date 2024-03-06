
public class Somador {

	String nome;
	int valorInstancia;
	static int valorEstatica = 0;

	void somar() {
		valorInstancia++;
		valorEstatica++;

	}

	void imprimir() {
		System.out.println("O somador " + nome + " instancia= " + valorInstancia + " estatica= " + valorEstatica);
	}

}
