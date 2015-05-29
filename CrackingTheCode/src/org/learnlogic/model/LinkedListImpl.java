package org.learnlogic.model;

public class LinkedListImpl {
	
	 public static void main(String[] args) throws java.lang.Exception {
	        LinkedListT a = new LinkedListT();
	        a.addAtBegin(5);
	        a.addAtBegin(15);
	        a.addAtEnd(20);
	        a.addAtEnd(21);
	        a.deleteAtBegin();
	        a.deleteAtEnd();
	        a.addAtIndex(10, 2);
	        a.addAtEnd(15);
	        a.display();
	        System.out.println("\n Size of the list is: " + a.size);
	        System.out.println(" Element at 2nd position : " + a.elementAt(2));
	        System.out.println(" Searching element 20, location : " + a.search(15));
	    }
}
class Node {
    public int data;
    public Node next;
 
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 class LinkedListT{
	 public Node head;
	 public int size;
	 
	 public LinkedListT() {
		// TODO Auto-generated constructor stub
	this.head=null;
	 }
	 
	 
	 public void addAtBegin(int data){
		 Node n=new Node(data);
		n.next=head;
		head=n;
		size++;
		System.out.println("size::->"+size);
			 
		 
		 
	 }
	 public int search(int data){
	        Node n = head;
	        int count = 1;
	        while(n!=null){
	            if(n.data==data){
	                return count;
	            }else{
	                n = n.next;
	                count++;
	            }
	        }
	        return -1;
	    }
	 
	 public void addAtEnd(int data){
		 if (head == null) {
	            addAtBegin(data);
	        } else{
		 Node n= new Node(data);
		 Node currentnode=head;
		 while(currentnode.next!=null){
			 currentnode=currentnode.next;
		 }
		 currentnode.next=n;
		 size++;
		 System.out.println("size::->"+size);
	        }
	 }
	 
	 public int deleteAtBegin(){
		
		int temp=head.data;
		head=head.next;
		size--;
		System.out.println("size::->"+size+"temp::"+temp);
		return temp;
	 }
	 public void deleteAtEnd(){
		 Node currentnode = head;
	        if (head.next == null) {
	            head = null;
	        } else{
		 while(currentnode.next.next!=null){
			 currentnode=currentnode.next;
			 
		 }
		 int temp=currentnode.next.data;
		 currentnode.next=null;
		 size--;
		 System.out.println("size::->"+size);
			
	        }
	 }
	 public void display() {
	        System.out.println("");
	        Node currNode = head;
	        while (currNode != null) {
	            System.out.print("->" + currNode.data);
	            currNode = currNode.next;
	        }
	    }

	 public int elementAt(int index){
	        if(index>size){
	            return -1;
	        }
	        Node n = head;
	        while(index-1!=0){
	            n=n.next;
	            index--;
	        }
	        return n.data;
	    }
	 public void addAtIndex(int data, int position){
		 if(position == 1){
	            addAtBegin(data);
	        }
	        int len = size;
	        if (position>len+1 || position <1){
	            System.out.println("\nINVALID POSITION");
	        }
	        if(position==len+1){
	            addAtEnd(data);
	        }
	        if(position<=len && position >1){
	            Node n = new Node(data);
	            Node currNode = head; //so index is already 1
	            while((position-2)>0){
	                System.out.println(currNode.data+";;;;");
	                currNode=currNode.next;
	                position--;
	            }
	            n.next = currNode.next;
	            currNode.next = n;
	            size++;
	        }
	        }
	 
	 
	 
 }