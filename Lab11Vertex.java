public class Lab11Vertex
{
	String name;
	int age;
	Lab11LinkedList friendsList = new Lab11LinkedList();

	public Lab11Vertex(String NAME, int AGE)
	{
		name = NAME;
		age = AGE;
	}

	public void insert(Lab11Vertex V)
	{
		this.friendsList.insert(V);
	}

	public void delete(Lab11Vertex V)
	{
		this.friendsList.delete(V);
	}

	public boolean find(Lab11Vertex V)
	{
		return this.friendsList.find(V);
	}

	public String toString()
	{
		String s = "";
		if (name == null)
			s = "null";
		else
			s = s + this.name + ": " + this.friendsList;
		return s;
	}
}