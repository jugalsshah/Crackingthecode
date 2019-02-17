package org.learnlogic.linkedlist;


public class MergeTwoSortedLinkedList {
	private LinkedListT a;
    private LinkedListT b;
 
    public MergeTwoSortedLinkedList(LinkedListT a, LinkedListT b) {

    	this.a=a;
    	this.b=b;
	}
    
	public LinkedListT mergeWithOutRecur() {
        LinkedListT result = new LinkedListT();
        while (a.head != null && b.head != null) {
            // System.out.println(a.head.data + " " + b.head.data);
            if (a.head.data < b.head.data) {
                result.addAtEnd(a.head.data);
                a.head = a.head.next;
            } else {
                result.addAtEnd(b.head.data);
                b.head = b.head.next;
            }
        }
        while (a.head != null) {
            result.addAtEnd(a.head.data);
            a.head = a.head.next;
        }
        while (b.head != null) {
            result.addAtEnd(b.head.data);
            b.head = b.head.next;
        }
        return result;
    }
 
    public Node recurrsionMerge(Node nA, Node nB) {
        // base case
        Node result = null;
        if (nA == null)
            return nB;
        else if (nB == null)
            return nA;
        if (nA.data < nB.data) {// Check which node has a smaller value
            result = nA; // add it to the result node
            result.next = recurrsionMerge(nA.next, nB);// Recursive call and add
                                                        // the return node as
                                                        // result.next
        } else {
            result = nB; // add it to the result node
            result.next = recurrsionMerge(nA, nB.next); // Recursive call and
                                                        // add the return node
                                                        // as result.next
        }
        return result;
    }
 
    public void display(Node head) {
        System.out.println("");
        Node currNode = head;
        while (currNode != null) {
            System.out.print("->" + currNode.data);
            currNode = currNode.next;
        }
        System.out.println("");
    }
 

	public static void main(String args[]){
		
		LinkedListT a = new LinkedListT();
		a.addAtBegin(1);
		a.addAtEnd(3);
		a.addAtEnd(5);
		a.addAtEnd(7);
		a.addAtEnd(9);
		
		LinkedListT b= new LinkedListT();
		b.addAtBegin(2);
		b.addAtEnd(4);
		b.addAtEnd(6);
		b.addAtEnd(8);
		b.addAtEnd(10);
		
		MergeTwoSortedLinkedList m = new MergeTwoSortedLinkedList(a,b);
		m.display(a.head);
        m.display(b.head);
        Node result;
        result = m.recurrsionMerge(a.head, b.head);
        m.display(result);
        // method 2
        System.out.println("Method : without Recursion");
        
        LinkedListT a1 = new LinkedListT();
        a1.addAtBegin(18);
        a1.addAtBegin(6);
        a1.addAtBegin(2);
        LinkedListT b1 = new LinkedListT();
        b1.addAtBegin(19);
        b1.addAtBegin(17);
        b1.addAtBegin(3);
        b1.addAtBegin(1);
      MergeTwoSortedLinkedList m1= new MergeTwoSortedLinkedList(a1,b1);
        m1.display(a1.head);
        m1.display(b1.head);
 
        LinkedListT res = m1.mergeWithOutRecur();
        m1.display(res.head);
		
	}
}
