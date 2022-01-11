package objetos;

public class dolar {
	
	//atributo
	public double cotaDolar;
	public double comprarDolar;
	
	//metodo
	public double resultado() {
		return (cotaDolar * comprarDolar) + (0.06 * comprarDolar);
	}
	
}
