public class Lab11Graph
{
	Lab11Vertex[] adjList;
	int count;

	public Lab11Graph(int s)
	{
		adjList = new Lab11Vertex[s];
		count = 0;
	}

	public void AddVertex(String n, int a)
	{
		if (count < adjList.length)
		{
			Lab11Vertex V = new Lab11Vertex(n, a);
			adjList[count] = V;
			count++;
		}
		else
			System.out.println("ERROR: List of vertices is already full");
	}

	public void AddEdge(String VERTEX, String EDGE)
	{
		//Since graph is undirected so we make two-way connection
		Lab11Vertex V = null;
		Lab11Vertex E = null;
		for (int i = 0; i < adjList.length; i++)
		{
			if (adjList[i] != null && adjList[i].name == VERTEX)
				V = adjList[i];
			if (adjList[i] != null && adjList[i].name == EDGE)
				E = adjList[i];
		}
		if (V == null || E == null)
			System.out.println("ERROR: Vertex does not exist in graph");
		else
		{
			V.insert(E);
			E.insert(V);
		}
	}

	public void DeleteVertex(String VERTEX)
	{
		//Since graph is undirected so we make two-way connection
		Lab11Vertex V = null;
		for (int i = 0; i < adjList.length; i++)
		{
			if (adjList[i] != null && adjList[i].name == VERTEX)
			{
				V = adjList[i];
				adjList[i] = null;
				for (int c = i; c < adjList.length - 1; c++)
				{
					adjList[c] = adjList[c + 1];
					adjList[c + 1] = null;
				}
			}
		}
		if (V != null)
		{
			for (int i = 0; i < adjList.length; i++)
			{
				if (adjList[i] != null && adjList[i].find(V) == true)
					adjList[i].delete(V);
			}
			count--;
		}
		else
			System.out.println("ERROR: Graph does not contain given vertice to be deleted");
	}

	public void DeleteEdge(String VERTEX, String EDGE)
	{
		//Since graph is undirected so we make two-way connection
		Lab11Vertex V = null;
		Lab11Vertex E = null;
		for (int i = 0; i < adjList.length; i++)
		{
			if (adjList[i] != null && adjList[i].name == VERTEX)
				V = adjList[i];
			if (adjList[i] != null && adjList[i].name == EDGE)
				E = adjList[i];
		}
		if (V != null && E != null)
		{
			V.delete(E);
			E.delete(V);
		}
		else
			System.out.println("ERROR: Graph does not contain the given two-way relation to be deleted");
	}

	public Lab11Vertex FindVertex(String VERTEX)
	{
		for (int i = 0; i < adjList.length; i++)
		{
			if (adjList[i].name == VERTEX)
				return adjList[i];
		}
		return null;
	}

	public String toString()
	{
		String s = "";
		if (adjList == null)
			s = "null";
		else
		{
			for (int i = 0; i < adjList.length; i++)
			{
				s = s + adjList[i] + "\n";
			}
		}
		return s;
	}

	public void DFS(Lab11Graph G, Lab11Vertex s)
	{
		if (s == null)
		{
			System.out.println("ERROR: Source vertex does not exist in graph");
			return;
		}
		Lab11Stack S = new Lab11Stack(G.adjList.length);
		Lab11Vertex[] Visited = new Lab11Vertex[G.adjList.length];
		S.PUSH(s);
		int i = 0;
		Visited[i] = s;
		String DFS = s.name;
		while (FindNextSourceVertex(G.adjList, Visited) != null)
		{
			while (S.isEmpty() == false)
			{
				Lab11Vertex v = S.PEEK();
				Lab11Vertex notvisited = this.FindNotVisited(v, Visited);
				if (notvisited != null)
				{
					S.PUSH(notvisited);
					i++;
					Visited[i] = notvisited;
					DFS = DFS + " " + notvisited.name;
				}
				else
					S.POP();
			}
			//For traversing disconnected components
			s = FindNextSourceVertex(G.adjList, Visited);
			if (s != null)
			{
				S.PUSH(s);
				i++;
				Visited[i] = s;
				DFS = DFS + " " + s.name;
			}
		}
		System.out.println(DFS);
	}

	private Lab11Vertex FindNotVisited(Lab11Vertex V,Lab11Vertex[] Visited)
	{
		Lab11Node Tracker = V.friendsList.head;
		while (Tracker != null)
		{
			boolean hasVisited = false;
			for (int i = 0; i < Visited.length; i++)
			{
				if (Visited[i] == Tracker.v)
				{
					hasVisited = true;
					break;
				}
			}
			if (hasVisited == false)
				return Tracker.v;
			else
				Tracker = Tracker.next;
		}
		return null;
	}

	private Lab11Vertex FindNextSourceVertex(Lab11Vertex[] Vertices, Lab11Vertex[] Visited)
	{
		Lab11Vertex s = null;
		boolean visited = false;
		for (int i = 0; i < Vertices.length; i++)
		{
			visited = false;
			s = Vertices[i];
			for (int c = 0; c < Visited.length; c++)
			{
				if (Vertices[i] == Visited[c])
				{
					visited = true;
					break;
				}
			}
			if (visited == false)
				return s;
		}
		if (visited == true)
			return null;
		return s;
	}
}