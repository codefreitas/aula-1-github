package exercicios_sec8;

import java.util.Locale;
import java.util.Scanner;
import objetos.Exercicio_one;

public class Exercicio_1 { 
//criar um programa para calcular área, perímetro e diagonal de um retângulo

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //esta linha serve para usar o . como separador de casas decimais
		Scanner sc = new Scanner(System.in);
		
		Exercicio_one x;
		x = new Exercicio_one();
		
		System.out.println("Qual altura do retânguo? ");
		x.altura = sc.nextDouble();
		
		System.out.println("Qual largura do retânguo? ");
		x.largura = sc.nextDouble();
		
		double areaxx = x.area();
		double perimetroxx = x.perimetro();
		double diagonalxx = x.diagonal();
				
		System.out.printf("A área do retângulo é equivalente a: %.0f%n", areaxx);
		System.out.printf("O perimetro do retângulo é equivalente a: %.0f%n", perimetroxx);
		System.out.printf("A diagonal do retângulo é equivalente a: %.2f%n", diagonalxx);
		
		
		sc.close();

	}

}
