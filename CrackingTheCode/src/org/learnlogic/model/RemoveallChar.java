	package org.learnlogic.model;

import java.util.Scanner;

public class RemoveallChar {

public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
System.out.println("please enter some strings:");
	String s=sc.nextLine();
	System.out.println("u entered:->"+s);
	
//	
//	Scanner sc1= new Scanner(System.in);
//	System.out.println("please enter some strings:");
		char c='s';
	System.out.println(removeallchar(s,c));
	

}

public static String removeallchar(String str,char c){
	
	if (str == null)
        return null;
    return str.replaceAll(Character.toString(c), "");
}

}