package objetos;

public class Exercicio_three {
	//atributos
	public double dolar;
	public double comprar;
	public double taxa;
	
	//m�todos
	public double valor() {
		return (dolar * comprar) + ((taxa/100) * comprar);
	}
	
}
