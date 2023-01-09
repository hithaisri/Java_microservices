package com.dsa;

public class BreakPalindrome {
	
	public static void main(String[] args) {
		
		System.out.println(breakPalindrome("aaa"));
	}

	public static String breakPalindrome(String palindromeStr) {
	    
		
		
        if(palindromeStr.length()==1){
            return "IMPOSSIBLE";
        }
        
        for(int i=0;i<palindromeStr.length();i++){
           if(palindromeStr.charAt(i)!='a' ){
               return palindromeStr.substring(0,i)
               +"a"+palindromeStr.substring(i+1);
           }
                   }
        
    return "IMPOSSIBLE";
    }

}
