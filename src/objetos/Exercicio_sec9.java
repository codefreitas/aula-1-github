package objetos;

public class Exercicio_sec9 {
	//atributo
	private int numero_conta;
	private String titular;
	private double reais;
	
	
	//construtor
	public Exercicio_sec9(int numero_conta, String titular) {
		this.numero_conta = numero_conta;
		this.titular = titular;
	}
	
	public Exercicio_sec9(int numero_conta, String titular, double depositoInicial) {
		this.numero_conta = numero_conta;
		this.titular = titular;
		this.reais = depositoInicial;
	}

	//encapsulamento
	public int getNumero_conta() {
		return numero_conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getReais() {
		return reais;
	}

	//métodos
	public void deposito(double depposito) {
		 reais += depposito;
	}
	
	public void retirada(double rettirada) {
		reais -= rettirada;
	}
	
	
}
