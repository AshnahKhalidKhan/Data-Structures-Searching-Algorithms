public class Lab8Main
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("BINARY SEARCH TREE...");

		Lab8BinarySearchTree<Integer> BST = new Lab8BinarySearchTree<Integer>();

		System.out.println("\nEmpty tree:");
		BST.LNR(BST.root);
		System.out.println("Inserting 50:");
		BST.insert(50);
		BST.LNR(BST.root);
		System.out.println("Inserting 50 (AGAIN):");
		BST.insert(50);
		BST.LNR(BST.root);
		System.out.println("Inserting 60:");
		BST.insert(60);
		BST.LNR(BST.root);
		System.out.println("Inserting 30:");
		BST.insert(30);
		BST.LNR(BST.root);
		System.out.println("Inserting 5:");
		BST.insert(5);
		BST.LNR(BST.root);
		System.out.println("Inserting 20:");
		BST.insert(20);
		BST.LNR(BST.root);
		System.out.println("Inserting 20 (AGAIN):");
		BST.insert(20);
		BST.LNR(BST.root);
		System.out.println("Inserting 5 (AGAIN):");
		BST.insert(5);
		BST.LNR(BST.root);

		System.out.println("\nMinimum value: " + BST.Minimum());
		System.out.println("\nMaximum value: " + BST.Maximum());

		System.out.println("\nFinding 50 (first value): " + BST.find(50));
		System.out.println("Finding 5 (smallest value): " + BST.find(5));
		System.out.println("Finding 60 (highest value): " + BST.find(60));
		System.out.println("Finding 40 (INVALID value): " + BST.find(40));
	}
}