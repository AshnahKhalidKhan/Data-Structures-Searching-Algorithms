//ASHNAH KHALID KHAN ERP # 22889

public class Lab6LinkedListBasedStack<Type extends Comparable<Type>>
{
	Lab6StackNode<Type> top;

	public Lab6LinkedListBasedStack()
	{
		top = null;
	}

	public void PUSH(Type c)
	{
		Lab6StackNode<Type> InsertionNode = new Lab6StackNode<Type>(c);
		if (top == null)
		{
			top = InsertionNode;
		}
		else
		{
			InsertionNode.next = top;
			top = InsertionNode;
		}
	}

	public Type POP()
	{
		Type PoppedNode = top.info;
		top = top.next;
		return PoppedNode;
		
	}

	public Type PEEK()
	{
		return top.info;
	}

	public boolean isEmpty()
	{
		if (top == null)
			return true;
		return false;
	}
}