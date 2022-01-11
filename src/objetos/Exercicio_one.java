package objetos;

public class Exercicio_one {

	//atributos
	public double altura;
	public double largura;
	
	//métodos
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return (altura*2) + (largura*2);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.sqrt(altura) + Math.sqrt(largura));
	}
}
