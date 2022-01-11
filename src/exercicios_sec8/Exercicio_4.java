package exercicios_sec8;

import java.util.Locale;
import java.util.Scanner;
import objetos.Product;

public class Exercicio_4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Pre�o: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		//construtor � colocado ap�s entrar com os valores das variaveis, 
		//isto � usado para que o programador n�o crie objetos vazios, veja
		//os PDF's da aula 76 (se��o 9).
		Product product = new Product(nome, preco, quantidade);
		
		//utiliza��o do setter diretamente no programa
		product.setNome("Computador");
		product.setPreco(1400);
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		System.out.println();
		
		System.out.print("Entre com a quantidade de produtos que ser� adicionada ao estoque: ");
		
		quantidade = sc.nextInt();
		product.addProducts(quantidade);
		System.out.println();
		System.out.println("Atualiza��o dos dados: " + product);
		System.out.println();
		System.out.print("Entre com a quantidade de produtos que ser� retirado do estoque: ");
		quantidade = sc.nextInt();
		product.removeProducts(quantidade);
		System.out.println();
		System.out.println("Atualiza��o dos dados: " + product);
		sc.close();
	}
}