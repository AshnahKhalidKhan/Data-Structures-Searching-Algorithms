public class Lab6ArrayBasedStackMainMethod
{
	public static void main(String[] args)
	{
		System.out.println();

		System.out.println("ARRAY BASED STACK...");

		Lab6ArrayBasedStack<String> Stack = new Lab6ArrayBasedStack<String>(4);

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

		System.out.println("\nChecking isFull function:");
		System.out.println("Is stack full (should return false): " + Stack.isFull());
		System.out.println("Inserting final element in stack...");
		Stack.PUSH("Fourth");
		System.out.println("Is stack full (should return true): " + Stack.isFull());

		System.out.println("\nChecking dynamicity of array stack:");
		System.out.println("Pushing new element into stack...");
		Stack.PUSH("FirstAfterDynamicArrayCreated");
		TopElement = Stack.PEEK();
		System.out.println("Top element in stack now: " + TopElement);

		System.out.println("\nChecking POP function:");
		TopElement = Stack.PEEK();
		System.out.println("Top element in stack now: " + TopElement);
		System.out.println("Popping " + TopElement + " from stack... New TopElement in stack should be 'Fourth'...");
		Stack.POP();
		TopElement = Stack.PEEK();
		System.out.println("Top element in stack now: " + TopElement);

		System.out.println("\nChecking Parenthesis Check function:");
		String ValidExp = "{[()[]{}]}()";
		System.out.println("Is " + ValidExp + " a valid expression (should return true): " + Stack.validate(ValidExp));
		String InvalidExp = "{[()[]{}]})";
		System.out.println("Is " + InvalidExp + " a valid expression (should return false): " + Stack.validate(InvalidExp));
		String InvalidExp2 = "{[()[{}]}";
		System.out.println("Is " + InvalidExp2 + " a valid expression (should return false): " + Stack.validate(InvalidExp2));
	}
}