public class Lab6LinkedListBasedStackMainMethod
{
	public static void main(String[] args)
	{
		System.out.println();

		System.out.println("LINKED LIST BASED STACK...");

		Lab6LinkedListBasedStack<String> Stack = new Lab6LinkedListBasedStack<String>();

		System.out.println("\nChecking PEEK, isEmpty and PUSH functions:");
		System.out.println("Is array empty (should return true):" + Stack.isEmpty());
		System.out.println("Pushing new element into stack...");
		Stack.PUSH("First");
		String TopElement = Stack.PEEK();
		System.out.println("Top element in stack now: " + TopElement);
		System.out.println("Is stack empty (should return false): " + Stack.isEmpty());
		System.out.println("Pushing new element into stack...");
		Stack.PUSH("Second");
		TopElement = Stack.PEEK();
		System.out.println("Top element in stack now: " + TopElement);
		System.out.println("Pushing new element into stack...");
		Stack.PUSH("Third");
		TopElement = Stack.PEEK();
		System.out.println("Top element in stack now: " + TopElement);

		System.out.println("\nChecking POP function:");
		TopElement = Stack.PEEK();
		System.out.println("Top element in stack now: " + TopElement);
		System.out.println("Popping " + TopElement + " from stack... New TopElement in stack should be 'Second'...");
		Stack.POP();
		TopElement = Stack.PEEK();
		System.out.println("Top element in stack now: " + TopElement);
	}
}