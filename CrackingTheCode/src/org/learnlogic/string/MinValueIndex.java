package org.learnlogic.string;

import java.util.Arrays;



/*
 * find minimum element index form the array
 * 
 * 
 * */


public class MinValueIndex {
	
	
	public int search(int[] nums, int target) {
	    return binarySearch(nums, 0, nums.length-1, target);
	}
	public int binarySearch(int[] nums, int left, int right, int target){
		if(left>right) 
	        return -1;
		int mid=(left+right)/2;
		
		if(nums[left]<=nums[mid]){
			if(target<nums[mid] && target>nums[left]){
				right=mid-1;
				return binarySearch(nums, left, right, target);
				
			}
			else if(target>nums[mid] && target>nums[right]){
				left=mid+1;
				return binarySearch(nums, left, right, target);
			}
		}
		else{
			if(target<nums[mid] && target>nums[left]){
				return binarySearch(nums, left, mid-1, target);
								
			}
			else{
				return binarySearch(nums, left, mid+1, target);
			}
			
		}
		

	    if(target == nums[mid])
	        return mid;
		//return target;

		
	return Arrays.asList(nums).indexOf(target);		
		
	}
	
	public static void main(String[] args){
		int[] aa= {4,5,6,7,0,1,2};
		int target=0;
		
		
		MinValueIndex index= new MinValueIndex();
		System.out.println(index.search(aa, target));
		
		
	}

}
