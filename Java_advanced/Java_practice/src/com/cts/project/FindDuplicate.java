package com.cts.project;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(2,5,3,4,3,2,3,4,3,5,7,6,9);
		
		Set<Integer> numberSet=new HashSet<>();
			
		Set<Integer> newSet= numbers.stream().filter(x->!numberSet.add(x)).collect(Collectors.toSet());
		
		newSet.forEach(System.out::println);
	}
}
