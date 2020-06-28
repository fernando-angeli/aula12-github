
package entities;

public class Product1 {

	/*
	 * ENCAPSULAMENTO alterar de "public" para "private" nos atributos (encapsular)
	 */
	private String name;
	private double price;
	private int quantity;

	public Product1() {
	}

	public Product1(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product1(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/*
	 * M�TODOS DE ACESSO - GET E SET - sempre ap�s o construtor
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	/*
	 * N�o foi implementado o setQuantity para proteger a integridade do objeto
	 * pois ser� alterada somente quando houver uma entrada ou sa�da
	 */
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}