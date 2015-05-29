package org.learnlogic.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


// add two numbers represented by linkedlist.
// mergesort
public class Demo {
	
	public static int[] mergeSort(int [] list) {
        if (list.length <= 1) {
            System.out.println("sss");
        	return list;
        }
        
        // Split the array in half
        int[] first = new int[list.length / 2];
//               
        System.out.println("::->"+first.length+"::"+first);
        
        int[] second = new int[list.length - first.length];
	
        System.out.println("::->"+second.length+"::"+second);
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
//        
        mergeSort(first);
        mergeSort(second);
        
        System.out.println("l"+first.length+"::"+second.length+"=="+first+"=="+second);
        merge(first, second, list);
        
        return list;
	} 
	private static void merge(int[] first, int[] second, int [] result) {
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;
        System.out.println(first.length+""+second.length+""+result.length);
        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                
            	result[j] = first[iFirst];
            	System.out.println("fff"+first[iFirst]+"ssss"+second[iSecond]+"saa"+result[j]);
            	iFirst++;
                } else {
                result[j] = second[iSecond];
                System.out.println("fff"+first[iFirst]+"ssss"+second[iSecond]+"ssaas"+result[j]);
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
        
	}
    public static void main(String args[]) throws Exception
    {
        String list="";
        int i=0,n=0;
        
        Demo s= new Demo();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Please enter the list of elements,one element per line");
        System.out.println(" write 'STOP' when list is completed ");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        while(!(list=bf.readLine()).equalsIgnoreCase("stop")){
            int intelement=Integer.parseInt(list);
            arrlist.add(intelement);
            System.out.println(arrlist+"dddd");
        }
        
        int elementlist[]  = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for (int j=0;iter.hasNext();j++) {
            elementlist[j] = iter.next();
            System.out.println(elementlist[j]+"elementlist[j]");
        }
        
        elementlist=mergeSort(elementlist);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Values after Merge Sort : ");
        for (int j=0;j<elementlist.length;j++) {
            System.out.println(elementlist[j]+" ");
        }
    }
}
//ap[1,3,5,7,8,9,11,13,15]
//8,4