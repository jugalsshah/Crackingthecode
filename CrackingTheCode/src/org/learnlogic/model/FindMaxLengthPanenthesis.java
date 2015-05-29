package org.learnlogic.model;

import java.util.Scanner;

public class FindMaxLengthPanenthesis {

	public int findLength(String[] S){
		
		
		int current_max = 0; // current count
	    int max = 0;    // overall maximum count
	    int n = S.length;
	 
	    // Traverse the input string
	    for (int i = 0; i< n; i++)
	    {
	        if (S[i].contains("C"))
	        {
	            current_max++;
	 
	            // update max if required
	            if (current_max> max)
	                max = current_max;
	        }
	        else if (S[i].contains(")"))
	        {
	            if (current_max>0)
	                current_max--;
	            else
	                return -1;
	        }
	    }
	 
	    // finally check for unbalanced string
	    if (current_max != 0)
	        return -1;
	 
	    return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
    	System.out.println("please enter some strings:");
    			String s=sc.nextLine();
    			System.out.println("u entered:->"+s);
    				
	}

}
