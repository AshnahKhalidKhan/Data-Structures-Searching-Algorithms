public class Lab9Main
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("BINARY SEARCH TREE DELETION...");

		Lab9BinarySearchTree<Integer> BST = new Lab9BinarySearchTree<Integer>();

		System.out.println("\nEmpty tree:");
		BST.LNR(BST.root);
		System.out.println("Tree after inserting values:");
		BST.insert(50);
		BST.insert(10);
		BST.insert(60);
		BST.insert(30);
		BST.insert(5);
		BST.insert(100);
		BST.insert(20);
		BST.insert(3);
		BST.LNR(BST.root);

		System.out.println("\nMinimum value: " + BST.Minimum(BST.root));
		System.out.println("\nMaximum value: " + BST.Maximum(BST.root));

		Lab8BinaryNode[] ref = new Lab8BinaryNode[2];
		ref = BST.find(50);
		System.out.println("\nFinding 50 (first value): " + ref[0] + " " + ref[1]);
		ref = BST.find(5);
		System.out.println("Finding 5 (smallest value): " + ref[0] + " " + ref[1]);
		ref = BST.find(60);
		System.out.println("Finding 60 (highest value): " + ref[0] + " " + ref[1]);
		ref = BST.find(40);
		System.out.println("Finding 40 (INVALID value): " + ref[0] + " " + ref[1]);

		System.out.println("\nDeleting values:");
		BST.LNR(BST.root);
		System.out.println("Deleting 30:");
		BST.delete(30);
		BST.LNR(BST.root);
		System.out.println("Deleting 50:");
		BST.delete(50);
		BST.LNR(BST.root);
		System.out.println("Deleting 3:");
		BST.delete(3);
		BST.LNR(BST.root);
		System.out.println("Deleting 20:");
		BST.delete(20);
		BST.LNR(BST.root);
		System.out.println("Deleting 100:");
		BST.delete(100);
		BST.LNR(BST.root);



		System.out.println("\n\n\nARRAY BASED BINARY SEARCH TREE...");

		Lab9ArrayBinarySearchTree<Integer> ArrayBST = new Lab9ArrayBinarySearchTree<Integer>(15);

		ArrayBST.traverse();
		System.out.println("\nInserting values:");
		ArrayBST.insert(6);
		ArrayBST.traverse();
		ArrayBST.insert(5);
		ArrayBST.traverse();
		ArrayBST.insert(8);
		ArrayBST.traverse();
		ArrayBST.insert(7);
		ArrayBST.traverse();
		ArrayBST.insert(9);
		ArrayBST.traverse();
		ArrayBST.insert(12);
		ArrayBST.traverse();
		ArrayBST.insert(3);
		ArrayBST.traverse();
		ArrayBST.insert(4);
		ArrayBST.traverse();
		ArrayBST.insert(6);
		ArrayBST.traverse();
		System.out.println("Inserting value afer bramch is full:");
		ArrayBST.insert(10);

		System.out.println("\nDeleting values:");
		System.out.println("\nDeleting no child case:");
		ArrayBST.delete(12);
		ArrayBST.traverse();
		System.out.println("\nDeleting one child case:");
		ArrayBST.delete(5);
		ArrayBST.traverse();
		System.out.println("\nDeleting two child case:");
		ArrayBST.delete(8);
		ArrayBST.traverse();
		System.out.println("\nDeleting root case:");
		ArrayBST.delete(6);
		ArrayBST.traverse();
		System.out.println("\nDeleting root case AGAIN:");
		ArrayBST.delete(7);
		ArrayBST.traverse();
		System.out.println("\nDeleting Invalid value:");
		ArrayBST.delete(100);	

		System.out.println("\nInorder traversal method:");
		ArrayBST.traverseLNR(0);
	}
}