public class Lab11LinkedList
{
	Lab11Node head;
	Lab11Node tail;

	public Lab11LinkedList()
	{
		head = null;
		tail = null;
	}

	public void insert(Lab11Vertex V)
	{
		Lab11Node N = new Lab11Node(V);
		if (find(V) == false)
		{
			if (head == null)
			{
				head = N;
				tail = N;
			}
			else
			{
				tail.next = N;
				tail = N;
			}
		}
		else
			System.out.println("ERROR: Relation to be added already exists");
	}

	public void delete(Lab11Vertex V)
	{
		if (find(V) != false)
		{
			Lab11Node N = head;
			Lab11Node Tracker = head;
			while (N.v.name != V.name)
			{
				Tracker = N;
				N = N.next;
			}
			Tracker.next = N.next;
			if (N == head)
				head = head.next;
			if (N == tail)
				tail = Tracker;
		}
		else
			System.out.println("ERROR: Relation to be deleted does not exist");
	}

	public boolean find(Lab11Vertex V)
	{
		Lab11Node N = head;
		while (N != null)
		{
			if (N.v.name == V.name)
				return true;
			N = N.next;
		}
		return false;
	}

	public String toString()
	{
		Lab11Node N = head;
		String s = "";
		if (N == null)
			s = s + "null";
		while (N != null)
		{
			s = s + N.v.name + " ";
			N = N.next;
		}
		return s;
	}
}