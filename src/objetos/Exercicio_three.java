package objetos;

public class Exercicio_three {
	//atributos
	public double dolar;
	public double comprar;
	public double taxa;
	
	//métodos
	public double valor() {
		return (dolar * comprar) + ((taxa/100) * comprar);
	}
	
}
