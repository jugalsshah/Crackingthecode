package org.learnlogic.model;

import java.util.Scanner;



/*
 * Implement an algorithm to determine if a string has all unique characters
 *  What if you can not use additional data structures?
 * 
 * 
 * */
public class ArraysStrings1 {

	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
System.out.println("please enter some strings:");
		String s=sc.nextLine();
		System.out.println("u entered:->"+s);
		
		isUniqueChars(s);
		
	}
	public static boolean isUniqueChars(String str) {
	    if (str.length() > 256) {
	    	System.out.println("out of bound");
	        return false;
	    }
	    int checker = 0;
	    for (int i = 0; i < str.length(); i++) {
	        int val = str.charAt(i) - 'a';
	        if ((checker & (1 << val)) > 0) return false;
	        checker |= (1 << val);
	    }
	    return true;
	}
	
	
}
