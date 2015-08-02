package org.learnlogic.string;

import java.util.HashMap;

public class TwoSum {

	/*
	 * //naive approach public static void main(String arg[]){
	 * 
	 * int [] array={3,8,6,10,2,7};
	 * 
	 * int target = 9; int index1 = 0, index2 = 0,pointer=0; for(int i=1;
	 * i<array.length; i++){
	 * 
	 * index1=target-array[i-1]; pointer=array[i-1];
	 * //System.out.println(pointer+":+:====="+index2); for(int
	 * j=i;j<array.length;j++){ if(array[j]==index1){ index2=array[j];
	 * System.out.println(pointer+":+:"+index2); break;
	 * 
	 * } } }
	 * 
	 * }
	 */

	
	//better appraoch
	public static void main(String arg[]) {

		int[] array = { 8,102,11 ,5,8,3,111,2,9,7 };

		int target = 9;
		
		HashMap<Integer, Integer> hashMap= new HashMap<Integer, Integer>();
		
		int[] result = new int[2];
		
		for(int i= 1; i < array.length;i++){
			//System.out.println(hashMap.containsKey(array[i])+"asdad");
			if (hashMap.containsKey(array[i])) {
				int index = hashMap.get(array[i]);
				//System.out.println(index+"Sss"+array[i]);
				result[0] = index+1 ;
				result[1] = i+1;
				break;
			} else {
				hashMap.put(target - array[i], i);
			}
		}
		System.out.println(result[0]+"+"+result[1]);
		
	}
}
