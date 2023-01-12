package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class RollingString {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("00L");
		list.add("22L");
		list.add("02R");


		System.out.println(rollingString("abc",list));
	}
	public static String rollingString(String s, List<String> operations) {
//	    
//	    char[] ans=s.toCharArray();
//	        for(int i=0;i<operations.size();i++){
//	            int a=Integer.parseInt(String.valueOf(operations.get(i).replaceAll(" ","").charAt(0)));
//	            int b=Integer.parseInt(String.valueOf(operations.get(i).replaceAll(" ","").charAt(1)));
//
//	            for(int j=a;j<=b;j++){
//	                ans[j]=String.valueOf(operations.get(i).replaceAll(" ","").charAt(2)).equals("L")?(char)((ans[j]-'a'+26-1)%26+'a'):(char)((ans[j]-'a'+1)%26+'a');
//
//	            }
//
//	        }
//	        return String.valueOf(ans);
//	}
		 StringBuilder string=new StringBuilder(s);
		    for(String a:operations){
		        String[] arr=a.split(" ");
		        if(arr[2].equals("R")){
		            int i=Integer.parseInt(arr[0]);
		            int j=Integer.parseInt(arr[1]);
		            for(int b=i;b<=j;++b){
		                int x=string.charAt(b);
		                 x+=1;
		                if(x>122)
		                     string.setCharAt(b,'a');
		                else
		                    string.setCharAt(b,(char)x);
		             }
		        }
		         else
		        {
		        int i=Integer.parseInt(arr[0]);
		        int j=Integer.parseInt(arr[1]);
		        for(int b=i;b<=j;++b){
		            int x=string.charAt(b);
		            x-=1;
		            if(x<97)
		                string.setCharAt(b,'z');
		            else
		                string.setCharAt(b,(char)x);    
		            }   
		        }
		    }
		   
		return string.toString();
	}
}
