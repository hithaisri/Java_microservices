package com.cts.project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		
			System.out.println("Count="+count);
			
		long counta=strList.stream().filter(x->x.startsWith("a")).count();
			
		System.out.println("Count keywords starting with a"+counta);
		
		List<String> newlist=strList.stream().filter(x -> !x.isEmpty()).distinct().collect(Collectors.toList());
		
		System.out.println("New List");
		newlist.forEach(System.out::println);

		List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");

		
		String CountriesStr = countries.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));

		System.out.println(CountriesStr);
		

	}

}
