//ASHNAH KHALID KHAN ERP # 22889

public class Lab4LinkedListMainMethod
{
	public static void main(String[] args)
	{
		System.out.println("SINGLY LINKED LIST");

		Lab4LinkedList SinglyLinkedList = new Lab4LinkedList();

		System.out.println();

		System.out.println("Checking insertInOrder method for given values 100, 40, 30, 80, 200, 40:");		
		System.out.println("(Should be displayed as '30, 40, 40, 80, 100,200')");
		SinglyLinkedList.insertInOrder(100);
		SinglyLinkedList.insertInOrder(40);
		SinglyLinkedList.insertInOrder(30);
		SinglyLinkedList.insertInOrder(80);
		SinglyLinkedList.insertInOrder(200);
		SinglyLinkedList.insertInOrder(40);
		System.out.println(SinglyLinkedList.toString());

		System.out.println("\nChecking toString function with and without System.out.print statement:");
		System.out.println("System.out.println(SinglyLinkedList.toString()): " + SinglyLinkedList.toString());
		System.out.println("System.out.println(SinglyLinkedList): " + SinglyLinkedList);

		System.out.println("\nChecking find function for first node value, middle node value, last node values, and does-not-exist value:");
		System.out.println("(First node case should be true) find(30): " + SinglyLinkedList.find(30));
		System.out.println("(Middle node case should be true) find(80): " + SinglyLinkedList.find(80));
		System.out.println("(Last node case should be true) find(200): " + SinglyLinkedList.find(200));
		System.out.println("(Not found case should be false) find(155): " + SinglyLinkedList.find(155));

		System.out.println("\nChecking clear function:");
		System.out.println("Before clearing: " + SinglyLinkedList);
		SinglyLinkedList.clear();
		System.out.println("After clearing: " + SinglyLinkedList);

		System.out.println("\nChecking clear function:");
 		System.out.println("Since list has just been cleared, it should give true: " + SinglyLinkedList.isEmpty());
		SinglyLinkedList.insertInOrder(100);
		SinglyLinkedList.insertInOrder(40);
		SinglyLinkedList.insertInOrder(30);
		SinglyLinkedList.insertInOrder(80);
		SinglyLinkedList.insertInOrder(200);
		SinglyLinkedList.insertInOrder(40);
 		System.out.println("After re-adding same values to list, it should give false: " + SinglyLinkedList.isEmpty());

		System.out.println("\nChecking length function: ");
		System.out.println(SinglyLinkedList);
		System.out.println("Length of list (should give 6): " + SinglyLinkedList.length());
		Lab4LinkedList EmptyList = new Lab4LinkedList();
		System.out.println("Length of empty list (should give 0): " + EmptyList.length());
		Lab4LinkedList OneNodeList = new Lab4LinkedList();
		OneNodeList.insertInOrder(1);
		System.out.println("Length of one filled node list (should give 1): " + OneNodeList.length());

		System.out.println("\nChecking remove function:");
		System.out.println("Original list before any removal: " + SinglyLinkedList);
		SinglyLinkedList.remove(30);
		System.out.println("Removal of first node case: " + SinglyLinkedList);
		SinglyLinkedList.insertInOrder(30);
		SinglyLinkedList.remove(40);
		System.out.println("Removal of any middle node case: " + SinglyLinkedList);
		SinglyLinkedList.insertInOrder(40);
		SinglyLinkedList.remove(200);
		System.out.println("Removal of last node case: " + SinglyLinkedList);
		SinglyLinkedList.insertInOrder(200);
		SinglyLinkedList.remove(155);
		System.out.println("Removal of non-existent node case: " + SinglyLinkedList);

		System.out.println("\nChecking addAll function:");
		System.out.println("If list is empty then next list will become head of original list:");
		System.out.println("Original List: " + EmptyList);
		System.out.println("Other List: " + SinglyLinkedList);
		EmptyList.addAll(SinglyLinkedList);
		System.out.println("After addAll: " + EmptyList);
		System.out.println();
		System.out.println("If list is not empty then next list will be added to end of original list:");
		System.out.println("Original List: " + OneNodeList);
		System.out.println("Other List: " + EmptyList);
		OneNodeList.addAll(EmptyList);
		System.out.println("After addAll: " + OneNodeList);

		System.out.println("\nChecking reverse function:");
		System.out.println("Original List: " + SinglyLinkedList);
		SinglyLinkedList.reverse();
		System.out.println("Reversed List: " + SinglyLinkedList);
		SinglyLinkedList.reverse();
		System.out.println("Re-reversed List (should be same as original): " + SinglyLinkedList);
	}
}