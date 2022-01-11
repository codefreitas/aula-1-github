package exercicios_sec8;

import java.util.Locale;
import java.util.Scanner;
import objetos.Exercicio_two;

public class Exercicio_2 {

	public static void main(String[] args) {
//criar um programa para calcular o salário de um funcionário após descontos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exercicio_two pessoa = new Exercicio_two();
		
		System.out.println("Entre com o nome do funcionário: ");
		pessoa.nome = sc.nextLine();
		
		System.out.println("Entre com o salário bruto mensal do funcionário: ");
		pessoa.salario = sc.nextDouble();
		
		System.out.println("Entre com o valor do imposto: ");
		pessoa.imposto = sc.nextDouble();
		
		double liquido = pessoa.salarioLiquido();
		
		System.out.printf("O salário liquido do funcionario " + pessoa.nome + " é de: %.2f%n", liquido);
		
		//não termineiii
		
		
		sc.close();
		
	}

}
