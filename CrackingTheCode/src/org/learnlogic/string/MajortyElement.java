package org.learnlogic.string;

import java.util.HashMap;
import java.util.Iterator;



public class MajortyElement {

	public static void main(String[] args){
		int[] nums={1,2,5,9,3,5,6,8,9,41,5,35,357,7,2,2,7,7,6,6,6,6,9,99,9,9,9,9,9};
		
		HashMap<Integer, Integer> hashMap= new HashMap<Integer, Integer>();
//		hashMap.
		
		 for(int i: nums){
		        if(hashMap.containsKey(i)){
		            hashMap.put(i, hashMap.get(i)+1);
		        }else{
		            hashMap.put(i, 1);
		        }
		    }
		 
	}
}
