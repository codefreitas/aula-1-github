package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class matrizBidimensional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//para criar uma matriz, cria-se primeiro as variaveis que serão utilizadas
		//logo após instancia-se a matriz bidimensional utilizando dois conjuntos de colchetes
		//se fozze uma matriz tridimensional utilizaria três conjuntos de colchetes
		//obs.: o primeiro cojunto de colchete são as linhas e o segundo as colunas
		System.out.println("Entre com a quantidade de linhas e colunas que sua matriz terá: ");
		int n = sc.nextInt();
		int [][] mat = new int[n][n];  
		
		System.out.println("Entre com o valor das linhas: ");
		//o primeiro for lê as linhas e o segundos as colunas, ou seja, ao rodar o 1°for ele cai 
		//diretamente no 2°for que vai ler a o elemento da linha 0, coluna 0.
		//depois ele lê a linha 0, coluna 1, depois linha 0, coluna 2 e volta pro 1°for
		//este processo se repete + duas vezes;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("valor da diagonal:");
		for(int i=0; i<3; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println(" ");
		
		sc.close();

	}

}
