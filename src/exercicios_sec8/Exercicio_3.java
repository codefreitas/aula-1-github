package exercicios_sec8;

import java.util.Locale;
import java.util.Scanner;
import objetos.Exercicio_three;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Exercicio_three dolarr = new Exercicio_three();
		
		System.out.println("Qual a cotação atual do dolar? ");
		dolarr.dolar = sc.nextDouble();		
		
		System.out.println("Quantos dolares você deseja comprar? ");
		dolarr.comprar = sc.nextDouble();
		
		System.out.println("Qual a taxa de IOF(%)? ");
		dolarr.taxa = sc.nextDouble();
		
		double dolarx = dolarr.valor();
		
		System.out.printf("O valor a ser pago para comprar " + dolarr.comprar + " dolares é: %.2f%n", dolarx);
		
		
		sc.close();

	}

}
