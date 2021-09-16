package com.ashifshadab.example3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollectDemo {

	public static void main(String[] args) {

		List<NamePhoneEmail> namePhoneEmailList = new ArrayList<>();
		
		namePhoneEmailList.add(new NamePhoneEmail("Saturday", "123", "saturday@gmail.com"));
		
		namePhoneEmailList.add(new NamePhoneEmail("Sunday", "456", "sunday@gmail.com"));
		
		namePhoneEmailList.add(new NamePhoneEmail("Monday", "789", "monday@gmail.com"));
		
		namePhoneEmailList.add(new NamePhoneEmail("Tuesday", "016", "tuesday@gmail.com"));
		
		namePhoneEmailList.add(new NamePhoneEmail("Wednessday", "156", "wednessday@gmail.com"));
		
		System.out.println("Printing the element of namePhoneEmails :");
		
		namePhoneEmailList.stream().forEach(System.out::println);
		
		List<NamePhone>namePhoneList = namePhoneEmailList.stream().map(namePhoneEmail->{
			NamePhone namePhone = new NamePhone(namePhoneEmail.getName(), namePhoneEmail.getPhone());
			return namePhone;
		}).collect(Collectors.toList());

		System.out.println("Printing the element of namePhone :");
		namePhoneList.stream().forEach(System.out::println);
	}

}
