package com.dsa;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'makeAnagram' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 *  1. STRING a
	 *  2. STRING b
	 */

	@SuppressWarnings("unlikely-arg-type")
	public static int makeAnagram(String a, String b) {

		char[] achar=a.toCharArray();
		char[] bchar=b.toCharArray();
		int count=0;

		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<achar.length-1;i++)
		{
			char c=achar[i];
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(achar[i], 1);
		}

		for(int j=0;j<bchar.length-1;j++)
		{
			char c=bchar[j];
			if(map.containsKey(c))
				map.remove(c);
			else
				map.put(c, 1);
		}   

		/*for(Map.Entry<Character,Integer> c:map.entrySet()){
			if(c.getValue().intValue()==1)
				count= count+1;          
		}*/
		
		count=map.size();

		return count;
	}

}


