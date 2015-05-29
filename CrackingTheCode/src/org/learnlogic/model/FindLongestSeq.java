package org.learnlogic.model;

import java.util.Scanner;

public class FindLongestSeq {

	private String[] ar;
	
	public FindLongestSeq(String[] ar) {

		this.ar=ar;
		// TODO Auto-generated constructor stub
	}
	
	
	 public static void main(String args[]) {
	        String x = "aaaSumit eeSummation adssSummit Sum";
	        String[] ar = x.split(" ");
	        FindLongestSeq lp= new FindLongestSeq(ar);
	        System.out.println("Original String : " + x);
	        System.out.println("Common Prefix is : " + lp.findPrefix());
	    }
	
	 public String findPrefix() {
	        int resultLen = ar[0].length();
	        System.out.println("aa::-"+ar.length+"ssss"+ar[1].length());
	        int curr;
	        for (int i = 1; i < ar.length; i++) {
	            curr = 0;
	            while (curr < resultLen && curr < ar[i].length()
	                    && ar[0].charAt(curr) == ar[1].charAt(curr)) {
	                curr++;
	            }
	            resultLen = curr;
	        }
	        return ar[0].substring(0, resultLen);
	    }
	 
	}

