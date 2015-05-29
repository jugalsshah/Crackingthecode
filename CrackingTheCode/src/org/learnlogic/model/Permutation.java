package org.learnlogic.model;

public class Permutation {

	
	 private char[] arrA;
	 
	    public void permutation(char[] arrA, int left, int size) {
	        int x;
	        if (left == size) {
	            for (int i = 0; i < arrA.length; i++) {
	                System.out.print(arrA[i]);
	            }
	            System.out.print(" ");
	        } else {
	            for (x = left; x < size; x++) {
	                swap(arrA, left, x);
	                permutation(arrA, left + 1, size);
	                swap(arrA, left, x);
	            }
	        }
	    }
	 
	    public void swap(char[] arrA, int i, int j) {
	        char temp = arrA[i];
	        arrA[i] = arrA[j];
	        arrA[j] = temp;
	    }
	 
	    public static void main(String[] args) throws java.lang.Exception {
	        // your code goes here
	        String s = "abcd";
	        char[] arrCh = s.toCharArray();
	        Permutation i = new Permutation();
	        i.permutation(arrCh, 0, arrCh.length);
	    }
}
