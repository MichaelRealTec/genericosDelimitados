package entities;

import java.util.List;

public class Product implements Comparable<Product> {
	
	// Atributos
	private String name;
	private Double price;
	
	// Métodos Getters e Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	// Método Construtor
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// Métodos
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Product other) {
		return price.compareTo(other.getPrice());
	}
}
