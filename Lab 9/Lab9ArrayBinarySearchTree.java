public class Lab9ArrayBinarySearchTree<Type extends Comparable<Type>>
{
	Type[] tree;

	public Lab9ArrayBinarySearchTree(int size)
	{
		tree = (Type[]) new Comparable[size];
	}

	public void insert(Type d)
	{
		int P = 0;
		while (P < tree.length && tree[P] != null)
		{
			if (d.compareTo(tree[P]) < 0)
				P = 2*P + 1;
			else
				P = 2*P + 2;
		}
		//Loop breaks if tree[P] != null OR P >= tree.length
		if (P < tree.length)
			tree[P] = d;
		else
			System.out.println("Tree is full!");
	}

	public void find(Type d)
	{
		int P = 0;
		while (P < tree.length && tree[P] != null && tree[P].compareTo(d) != 0)
		{
			if (d.compareTo(tree[P]) < 0)
				P = 2*P + 1;
			else
				P = 2*P + 2;
		}
		if (P < tree.length && tree[P].compareTo(d) == 0)
			System.out.println("Value " + tree[P] + " found!");
		else
			System.out.println("Tree has no such value!");
	}

	public void delete(Type d)
	{
		int P = 0;
		while (P < tree.length && tree[P] != null && tree[P].compareTo(d) != 0)
		{
			if (d.compareTo(tree[P]) < 0)
				P = 2*P + 1;
			else
				P = 2*P + 2;
		}
		if (P < tree.length && tree[P] != null && tree[P].compareTo(d) == 0)
		{
			System.out.println("Value " + tree[P] + " deleted!");
			if (P == tree.length - 1 || 2*P + 1 >= tree.length || 2*P + 2 >= tree.length)
				this.deleteNoChild(P);
			else if (tree[2*P + 1] == null && tree[2*P + 2] == null)
				this.deleteNoChild(P);
			else if ( (tree[2*P + 1] == null && tree[2*P + 2] != null) || (tree[2*P + 1] != null && tree[2*P + 2] == null) )
				this.deleteOneChild(P);
			else
				this.deleteTwoChild(P);
		}
		else
			System.out.println("Tree has no such value!");
	}

	public void deleteNoChild(int P)
	{
		tree[P] = null;
	}

	public void deleteOneChild(int P)
	{
		int Child = 0;

		if (tree[2*P + 1] != null) //If node-to-be-deleted has left child
		{
			tree[P] = tree[2*P + 1];
			Child = 2*P + 1;	
		}
		else if (tree[2*P + 2] != null) //If node-to-be-deleted has right child
		{
			tree[P] = tree[2*P + 2];
			Child = 2*P + 2;
		}

		if (Child == tree.length - 1 || 2*Child + 1 >= tree.length || 2*Child + 2 >= tree.length)
			this.deleteNoChild(Child);
		else if (tree[2*Child + 1] == null && tree[2*Child + 2] == null)
			this.deleteNoChild(Child);
		else if ( (tree[2*Child + 1] == null && tree[2*Child + 2] != null) || (tree[2*Child + 1] != null && tree[2*Child + 2] == null) )
			this.deleteOneChild(Child);
		else
			this.deleteONECHILDSTwoChild(P);
	}

	public void deleteTwoChild(int P)
	{
		int Min = 2*P + 2;
		while (Min < tree.length && 2*Min + 1 < tree.length && tree[2*Min + 1] != null)
		{
			Min = 2*Min + 1;
		}
		//Minimum located
		if ( (2*Min + 1 < tree.length && tree[2*Min + 1] == null) || 2*Min + 1 >= tree.length)
		{
			tree[P] = tree[Min];
			if (Min == tree.length - 1 || 2*Min + 1 >= tree.length || 2*Min + 2 >= tree.length)
				this.deleteNoChild(Min);
			else if (tree[2*Min + 1] == null && tree[2*Min + 2] == null)
				this.deleteNoChild(Min);
			else if ( (tree[2*Min + 1] == null && tree[2*Min + 2] != null) || (tree[2*Min + 1] != null && tree[2*Min + 2] == null) )
				this.deleteOneChild(Min);
		}
	}

	public void deleteONECHILDSTwoChild(int P)
	{
		if (tree[2*P + 2] == tree[P])
		{
			int Min = 2*P + 2;
			while (Min < tree.length && 2*Min + 1 < tree.length && tree[2*Min + 1] != null)
			{
				Min = 2*Min + 1;
			}
			//Minimum located
			if ( (2*Min + 1 < tree.length && tree[2*Min + 1] == null) || 2*Min + 1 >= tree.length)
			{
				tree[P] = tree[Min];
				if (Min == tree.length - 1 || 2*Min + 1 >= tree.length || 2*Min + 2 >= tree.length)
					this.deleteNoChild(Min);
				else if (tree[2*Min + 1] == null && tree[2*Min + 2] == null)
					this.deleteNoChild(Min);
				else if ( (tree[2*Min + 1] == null && tree[2*Min + 2] != null) || (tree[2*Min + 1] != null && tree[2*Min + 2] == null) )
					this.deleteOneChild(Min);
			}
		}
		else if (tree[2*P + 1] == tree[P])
		{
			int Max = 2*P + 1;
			while (Max < tree.length && 2*Max + 2 < tree.length && tree[2*Max + 2] != null)
			{
				Max = 2*Max + 2;
			}
			//Maximum located
			if ( (2*Max + 2 < tree.length && tree[2*Max + 2] == null) || 2*Max + 2 >= tree.length )
			{
				tree[P] = tree[Max];
				if (Max == tree.length - 1 || 2*Max + 1 >= tree.length || 2*Max + 1 >= tree.length)
					this.deleteNoChild(Max);
				else if (tree[2*Max + 1] == null && tree[2*Max + 2] == null)
					this.deleteNoChild(Max);
				else if ( (tree[2*Max + 1] == null && tree[2*Max + 2] != null) || (tree[2*Max + 1] != null && tree[2*Max + 2] == null) )
					this.deleteOneChild(Max);
				
			}
		}
	}

	public void traverse()
	{
		for (int i = 0; i < tree.length; i++)
		{
			if (tree[i] == null)
				System.out.print(" null ");
			else
				System.out.print(" " + tree[i] + " ");		
		}
		System.out.println();
	}

	//NOTE: Alternative traverse method:
	public void traverseLNR(int index)
	{
		if (index < tree.length && tree[index] == null)
			return;
		else if (index < tree.length)
		{
			traverseLNR(2*index + 1);	//left child
			System.out.println(tree[index] + " ");
			traverseLNR(2*index + 2);	//right child
		}
	}
}