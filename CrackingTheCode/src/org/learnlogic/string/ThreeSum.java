package org.learnlogic.string;

import java.util.ArrayList;
import java.util.Arrays;


/*
 * 
 * find unique triplets{-1 0 1 2 -1 -4}=0
 * */
public class ThreeSum {
	
	public static void main(String[] args){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int[] num={-1, 0, 1, 2, -1, -4};
		
//		if (num.length < 3){
//			break;
//		}
		
		Arrays.sort(num);
//		System.out.println(Arrays.toString(a));
		for (int i = 0; i < num.length - 2; i++) {
			// //avoid duplicate solutions
			if (i == 0 || num[i] > num[i - 1]) {
	 
				int negate = -num[i];
	 
				int start = i + 1;
				int end = num.length - 1;
	 
				while (start < end) {
					//case 1
					if (num[start] + num[end] == negate) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[start]);
						temp.add(num[end]);
	 
						result.add(temp);
						start++;
						end--;
						//avoid duplicate solutions
						while (start < end && num[end] == num[end + 1])
							end--;
	 
						while (start < end && num[start] == num[start - 1])
							start++;
					//case 2
					} else if (num[start] + num[end] < negate) {
						start++;
					//case 3
					} else {
						end--;
					}
				}
	 
			}
		}
		
		System.out.println(result+"aaaaaaaaaaa");
	}

}
