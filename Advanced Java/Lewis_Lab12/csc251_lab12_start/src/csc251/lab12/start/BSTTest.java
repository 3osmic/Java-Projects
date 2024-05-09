package csc251.lab12.start;

public class BSTTest {
	public static void main(String[] args) {
		String[] letters = {"R", "B", "A", "M", "W", "C", "G", "S", "F", "D"};
		BST<String> bst = new BST<>(letters);
		System.out.println("Current root is:" + bst.root.element);
		System.out.println("\nCurrent content in BST via inorder traversal:");
		bst.inorder();
		System.out.println("\nCurrent content in BST via postorder traversal:");
		bst.postorder();
		System.out.println("\nCurrent content in BST via preorder traversal:");
		bst.preorder();
		System.out.println();
		BSTUtil.printTree2D(bst.root);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\nRe-root with 'L' which is not in the tree.");
		bst.establishNewRoot("L");
		System.out.println("Current root is:" + bst.root.element);
		System.out.println("\nCurrent content in BST via inorder traversal:");
		bst.inorder();
		System.out.println("\nCurrent content in BST via postorder traversal:");
		bst.postorder();
		System.out.println("\nCurrent content in BST via preorder traversal:");
		bst.preorder();
		System.out.println();
		BSTUtil.printTree2D(bst.root);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\nRe-root with 'A' which is in the tree.");
		bst.establishNewRoot("A");
		System.out.println("Current root is: " + bst.root.element);
		System.out.println("\nCurrent content in BST via inorder traversal:");
		bst.inorder();
		System.out.println("\nCurrent content in BST via postorder traversal:");
		bst.postorder();
		System.out.println("\nCurrent content in BST via preorder traversal:");
		bst.preorder();
		System.out.println();
		BSTUtil.printTree2D(bst.root);	
	}
}
