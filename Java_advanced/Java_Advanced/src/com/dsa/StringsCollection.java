package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class StringsCollection { 
    
	List<String> list = new ArrayList<String>();
    public void addString(String s){
        
        list.add(s);
    }
    
    public List<String> getStringsCollection(){
        
        return list;
    }
	public static void main(String[] args) {
		StringsCollection stringsCollection=new StringsCollection();
		for (int j = 0; j < 3; j++) {
            stringsCollection.addString("Hello" + String.valueOf(j + 1));
        }
     
		List<String> list1= stringsCollection.getStringsCollection();
		for(String s:list1) {
			System.out.println(""+s);
		}
    
	}
}
