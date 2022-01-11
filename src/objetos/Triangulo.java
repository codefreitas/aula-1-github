package objetos;

public class Triangulo {  //public: prefixo que indica que os métodos ou  
	                      //atributos podem ser usados em outros arquivos. 
	// atributos
	public double a;      //double: prefixo que indica o tipo de dado que
	public double b;      //esta sendo utilizado nos atributos ou metodos.
	public double c;
	
	// métodos
	public double area(){      
		double p = (a + b + c)/2.0;
		double result = Math.sqrt(p*(p - a)*(p - b)*(p-c));
		return result;
	}
}
