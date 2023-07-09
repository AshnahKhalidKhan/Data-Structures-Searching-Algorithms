public class Lab8BinarySearchTree<Type extends Comparable<Type>>
{
	Lab8BinaryNode<Type> root;

	public Lab8BinarySearchTree()
	{
		root = null;
	}

	public void insert(Type key)
	{
		Lab8BinaryNode<Type> InsertionNode = new Lab8BinaryNode(key);
		if (root == null)
			root = InsertionNode;
		else
		{
			Lab8BinaryNode<Type> Tracker = root;
			Lab8BinaryNode<Type> Previous = root;
			while (Tracker != null)
			{
				if (key.compareTo(Tracker.data) < 0)
				{
					Previous = Tracker;
					Tracker = Tracker.left;
				}
				else
				{
					Previous = Tracker;
					Tracker = Tracker.right;
				}
			}
			if (key.compareTo(Previous.data) < 0)
				Previous.left = InsertionNode;
			else
				Previous.right = InsertionNode;
		}
	}

	public void LNR(Lab8BinaryNode N) //recursive
	{
		if (N == null)
			return;
		else //if (N != null)
		{
			LNR(N.left);
			System.out.println(N.data);
			LNR(N.right);
		}
	}

	public Lab8BinaryNode find(Type key)
	{
		if (root == null)
			return null;
		else if (root.data == key)
			return root;
		else
		{
			Lab8BinaryNode<Type> Tracker = root;
			while (Tracker != null)
			{
				if (key.compareTo(Tracker.data) == 0)
					return Tracker;
				else if (key.compareTo(Tracker.data) < 0)
					Tracker = Tracker.left;
				else
					Tracker = Tracker.right;
			}
			return Tracker;
		}
	}

	public Lab8BinaryNode Minimum()
	{
		Lab8BinaryNode<Type> Tracker = root;
		while (Tracker.left != null)
		{
			Tracker = Tracker.left;
		}
		return Tracker;
	}

	public Lab8BinaryNode Maximum()
	{
		Lab8BinaryNode<Type> Tracker = root;
		while (Tracker.right != null)
		{
			Tracker = Tracker.right;
		}
		return Tracker;
	}
}