package org.learnlogic.treegraph;

//import org.learnlogic.model.BinarySearchTree;

public class BinarySearchTree {

	public static TreeNode root;
	public BinarySearchTree(){
		
		this.root=null;		
		
	}
	
	public void insert(int data){
	
		TreeNode treeNode= new TreeNode(data);
		if(root==null){
			
			root=treeNode;
			return;
			
		}
		
		TreeNode currentnode=root;
		TreeNode parentnode= null;
		while(true){
			parentnode=currentnode;
			if(data<currentnode.value){
				
				currentnode=currentnode.left;
				if(currentnode==null){
					
					parentnode.left=treeNode;
					return;
					
				}			
			}
			else{
				currentnode=currentnode.right;
				if(currentnode==null){
					
					parentnode.right=treeNode;
					return;
							
				}
				
			}
			
			
		}
				
	}

	public void display(TreeNode root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.value);
			display(root.right);
		}
	}
	
	public boolean delete(int data){
		
		TreeNode currentndoe=root;
		TreeNode parentnode=root;
		
		
			return false;
	}
	
	public boolean find(int data){
		TreeNode treeNode= root;
		while(treeNode!=null){
			if(treeNode.value==data){
				return true;				
			}
			else if(treeNode.value>data){
				treeNode=treeNode.left;
			}
			else{
				treeNode=treeNode.right;
				
			}
			
		}
		return false;
		
		
	}

	public static void main(String arg[]){
		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);		
		System.out.println("");
		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
//		System.out.println("Delete Node with no children (2) : " + b.delete(2));		
//		b.display(root);
//		System.out.println("\n Delete Node with one child (4) : " + b.delete(4));		
//		b.display(root);
//		System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));		
//		b.display(root);
	}
}
