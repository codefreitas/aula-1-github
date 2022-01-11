package objetos;

public class Funcionarios {
	
	//atributos
	private int id;
	private double salario;
	private String nome;
	
	//construtores
	public Funcionarios() {
		
	}
	public Funcionarios(int id, double salario, String nome) {
		this.id = id;
		this.salario = salario;
		this.nome = nome;
	}
	
	//encapsulamento
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	//metodos
	public void aumentoSalario(double porcentagem) {
		salario = salario + porcentagem/100 *salario;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}
