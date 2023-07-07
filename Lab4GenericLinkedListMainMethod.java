//ASHNAH KHALID KHAN ERP # 22889

public class Lab4GenericLinkedListMainMethod
{
	public static void main(String[] args)
	{
		System.out.println("GENERIC SINGLY LINKED LIST");

		Lab4GenericLinkedList<Integer> GenericSinglyLinkedList = new Lab4GenericLinkedList<Integer>();

		System.out.println("\nChecking insertInOrder method for given values 100, 40, 30, 80, 200, 40:");		
		System.out.println("(Should be displayed as '30, 40, 40, 80, 100, 200')");
		GenericSinglyLinkedList.insertInOrder(100);
		GenericSinglyLinkedList.insertInOrder(40);
		GenericSinglyLinkedList.insertInOrder(30);
		GenericSinglyLinkedList.insertInOrder(80);
		GenericSinglyLinkedList.insertInOrder(200);
		GenericSinglyLinkedList.insertInOrder(40);
		System.out.println(GenericSinglyLinkedList.toString());

		System.out.println("\nChecking toString function with and without System.out.print statement:");
		System.out.println("System.out.println(GenericSinglyLinkedList.toString()): " + GenericSinglyLinkedList.toString());
		System.out.println("System.out.println(GenericSinglyLinkedList): " + GenericSinglyLinkedList);

		System.out.println("\nChecking find function for first node value, middle node value, last node values, and does-not-exist value:");
		System.out.println("(First node case should be true) find(30): " + GenericSinglyLinkedList.find(30));
		System.out.println("(Middle node case should be true) find(80): " + GenericSinglyLinkedList.find(80));
		System.out.println("(Last node case should be true) find(200): " + GenericSinglyLinkedList.find(200));
		System.out.println("(Not found case should be false) find(155): " + GenericSinglyLinkedList.find(155));

		System.out.println("\nChecking clear function:");
		System.out.println("Before clearing: " + GenericSinglyLinkedList);
		GenericSinglyLinkedList.clear();
		System.out.println("After clearing: " + GenericSinglyLinkedList);

		System.out.println("\nChecking clear function:");
 		System.out.println("Since list has just been cleared, it should give true: " + GenericSinglyLinkedList.isEmpty());
		GenericSinglyLinkedList.insertInOrder(100);
		GenericSinglyLinkedList.insertInOrder(40);
		GenericSinglyLinkedList.insertInOrder(30);
		GenericSinglyLinkedList.insertInOrder(80);
		GenericSinglyLinkedList.insertInOrder(200);
		GenericSinglyLinkedList.insertInOrder(40);
 		System.out.println("After re-adding same values to list, it should give false: " + GenericSinglyLinkedList.isEmpty());

		System.out.println("\nChecking length function: ");
		System.out.println(GenericSinglyLinkedList);
		System.out.println("Length of list (should give 6): " + GenericSinglyLinkedList.length());
		Lab4GenericLinkedList<Integer> GenericEmptyList = new Lab4GenericLinkedList<Integer>();
		System.out.println("Length of empty list (should give 0): " + GenericEmptyList.length());
		Lab4GenericLinkedList<Integer> GenericOneNodeList = new Lab4GenericLinkedList<Integer>();
		GenericOneNodeList.insertInOrder(1);
		System.out.println("Length of one filled node list (should give 1): " + GenericOneNodeList.length());

		System.out.println("\nChecking remove function:");
		System.out.println("Original list before any removal: " + GenericSinglyLinkedList);
		GenericSinglyLinkedList.remove(30);
		System.out.println("Removal of first node case: " + GenericSinglyLinkedList);
		GenericSinglyLinkedList.insertInOrder(30);
		GenericSinglyLinkedList.remove(40);
		System.out.println("Removal of any middle node case: " + GenericSinglyLinkedList);
		GenericSinglyLinkedList.insertInOrder(40);
		GenericSinglyLinkedList.remove(200);
		System.out.println("Removal of last node case: " + GenericSinglyLinkedList);
		GenericSinglyLinkedList.insertInOrder(200);
		GenericSinglyLinkedList.remove(155);
		System.out.println("Removal of non-existent node case: " + GenericSinglyLinkedList);

		System.out.println("\nChecking addAll function:");
		System.out.println("If list is empty then next list will become head of original list:");
		System.out.println("Original List: " + GenericEmptyList);
		System.out.println("Other List: " + GenericSinglyLinkedList);
		GenericEmptyList.addAll(GenericSinglyLinkedList);
		System.out.println("After addAll: " + GenericEmptyList);
		System.out.println();
		System.out.println("If list is not empty then next list will be added to end of original list:");
		System.out.println("Original List: " + GenericOneNodeList);
		System.out.println("Other List: " + GenericEmptyList);
		GenericOneNodeList.addAll(GenericEmptyList);
		System.out.println("After addAll: " + GenericOneNodeList);

		System.out.println("\nChecking reverse function:");
		System.out.println("Original List: " + GenericSinglyLinkedList);
		GenericSinglyLinkedList.reverse();
		System.out.println("Reversed List: " + GenericSinglyLinkedList);
		GenericSinglyLinkedList.reverse();
		System.out.println("Re-reversed List (should be same as original): " + GenericSinglyLinkedList);
	}
}