package com.ashifshadab.flatMapMethod.example3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFlatteningOperationDemo {

	public static void main(String[] args) {

		List<Developer> developerList = getData();
		
		Set<String>books=developerList.stream()
				.map(book->book.getBook())
				.flatMap(bookList->bookList.stream())
				.collect(Collectors.toSet());
		
		System.out.println("-------------APROCH 1-----------------");
		books.stream().forEach(System.out::println);
		
		Set<String> books2 = developerList.stream()
                .flatMap(x -> x.getBook().stream())                 
                .collect(Collectors.toSet());
		
		System.out.println("-------------APROCH 2-----------------");
		books2.stream().forEach(System.out::println);

	}

	private static List<Developer> getData() {
		
		Developer developer1 = new Developer();
		developer1.setName("Karan");
		developer1.addBook("Java 8 in Action");
		developer1.addBook("Spring Boot in Action");
		developer1.addBook("Effective Java (3nd Edition)");

		Developer developer2 = new Developer();
		developer2.setName("Sharaz");
		developer2.addBook("Learning Python, 5th Edition");
		developer2.addBook("Effective Java (3nd Edition)");
		
		Developer developer3 = new Developer();
		developer3.setName("Abhi");
		developer3.addBook("Python");
		developer3.addBook("My Java");

		List<Developer> developerList = new ArrayList<>();
		developerList.add(developer1);
		developerList.add(developer2);
		developerList.add(developer3);
		
		return developerList;
	}

}
