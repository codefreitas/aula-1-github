import java.util.Locale;  //esta dando erro pq modifiquei o objeto product
import java.util.Scanner; //tal objeto agora faz referencia ao exercicio_4

import objetos.Product;

public class Teste_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		//Product product = new Product();
		
		System.out.println("Entre com os dados");
		System.out.println("Nome do produto: ");
		//product.name = sc.nextLine();
		
		System.out.println("Preço do produto: ");
		//product.preco = sc.nextDouble();
		
		System.out.println("Quantidade do produto em estoque: ");
		//product.quantidade = sc.nextInt();
		sc.close();

	}

}
