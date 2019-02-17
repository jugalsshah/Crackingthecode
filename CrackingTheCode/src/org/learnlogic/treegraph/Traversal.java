package org.learnlogic.treegraph;

public class Traversal {
	// @SuppressWarnings("rawtypes")
		public TreeNode root;

		@SuppressWarnings("unchecked")
		public void insert(int value) {
			TreeNode treeNode = new TreeNode(value);

			if (root == null) {
				root = treeNode;
				return;
			}
			insertRec(root, treeNode);
		}

		public void insertRec(TreeNode latestroot, TreeNode treeNode) {
			if (latestroot.value > treeNode.value) {
				if (latestroot.left == null) {

					latestroot.left = treeNode;
					return;
				} else {
					insertRec(latestroot.left, treeNode);
				}

			} else {

				if (latestroot.right == null) {

					latestroot.right = treeNode;
					return;
				} else {
					insertRec(latestroot.right, treeNode);
				}

			}

		}

		public void printInorder() {

			inorder(root);

		}

		public void inorder(TreeNode currentNode) {

			if (currentNode == null) {

				return;
			}
			inorder(currentNode.left);
			System.out.print(currentNode.value + ", ");
			inorder(currentNode.right);

		}

		public void printPreorder() {
			preorder(root);
		}

		public void preorder(TreeNode currentNode) {
			if (currentNode == null) {

				return;
			}
			System.out.print(currentNode.value + ", ");
			preorder(currentNode.left);

			preorder(currentNode.right);

		}

		//
		public void printPostorder() {

			postorder(root);

		}

		public void postorder(TreeNode currentNode) {

			if (currentNode == null) {

				return;
			}

			postorder(currentNode.left);

			postorder(currentNode.right);
			System.out.print(currentNode.value + ", ");

		}

		public void findMinimum() {

		}

		public void findMaximum() {

		}

		public static void main(String args[]) {

			Traversal bst = new Traversal();
			bst.insert(40);
			bst.insert(25);
			bst.insert(78);
			bst.insert(10);
			bst.insert(3);
			bst.insert(17);
			bst.insert(32);
			bst.insert(30);
			bst.insert(38);
			bst.insert(78);
			bst.insert(50);
			bst.insert(93);
			System.out.println("Inorder traversal");
			bst.printInorder();

			System.out.println("Preorder Traversal");
			bst.printPreorder();

			System.out.println("Postorder Traversal");
			bst.printPostorder();

//			System.out
//					.println("The minimum value in the BST: " + bst.findMaximum());
//			System.out
//					.println("The maximum value in the BST: " + bst.findMaximum());

		}

}
