package com.ashifshadab.example2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollectDemo {

	public static void main(String[] args) {

		List<Staff> dataList = Arrays.asList(new Staff("Sunday", 30, new BigDecimal(10000)),
				new Staff("Monday", 27, new BigDecimal(20000)), new Staff("TuesDay", 33, new BigDecimal(30000)));

		System.out.println("Printing Elements of data List :");
		dataList.stream().forEach(System.out::println);

		

		// Before Java 8
		List<String> staffNameList = new ArrayList<>();
		for (Staff x : dataList) {
			staffNameList.add(x.getName());
		}
		
		System.out.println("Printing Name of dataList using for loop ::");
		System.out.println(staffNameList);
		
		System.out.println("Printing Name of dataList using stream and forEach ::");
		dataList.stream().forEach(data -> System.out.println(data.getName()));
		
		System.out.println("Printing Age of dataList using stream and map collect::");
		List<Integer>ageList = dataList.stream().map(obj->obj.getAge()).collect(Collectors.toList());
		System.out.println(ageList);
		
		List<Staff> myStaff = dataList.stream().map(staffVariable->{
			Staff staff = new Staff(staffVariable.getName(), 50, staffVariable.getSalary());
			return staff;
		}).collect(Collectors.toList());
		
		System.out.println("Printing Modifyed of dataList using stream and map collect::");
		System.out.println(myStaff);
	}

}
