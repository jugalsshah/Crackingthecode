package org.learnlogic.model;

public class BinarySearch {
	private int [] arrA;
    private int number;
 
    public BinarySearch(int [] arrA){
        this.arrA = arrA;
    }
    public Boolean Search(int low,int high, int number){
        if(low>high){
            return false;
        }       
        int mid = (high+low)/2;
        if(arrA[mid]==number)return true;
        else if (arrA[mid]>number) return Search(low,mid-1,number);
        else return Search(mid+1,high,number);
    }
 
    public static void main(String args[]){
        int [] a = {2,5,8,10,14,44,77,78,99};
        int number = 99;
        BinarySearch b = new BinarySearch(a);
        System.out.println("The "+ number + " present in array a ??? :" + b.Search(0, a.length-1, number));
        number = 76;
        System.out.println("The "+ number + " present in array a ??? :" + b.Search(0, a.length-1, number));
 
    }
 
}
