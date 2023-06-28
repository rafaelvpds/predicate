package entities;

public class Product {
	private String nome;
	private Double price;

	public Product(String nome, Double price) {
		this.nome = nome;
		this.price = price;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

//metodo estatico va trabalhar com o argumento passado na função
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100;
	}

//vai trabalhar coma a propria instancia
	public boolean noStaticProductPredicate() {
		return price >= 100;
	}

	@Override
	public String toString() {
		return "nome = " + nome + ", price = " + String.format("%.2f", price);
	}

}
