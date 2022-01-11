package objetos;

public class Product {
	// atributos
	private String nome;
	private double preco;
	private int quantidade;

	//construtor e encapsulmanto (getter e setter) podem ser gerados
	//automaticamente - aula 80 - seção 9.
	
	// construtor
	public Product(String nome, double preco, int quantidade) {
		this.nome = nome; // usa-se this para fazer diferenciar
		this.preco = preco; // o atribudo do objeto do parametro
		this.quantidade = quantidade; // do construtor
	}
	
	//encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() { //quantidade não terá setter pois poderá
		return quantidade;		//ter seu valor alterado apenas dentro do
	}							//código

	// métodos
	public double totalValueInStock() {
		return preco * quantidade;
	}

	public void addProducts(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProducts(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}