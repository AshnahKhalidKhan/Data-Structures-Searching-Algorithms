public class Lab9BinarySearchTree<Type extends Comparable<Type>>
{
	Lab8BinaryNode<Type> root;

	public Lab9BinarySearchTree()
	{
		root = null;
	}

	public void delete(Type key)
	{
		Lab8BinaryNode[] ref = this.find(key);
		Lab8BinaryNode<Type> Parent = ref[0]; 
		Lab8BinaryNode<Type> Reference = ref[1]; 

		if (Reference == null)
			System.out.println("Tree contains no such value!");
		else if (Reference.left == null && Reference.right == null) //no child node case
			this.deleteNoChild(Reference, Parent);
		else if ((Reference.left == null && Reference.right != null) || (Reference.left != null && Reference.right == null)) //one child node case
				this.deleteOneChild(Reference, Parent);
		else
		{
			Lab8BinaryNode<Type> SubTreeMinimum = this.Minimum(Reference.right);
			Lab8BinaryNode<Type> SubTreeMinimumParent = Reference.right;
			while (SubTreeMinimumParent != null && SubTreeMinimumParent.left != null && SubTreeMinimumParent.left != SubTreeMinimum)
			{
				SubTreeMinimumParent = SubTreeMinimumParent.left;
			}
			if (SubTreeMinimumParent == SubTreeMinimum) //Meaning SubTreeMinimum == SubTreeMinimumParent == Reference.right
				SubTreeMinimumParent = Reference;

			Reference.data = SubTreeMinimum.data;

			if (SubTreeMinimum.left == null && SubTreeMinimum.right == null) //no child node case
				this.deleteNoChild(SubTreeMinimum, SubTreeMinimumParent);
			else if ((SubTreeMinimum.left == null && SubTreeMinimum.right != null) || (SubTreeMinimum.left != null && SubTreeMinimum.right == null))
				this.deleteOneChild(SubTreeMinimum, SubTreeMinimumParent);
		}
	}

	public void deleteNoChild(Lab8BinaryNode Reference, Lab8BinaryNode Parent)
	{
		if (Reference == root)
			root = null;
		else if (Parent.left == Reference)
			Parent.left = null;
		else if (Parent.right == Reference)
			Parent.right = null;
	}

	public void deleteOneChild(Lab8BinaryNode Reference, Lab8BinaryNode Parent)
	{
		if (Reference == root) //Deleting root with one child
		{
			if (root.right != null)
				root = root.right;
			else
				root = root.left;
		}
		else if (Parent != null && Reference.left == null && Reference.right != null)	//Node to be deleted has left child
		{
			if (Parent.right == Reference)	//Node to be deleted is parent's right node and has left child
				Parent.right = Reference.right;
			else
				Parent.left = Reference.right; //Node to be deleted is parent's left node and has left child
				
		}
		else if (Parent != null && Reference.left != null && Reference.right == null)
		{
			if (Parent.right == Reference)	//Node to be deleted is parent's right node and has right child
				Parent.right = Reference.left;
			else
				Parent.left = Reference.left;	//Node to be deleted is parent's left node and has right child
		}
	}

	public Lab8BinaryNode[] find(Type key)
	{
		Lab8BinaryNode[] ref = new Lab8BinaryNode[2];
		if (root == null)
		{
			ref[0] = null;
			ref[0] = null;
		}
		else if (root.data == key)
		{
			ref[0] = null;
			ref[1] = root;
		}
		else
		{
			Lab8BinaryNode<Type> Tracker = root;
			Lab8BinaryNode<Type> Previous = root;
			while (Tracker != null)
			{
				if (key.compareTo(Tracker.data) == 0)
				{
					ref[0] = Previous;
					ref[1] = Tracker;
					return ref;
				}
				else if (key.compareTo(Tracker.data) < 0)
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
		}
		return ref;
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

	public Lab8BinaryNode Minimum(Lab8BinaryNode N)
	{
		Lab8BinaryNode<Type> Tracker = N;
		while (Tracker.left != null)
		{
			Tracker = Tracker.left;
		}
		return Tracker;
	}

	public Lab8BinaryNode Maximum(Lab8BinaryNode N)
	{
		Lab8BinaryNode<Type> Tracker = N;
		while (Tracker.right != null)
		{
			Tracker = Tracker.right;
		}
		return Tracker;
	}
}