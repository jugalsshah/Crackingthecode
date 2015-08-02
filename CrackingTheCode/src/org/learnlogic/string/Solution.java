package org.learnlogic.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public int ans(int[] A){
		
		int i;
		int count=0;
		Set<Integer> set = new HashSet<>();
		//Arrays.sort(A);
		//HashMap<Integer, Integer> hashMap= new HashMap<Integer, Integer>();
		for(int k : A){
			 if (!set.add(k)){
			        count++;
		}
		}
//		for(i=1;i<A.length;i++){
//			
//			 if (A[i] == A[i - 1]){
//			        count++;
//			 }
//		}
		System.out.println(count+"count");
		return count;
	}

	public static void main(String args[]){
		int[] a={4, 2, 6, 5, 4, 4, 5};
		//System.out.println(a[0]+""+a[1]+""+a[2]);
		Solution solution= new Solution();
		System.out.println(solution.ans(a));
		
	}
}
