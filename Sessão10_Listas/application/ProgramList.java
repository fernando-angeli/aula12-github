package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println("Tamanho da Lista: " + list.size());
				
		System.out.println("----------");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		//Predicado, fun��o Lambda
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println("-----Remo��o letra M-----");
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("----------");
		
		System.out.println("Index of Bob: "+list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("----------");
		/*
		 * list.stream = converte a lista em stream
		 * filter(x -> x.charAt(0) == 'A') = filtra os elementos que iniciam com A
		 * .collect(Collectors.toList() = transforma o stream em List novamente
		 */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}	
		System.out.println("----------");
			
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		}
	}