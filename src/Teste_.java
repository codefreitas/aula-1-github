import java.util.Locale;
import java.util.Scanner;

import objetos.Triangulo;

public class Teste_ {  //este programa esta rodando o exercicio de triangulo sem utiliza��o POO

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Qual a medida dos lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Qual a medida dos lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("A area do triangulo X equivale a: %.4f%n", areaX);
		System.out.printf("A area do triangulo Y equivale a: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("A maior area � a do triangulo X");
		}
		else {
			System.out.println("A maior area � a do triangulo Y");
		}
		sc.close();
	}

}
