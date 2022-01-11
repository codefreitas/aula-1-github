package objetos;

public class Exercicio_two {
	
	public String nome;
	public double salario;
	public double imposto;
	
	public double salarioLiquido() {
		return salario - imposto;
	}
	
	public double aumentoSalario(double porcentagem) {
		return (porcentagem/100 ) * salario;
	}
	
	
}
