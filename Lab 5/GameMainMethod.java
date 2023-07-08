public class GameMainMethod
{
	public static void main(String[] args)
	{
		System.out.println("CIRCULAR LINKED LIST");

		Game CircularLinkedList = new Game();

		System.out.println("\nChecking print method (is initially empty):");
		System.out.println(CircularLinkedList);

		System.out.println("\nChecking insert method:");
		CircularLinkedList.insert("Player 1");
		System.out.println(CircularLinkedList);
		CircularLinkedList.insert("Player 2");
		System.out.println(CircularLinkedList);
		CircularLinkedList.insert("Player 3");
		System.out.println(CircularLinkedList);
		CircularLinkedList.insert("Player 4");
		System.out.println(CircularLinkedList);

		System.out.println("\nChecking playGame method:");
		System.out.println("FIRST TIME playGame WINNER: "+ CircularLinkedList.playGame());
		Game SecondCircularLinkedList = new Game();
		SecondCircularLinkedList.insert("Player 1");
		SecondCircularLinkedList.insert("Player 2");
		SecondCircularLinkedList.insert("Player 3");
		SecondCircularLinkedList.insert("Player 4");

		System.out.println("SECOND TIME playGame WINNER (with same list values): " + SecondCircularLinkedList.playGame());
		Game ThirdCircularLinkedList = new Game();
		ThirdCircularLinkedList.insert("Player 1");
		ThirdCircularLinkedList.insert("Player 2");
		ThirdCircularLinkedList.insert("Player 3");
		ThirdCircularLinkedList.insert("Player 4");
		System.out.println("THIRD TIME playGame WINNER (with same list values): " + ThirdCircularLinkedList.playGame());
	}
}