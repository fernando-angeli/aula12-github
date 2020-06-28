package exercicio2;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary-tax;
	}
	
	public void increaseSalary(double percent) {
		grossSalary += grossSalary*(percent/100);
	}
}
