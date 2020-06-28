package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program_exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//list importando a classe que cria a lista
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int employees = sc.nextInt();
		
		for(int i = 0; i<employees; i++) {
		System.out.println();
		System.out.println("Employee #"+(i+1)+":");
		System.out.print("Id: ");
		Integer id = sc.nextInt();
		while(hasId(list, id)==true) {
			System.out.println("Id already taken! Try again: ");
			id = sc.nextInt();
		}
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		Employee emp = new Employee(id, name, salary);
		list.add(emp);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		/*
		 * Segunda opção resolução:
		 
		Employee emp = list.stream().filter(x -> x.getId()==idSalary).findFirst().orElse(null);
		*/
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}
	
	public static Integer position (List<Employee> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				return true;
			}
		}
		return false;
	}
}