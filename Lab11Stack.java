public class Lab11Stack
{
	Lab11Vertex[] stackList;
	int top;

	public Lab11Stack(int size)
	{
		stackList = new Lab11Vertex[size];
		top = -1;
	}

	public void PUSH(Lab11Vertex c)
	{
		if (isFull() == true)
		{
			Lab11Vertex[] NewStackList = new Lab11Vertex[stackList.length*2];
			for (int i = 0; i < stackList.length; i++)
			{
				NewStackList[i] = stackList[i];
			}
			stackList = NewStackList;
		}
		top++;
		stackList[top] = c;
	}

	public Lab11Vertex POP()
	{
		Lab11Vertex Holder = stackList[top];
		stackList[top] = null;
		top--;
		return Holder;
	}

	public Lab11Vertex PEEK()
	{
		return stackList[top];
	}

	public boolean isEmpty()
	{
		if (top == -1)
			return true;
		return false;
	}

	public boolean isFull()
	{
		if (top == stackList.length - 1)
			return true;
		return false;
	}
}