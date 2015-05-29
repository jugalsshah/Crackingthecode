package org.learnlogic.model;

public class FindPeak {

	
	public int findMaxvalue(int[] array,int low,int high, int size){
		int mid=(low+high)/2;
		if(mid==0||array[mid]>=array[mid-1]&&array[mid]>=array[mid+1]||mid==size-1){
			
			return mid;
		}
		else if(mid>0 && array[mid]<array[mid-1]){
			return findMaxvalue(array, low, mid-1, size);
		}
		else{
			return findMaxvalue(array, mid+1, high, size);
		}	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] a= {10,22,9,34,12,33,23,17,19,43};

		FindPeak peak= new FindPeak();
		int peaks=peak.findMaxvalue(a,0,a.length-1,a.length);
		System.out.println("peak valus is"+a[peaks]);
	}

	
	
}
