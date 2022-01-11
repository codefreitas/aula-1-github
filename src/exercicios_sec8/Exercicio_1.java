package exercicios_sec8;

import java.util.Locale;
import java.util.Scanner;
import objetos.Exercicio_one;

public class Exercicio_1 { 
//criar um programa para calcular �rea, per�metro e diagonal de um ret�ngulo

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //esta linha serve para usar o . como separador de casas decimais
		Scanner sc = new Scanner(System.in);
		
		Exercicio_one x;
		x = new Exercicio_one();
		
		System.out.println("Qual altura do ret�nguo? ");
		x.altura = sc.nextDouble();
		
		System.out.println("Qual largura do ret�nguo? ");
		x.largura = sc.nextDouble();
		
		double areaxx = x.area();
		double perimetroxx = x.perimetro();
		double diagonalxx = x.diagonal();
				
		System.out.printf("A �rea do ret�ngulo � equivalente a: %.0f%n", areaxx);
		System.out.printf("O perimetro do ret�ngulo � equivalente a: %.0f%n", perimetroxx);
		System.out.printf("A diagonal do ret�ngulo � equivalente a: %.2f%n", diagonalxx);
		
		
		sc.close();

	}

}
