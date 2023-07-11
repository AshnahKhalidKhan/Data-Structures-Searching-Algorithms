public class Lab11Main
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("GRAPH USING ARRAY VERTICES AND LINKED LIST EDGES...");

		Lab11Graph G = new Lab11Graph(4);

		System.out.println(G + "\nAdding Vertices:");

		G.AddVertex("Person1", 99);
		G.AddVertex("Person2", 33);
		G.AddVertex("Person3", 42);
		G.AddVertex("Person4", 15);
		System.out.println(G);
		G.AddVertex("Person5", 50); //List already full case; should give error

		System.out.println("\nAdding Edges:");
		G.AddEdge("Person1", "Person4");
		G.AddEdge("Person3", "Person1");
		System.out.println(G);
		G.AddEdge("Person1", "Person1"); //SelfLoop Case; should give error once
		System.out.println("\n" + G);
		G.AddEdge("Person5", "Person1"); //Invalid Case; should give error twice
		System.out.println();
		G.AddEdge("Person4", "Person1"); //Repeated relation case; should give error twice

		System.out.println("\nDeleting Vertices:");
		G.DeleteVertex("Person3"); //Should delete vertex, shift further vertices backward, and delete relations with other vertices
		System.out.println(G);
		G.DeleteVertex("Person5"); //Invalid case; should give error

		/*Reinserting deleted vertices and edges to check other functions*/G.AddVertex("Person3", 42);G.AddEdge("Person3", "Person1");System.out.println("\n" + G);

		System.out.println("\nDeleting Edges:");
		G.DeleteEdge("Person1", "Person1"); //SelfLoop Case; should give error once
		System.out.println("\n" + G);
		G.DeleteEdge("Person2", "Person1"); //Invalid case; should give error twice

		System.out.println("\nFinding Vertices:");
		System.out.println("Finding vertex Person4:\n" + G.FindVertex("Person4"));
		System.out.println("Finding vertex Person5:\n" + G.FindVertex("Person5")); //Invalid case; should return NULL

		System.out.println("\nChecking DFS:");
		System.out.println("Source vertex Person1:");
		G.DFS(G, G.FindVertex("Person1"));
		System.out.println("Source vertex Person2:");
		G.DFS(G, G.FindVertex("Person2"));
		System.out.println("Source vertex Person3:");
		G.DFS(G, G.FindVertex("Person3"));
		System.out.println("Source vertex Person4:");
		G.DFS(G, G.FindVertex("Person4"));
		System.out.println("Source vertex Person5:");
		G.DFS(G, G.FindVertex("Person5")); //Invalid case; should give error
	}
}