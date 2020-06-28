package Sessão9_Exercicio;

public class Account {

	private int number;
	private String holder;
	private double balance;
		
	public Account(int number, String name) {
		this.number = number;
		this.holder = name;
	}

	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.holder = name;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "+
				number +
				", Holder: "+
				holder +
				", Balance: $ "+
				String.format("%.2f", balance);
	}
}