package com.cts.project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		
		//reversing a string
		String s=new String("Hello");
		
		StringBuilder str=new StringBuilder(s);
		
		System.out.println(str.reverse());
		
		//reversing a sentence
		String s1=new String("Hello this is java program!");
		
		List<String> list=Arrays.asList(s1.split("//s"));
		
		Collections.reverse(list);
		
		StringBuilder sb=new StringBuilder(s1.length());
		
		for (int i = list.size() - 1; i >= 0; i--) {
			sb.append(list.get(i)); 
			sb.append(' '); 
		}

		
		
		
		System.out.println("Reversed Sentence="+sb.toString());
		
		
		
		
	}
}
