//ASHNAH KHALID KHAN ERP # 22889

public class Lab7Main
{
	public static void main(String[] args)
	{
		System.out.println("\nTESTING IMPLEMENTATION OF GIVEN MAIN METHOD FOR PART A:");
		Lab7ArrayBasedQueues<String> Q1 = new Lab7ArrayBasedQueues<String>(10);
		Q1.Enqueue("job1");
		Q1.Enqueue("job2");
		System.out.println(Q1.Dequeue());
		System.out.println(Q1.Dequeue());
		System.out.println(Q1.Dequeue());

		Lab7LinkedListBasedQueues<String> Q2 = new Lab7LinkedListBasedQueues<String>();
		Q2.Enqueue("job1");
		Q2.Enqueue("job2");
		System.out.println("\n" + Q2.Dequeue());
		System.out.println(Q2.Dequeue());
		System.out.println(Q2.Dequeue());

		System.out.println("\nTESTING IMPLEMENTATION OF GIVEN MAIN METHOD FOR PART B:");
		Lab7ArrayBasedPriorityQueues<Integer> Q11 = new Lab7ArrayBasedPriorityQueues<Integer>(10);
		Q11.Enqueue(21);
		Q11.Enqueue(54);
		System.out.println(Q11.Dequeue());
		System.out.println(Q11.Dequeue());
		System.out.println(Q11.Dequeue());

		Lab7LinkedListBasedPriorityQueues<Integer> Q22 = new Lab7LinkedListBasedPriorityQueues<Integer>();
		Q22.Enqueue(44);
		Q22.Enqueue(34);
		System.out.println("\n" + Q22.Dequeue());
		System.out.println(Q22.Dequeue());
		System.out.println(Q22.Dequeue());



		System.out.println("\n\n\nARRAY BASED QUEUES...\n");

		Lab7ArrayBasedQueues<Integer> ArrayQueue = new Lab7ArrayBasedQueues<Integer>(4);

		ArrayQueue.printQ();
		System.out.println("Is queue empty (should be true): " + ArrayQueue.isEmpty());
		System.out.println("Is queue full (should return false): " + ArrayQueue.isFull()); //Meaning any elements in queue?
		System.out.println("Trying dequeing empty queue (should give error): ");
		ArrayQueue.Dequeue();

		System.out.println("\nInserting when queue empty: ");
		ArrayQueue.Enqueue(1);
		ArrayQueue.printQ();
		System.out.println("Is queue empty (should be false): " + ArrayQueue.isEmpty());
		System.out.println("Is queue full (should return false): " + ArrayQueue.isFull());

		System.out.println("\nInserting other values: ");
		ArrayQueue.Enqueue(2);
		ArrayQueue.printQ();
		ArrayQueue.Enqueue(3);
		ArrayQueue.printQ();
		System.out.println("Is queue empty (should be false): " + ArrayQueue.isEmpty());
		System.out.println("Is queue full (should return true): " + ArrayQueue.isFull());
		System.out.println("Trying enqueing full queue (should give error): ");
		ArrayQueue.Enqueue(4);

		System.out.println("\nDequeing from front: ");
		System.out.println("Value being dequeued: " + ArrayQueue.Dequeue());
		ArrayQueue.printQ();
		System.out.println("Is queue empty (should be false): " + ArrayQueue.isEmpty());
		System.out.println("Is queue full (should return false): " + ArrayQueue.isFull());
		System.out.println("Next value being dequeued: " + ArrayQueue.Dequeue());
		ArrayQueue.printQ();

		System.out.println("\nInserting values when front points to any middle index: ");
		ArrayQueue.Enqueue(4);
		ArrayQueue.printQ();
		ArrayQueue.Enqueue(5);
		ArrayQueue.printQ();

		System.out.println("\nDequeing until front points to zero index: ");
		System.out.println("Value being dequeued: " + ArrayQueue.Dequeue());
		ArrayQueue.printQ();
		System.out.println("Value being dequeued: " + ArrayQueue.Dequeue());
		ArrayQueue.printQ();
		System.out.println("Value being dequeued: " + ArrayQueue.Dequeue());
		ArrayQueue.printQ();
		System.out.println("Is queue empty (should be true): " + ArrayQueue.isEmpty());
		System.out.println("Is queue full (should return false): " + ArrayQueue.isFull());
		System.out.println("Value being dequeued: " + ArrayQueue.Dequeue());
		ArrayQueue.printQ();

		System.out.println("\nInserting values until rear points to last index: ");
		ArrayQueue.Enqueue(1);
		ArrayQueue.printQ();
		ArrayQueue.Enqueue(2);
		ArrayQueue.printQ();
		ArrayQueue.Enqueue(3);
		ArrayQueue.printQ();
		System.out.println("Is queue empty (should be false): " + ArrayQueue.isEmpty());
		System.out.println("Is queue full (should return true): " + ArrayQueue.isFull());




		System.out.println("\n\n\nLINKED LIST BASED QUEUES...");

		Lab7LinkedListBasedQueues<String> LinkedListQueue = new Lab7LinkedListBasedQueues<String>();

		System.out.println("\nInitial state of queue:");
		System.out.println(LinkedListQueue);
		System.out.println("Is queue empty: " + LinkedListQueue.isEmpty());
		System.out.println("Dequeuing empty queue (should give error): ");
		LinkedListQueue.Dequeue();

		System.out.println("\nInsertion in empty queue:");
		LinkedListQueue.Enqueue("InsertAtFront");
		System.out.println(LinkedListQueue);
		System.out.println("Dequeuing inserted value:");
		LinkedListQueue.Dequeue();
		System.out.println(LinkedListQueue);
		System.out.println("Dequeuing empty queue (should give error): ");
		LinkedListQueue.Dequeue();

		System.out.println("\nChecking further insertions:");
		LinkedListQueue.Enqueue("1stInsert");
		System.out.println(LinkedListQueue);
		LinkedListQueue.Enqueue("2ndInsert");
		System.out.println(LinkedListQueue);
		LinkedListQueue.Enqueue("3rdInsert");
		System.out.println(LinkedListQueue);

		System.out.println("\nChecking further deletions:");
		System.out.println("Value being dequeued: " + LinkedListQueue.Dequeue());
		System.out.println(LinkedListQueue);
		System.out.println("Value being dequeued: " + LinkedListQueue.Dequeue());
		System.out.println(LinkedListQueue);
		System.out.println("Value being dequeued: " + LinkedListQueue.Dequeue());
		System.out.println(LinkedListQueue);
		System.out.println("Dequeuing empty queue (should give error): ");
		LinkedListQueue.Dequeue();




		System.out.println("\n\n\nARRAY BASED PRIORITY QUEUES...\n");

		Lab7ArrayBasedPriorityQueues<Integer> PriorityArrayQueue = new Lab7ArrayBasedPriorityQueues<Integer>(4);

		System.out.println(PriorityArrayQueue);
		System.out.println("Is queue empty (should be true): " + PriorityArrayQueue.isEmpty());
		System.out.println("Is queue full (should return false): " + PriorityArrayQueue.isFull()); //Meaning any elements in queue?
		System.out.println("Trying dequeing empty queue (should give error): ");
		PriorityArrayQueue.Dequeue();

		System.out.println("\nInserting when queue empty: ");
		PriorityArrayQueue.Enqueue(10);
		System.out.println(PriorityArrayQueue);
		System.out.println("Is queue empty (should be false): " + PriorityArrayQueue.isEmpty());
		System.out.println("Is queue full (should return false): " + PriorityArrayQueue.isFull());

		System.out.println("\nInserting other values: ");
		PriorityArrayQueue.Enqueue(40);
		System.out.println(PriorityArrayQueue);
		PriorityArrayQueue.Enqueue(30);
		System.out.println(PriorityArrayQueue);
		PriorityArrayQueue.Enqueue(40);
		System.out.println(PriorityArrayQueue);
		System.out.println("Is queue empty (should be false): " + PriorityArrayQueue.isEmpty());
		System.out.println("Is queue full (should return true): " + PriorityArrayQueue.isFull());
		System.out.println("Trying enqueing full queue (should give error): ");
		PriorityArrayQueue.Enqueue(20);

		System.out.println("\nDequeing from front: ");
		System.out.println("Value being dequeued: " + PriorityArrayQueue.Dequeue());
		System.out.println(PriorityArrayQueue);
		System.out.println("Is queue empty (should be false): " + PriorityArrayQueue.isEmpty());
		System.out.println("Is queue full (should return false): " + PriorityArrayQueue.isFull());
		System.out.println("Next value being dequeued: " + PriorityArrayQueue.Dequeue());
		System.out.println(PriorityArrayQueue);

		System.out.println("\nInserting values when front points to any middle index: ");
		PriorityArrayQueue.Enqueue(1);
		System.out.println(PriorityArrayQueue);
		PriorityArrayQueue.Enqueue(400);
		System.out.println(PriorityArrayQueue);

		System.out.println("\nDequeing until front points to zero index: ");
		System.out.println("Value being dequeued: " + PriorityArrayQueue.Dequeue());
		System.out.println(PriorityArrayQueue);
		System.out.println("Value being dequeued: " + PriorityArrayQueue.Dequeue());
		System.out.println(PriorityArrayQueue);
		System.out.println("Value being dequeued: " + PriorityArrayQueue.Dequeue());
		System.out.println(PriorityArrayQueue);
		System.out.println("Value being dequeued: " + PriorityArrayQueue.Dequeue());
		System.out.println(PriorityArrayQueue);
		System.out.println("Is queue empty (should be true): " + PriorityArrayQueue.isEmpty());
		System.out.println("Is queue full (should return false): " + PriorityArrayQueue.isFull());

		System.out.println("\nInserting values until rear points to last index: ");
		PriorityArrayQueue.Enqueue(100);
		System.out.println(PriorityArrayQueue);
		PriorityArrayQueue.Enqueue(12);
		System.out.println(PriorityArrayQueue);
		PriorityArrayQueue.Enqueue(36);
		System.out.println(PriorityArrayQueue);
		PriorityArrayQueue.Enqueue(100);
		System.out.println(PriorityArrayQueue);
		System.out.println("Is queue empty (should be false): " + PriorityArrayQueue.isEmpty());
		System.out.println("Is queue full (should return true): " + PriorityArrayQueue.isFull());




		System.out.println("\n\n\nLINKED LIST BASED PRIORITY QUEUES...");

		Lab7LinkedListBasedPriorityQueues<Integer> LinkedListPriorityQueue = new Lab7LinkedListBasedPriorityQueues<Integer>();

		System.out.println("\nInitial state of queue:");
		System.out.println(LinkedListPriorityQueue);
		System.out.println("Is queue empty: " + LinkedListPriorityQueue.isEmpty());
		System.out.println("Dequeuing empty queue (should give error): ");
		LinkedListPriorityQueue.Dequeue();

		System.out.println("\nInsertion in empty queue:");
		LinkedListPriorityQueue.Enqueue(100);
		System.out.println(LinkedListPriorityQueue);
		System.out.println("Dequeuing inserted value:");
		LinkedListPriorityQueue.Dequeue();
		System.out.println(LinkedListPriorityQueue);
		System.out.println("Dequeuing empty queue (should give error): ");
		LinkedListPriorityQueue.Dequeue();

		System.out.println("\nChecking further insertions:");
		LinkedListPriorityQueue.Enqueue(100);
		System.out.println(LinkedListPriorityQueue);
		LinkedListPriorityQueue.Enqueue(60);
		System.out.println(LinkedListPriorityQueue);
		LinkedListPriorityQueue.Enqueue(500);
		System.out.println(LinkedListPriorityQueue);
		LinkedListPriorityQueue.Enqueue(7);
		System.out.println(LinkedListPriorityQueue);
		LinkedListPriorityQueue.Enqueue(100);
		System.out.println(LinkedListPriorityQueue);

		System.out.println("\nChecking further deletions:");
		System.out.println("Value being dequeued: " + LinkedListPriorityQueue.Dequeue());
		System.out.println(LinkedListPriorityQueue);
		System.out.println("Value being dequeued: " + LinkedListPriorityQueue.Dequeue());
		System.out.println(LinkedListPriorityQueue);
		System.out.println("Value being dequeued: " + LinkedListPriorityQueue.Dequeue());
		System.out.println(LinkedListPriorityQueue);
		System.out.println("Value being dequeued: " + LinkedListPriorityQueue.Dequeue());
		System.out.println(LinkedListPriorityQueue);
		System.out.println("Value being dequeued: " + LinkedListPriorityQueue.Dequeue());
		System.out.println(LinkedListPriorityQueue);
		System.out.println("Dequeuing empty queue (should give error): ");
		LinkedListPriorityQueue.Dequeue();
	}
}