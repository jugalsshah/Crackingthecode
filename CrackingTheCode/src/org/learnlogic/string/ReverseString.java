package org.learnlogic.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

	public String reverseWords(String s) {

		String[] parts = s.split(" ");

	    StringBuilder builder = new StringBuilder();
	    builder.append(parts[parts.length - 1]);
System.out.println(builder.toString());
	    for (int i = parts.length - 2; i >= 0; --i) {
	        builder.append(" ").append(parts[i]);
	    }

	    return builder.toString();
		
		
		
		//		if (s == null || s.length() == 0) {
//			return "";
//		}
// 
//		// split to words by space
//		System.out.println(s+"hi");
//		String[] arr = s.split(" ");
//		StringBuilder sb = new StringBuilder();
//		for (int i = arr.length - 1; i >= 0; --i) {
//			if (!arr[i].equals("")) {
//				System.out.println(sb.toString());
//				sb.append(arr[i]).append(" ");
//			}
//		}
//		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}
	
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		String s=sc.nextLine();
		
		ReverseString reverseString= new ReverseString();
		System.out.println(reverseString.reverseWords(s));
		sc.close();
	
	}
	}
		//int a[]={5,6,7,8};
//		for(int i=0;i<a.length;i++){
//			int mid=a[i]/2;
//			int m=(int) (a[i]-Math.floor(mid));
//			//int mid1=(int) Math.ceil(a[i]/2);
//			//int mid2=(int) Math.floor(a[i]/2);
//			int ans=mid*m;
//			System.out.println(mid+"::"+m+"::"+ans);			
//		}
//		
//	}
//}