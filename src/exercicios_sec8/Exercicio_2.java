package exercicios_sec8;

import java.util.Locale;
import java.util.Scanner;
import objetos.Exercicio_two;

public class Exercicio_2 {

	public static void main(String[] args) {
//criar um programa para calcular o sal�rio de um funcion�rio ap�s descontos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exercicio_two pessoa = new Exercicio_two();
		
		System.out.println("Entre com o nome do funcion�rio: ");
		pessoa.nome = sc.nextLine();
		
		System.out.println("Entre com o sal�rio bruto mensal do funcion�rio: ");
		pessoa.salario = sc.nextDouble();
		
		System.out.println("Entre com o valor do imposto: ");
		pessoa.imposto = sc.nextDouble();
		
		double liquido = pessoa.salarioLiquido();
		
		System.out.printf("O sal�rio liquido do funcionario " + pessoa.nome + " � de: %.2f%n", liquido);
		
		//n�o termineiii
		
		
		sc.close();
		
	}

}
