package org.learnlogic.model;

public class lengthOfLongestsubstring {

	public 	int solutin(String s){
		String c="";
		int j=1;
		for(int i=0; i <s.length(); i++){
		if(s.charAt(i)==s.charAt(j)){
			System.out.println(s.charAt(j));
			i++;
			j++;
			c=c+s.charAt(i);
		}
		else{
			j++;
			
		}
			
			
		System.out.println(c+"c");	
		}
		
		return c.length();
	}

	public static void main(String args[]) {

		String s = "abcabcabb";

		lengthOfLongestsubstring l = new lengthOfLongestsubstring();
		l.solutin(s);
	}
}
