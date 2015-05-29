package org.learnlogic.treegraph;

public class Traversal {
	// @SuppressWarnings("rawtypes")
		public Node root;

		@SuppressWarnings("unchecked")
		public void insert(int value) {
			Node node = new Node<>(value);

			if (root == null) {
				root = node;
				return;
			}
			insertRec(root, node);
		}

		public void insertRec(Node latestroot, Node node) {
			if (latestroot.value > node.value) {
				if (latestroot.left == null) {

					latestroot.left = node;
					return;
				} else {
					insertRec(latestroot.left, node);
				}

			} else {

				if (latestroot.right == null) {

					latestroot.right = node;
					return;
				} else {
					insertRec(latestroot.right, node);
				}

			}

		}

		public void printInorder() {

			inorder(root);

		}

		public void inorder(Node currentNode) {

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

		public void preorder(Node currentNode) {
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

		public void postorder(Node currentNode) {

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
