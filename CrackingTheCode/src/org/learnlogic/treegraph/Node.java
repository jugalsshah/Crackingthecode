package org.learnlogic.treegraph;

public class Node<T> {

	public Node left;
	public Node right;
	public int value;
	
	public Node(int value){
		
		this.value=value;
		right=null;
		left=null;
		
	}
	

}
