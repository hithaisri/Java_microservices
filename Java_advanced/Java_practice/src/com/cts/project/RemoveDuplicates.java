package com.cts.project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(2,5,3,4,3,2,3,4,3,5,7,6,9);
		
		List<Integer> newList=numbers.stream().distinct().collect(Collectors.toList());
		
		newList.forEach(System.out::println);
		
		Set<Integer> newSet=new HashSet<Integer>(numbers);
		
		newSet.forEach(System.out::println);
	}
}
