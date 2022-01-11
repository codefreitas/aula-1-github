package fixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");		//.add � o comando para adicionar valores em cada
		lista.add("Jo�o");		//nodo(espa�o) da lista
		lista.add("Jos�");
		lista.add("Jonathan");
		lista.add("Carla");
		lista.add("Isadora");
		
		System.out.println(lista.size());	//mostra a quantidade de nodos (espa�os) que a lista tem
		
		lista.remove(2);		//remove o elemento que esta na posi��o 1 da lista
		lista.remove("Maria");	//remove o valor maria, neste caso a posi��o 0
		
		for(String liista : lista) {
			System.out.println(liista);
		}
		System.out.println("------------------------");
		
		lista.removeIf(x -> x.charAt(0) == 'J');  //remove todo elemento que come�a com a letra J
		for(String liista : lista) {
			System.out.println(liista);
		}
		System.out.println("------------------------");
		
		//mostra o indice do elemento que voc� esta procurando
		System.out.println("Qual o indice da Isadora? " + lista.indexOf("Isadora")); 
		//quando o elemento n�o � encontrado o valor retornado � -1
		System.out.println("------------------------");
		
		//filtrando apenas nomes come�ados com a Letra I
		//para fazer isso converto a lista em stream, uso o filtro (paraemtro/condi��o),
		//e depois converte denovo para lista
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'I').collect(Collectors.toList());
		for(String y : resultado) {
			System.out.println(y);
		}
		System.out.println("------------------------");
		
		//mostra o primeiro nome com a letra indicada
		//para isso eu converto minha lista em stram, depoios busco oque quero com meu filtro,
		//utilizo o comando findFirst para especificar que quero o primeiro elemento que aparecer
		//e sen�o tiver elemento nenhum o comando orElse vai retornar null ou escreva entre aspas 
		//duplas o que quer que retorne dentro de orElse
		String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse("n�o encontrado");
		System.out.println(name);
		
	}

}
