package br.com.alura;

import java.util.ArrayList;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("B", 21);
		Aula a2 = new Aula("C", 20);
		Aula a3 = new Aula("A", 15);
		Aula a4 = new Aula("F", 25);
		Aula a5 = new Aula("E", 10);
		Aula a6 = new Aula("D", 12);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		aulas.add(a5);
		aulas.add(a6);		
		
		aulas.stream()
			 .skip(2)
			 .limit(2)
			 .filter(e -> e.getTempo()>10)
			 .forEach(e -> System.out.println(e));		
			
//		Collections.sort(aulas);		
//		System.out.println(aulas);
//		aulas.sort(Comparator.comparing(Aula::getTempo));
//		System.out.println(aulas);		
		
	}
}
