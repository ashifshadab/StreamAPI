package com.ashifshadab.filter.example2;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMapDemo {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Raj", 30), new Person("Mohan", 20), new Person("Veena", 40));

		System.out.println("Data List");
		persons.stream().forEach(System.out::println);

		System.out.println("Find Veen in list");

		// convert stream to String .map(Person::getName)
		String name = persons.stream().filter(person -> "Veena".equals(person.getName())).map(Person::getName).findAny()
				.orElse("Notfound");

		System.out.println(name);

		Person person1 = persons.stream().filter(person -> "Raj".equals(person.getName())).findAny().orElse(null);

		System.out.println("Find Raj or not : " + person1);

		Person person2 = persons.stream().filter(person -> 20 == person.getAge()).findAny().orElse(person1);

		System.out.println("Find 20 or not : " + person2);

		Person person3 = persons.stream().filter(person -> "Mohan".equals(person.getName()) && 90 == person.getAge())
				.findAny().orElse(person1);

		System.out.println("Find Mohan and age 20  or not : " + person3);
	}

}
