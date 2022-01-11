package fixacao;
import java.util.Locale;
import java.util.Scanner;

import objetos.dolar;

public class cotacaoDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		dolar dolar = new dolar();
		
		System.out.println("Entre com a cotação atual do dolar: ");
		dolar.cotaDolar = sc.nextDouble();
		System.out.println("Quantos dolares você quer comprar? ");
		dolar.comprarDolar = sc.nextDouble();
		
		double resultadox = dolar.resultado();
		System.out.printf("Para comprar " + dolar.comprarDolar + " é necessário desembolsar: %.2f%n", resultadox);
		
		sc.close();

	}

}
