package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class SequentialString {

public static List<Integer> countMinimumCharacters(String s, List<String> arr) {
        
	    List<Integer> list=new ArrayList<>();
	        for(int i=0;i<arr.size();i++){
	     int result=-2;
	     char[] ch=s.toCharArray();
	    
	    String str=String.valueOf(arr.get(i));
	    for(int j=0;j<str.length();j++)
	    {
	        char find=str.charAt(j);
	        boolean found = false;
	        for(int k=0;k<s.length();k++)
	        {
	            if(ch[k]==find)
	            {
	                found=true;
	                ch[k]='a';
	                if(k>result)
	                 result=k;
	                
	                break;
	            }
	        }
	        if(!found){
	            result=-2;
	            break;
	        }
	    }
	    result++;
	    list.add(result);
	            }   
	            return list;  
	    }


}
