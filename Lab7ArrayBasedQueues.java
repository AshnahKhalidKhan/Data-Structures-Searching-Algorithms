//ASHNAH KHALID KHAN ERP # 22889

public class Lab7ArrayBasedQueues<Type>
{
	Type[] Q;
	int F; //front
	int R; //rear

	public Lab7ArrayBasedQueues()
	{
		Q = (Type[]) new Object[10];
		F = 0;
		R = 0;
	}

	public Lab7ArrayBasedQueues(int size)
	{
		Q = (Type[]) new Object[size];
		F = 0;
		R = 0;
	}

	public void Enqueue(Type obj) //ALWAYS insert at rear
	{
		if (isFull() == true)
		{
			System.out.println("ERROR: Queue is full");
		}
		else
		{
			R = (R + 1) % (Q.length);
			Q[R] = obj;
		}
	}

	public Type Dequeue() //ALWAYS remove from front (FIFO structure)
	{
		if (isEmpty() == true)
		{
			System.out.println("ERROR: Queue is empty");
			return null;
		}
		else
		{
			F = (F + 1) % Q.length;
			Type ValueBeingDequeued = Q[F];
			Q[F] = null;
			return ValueBeingDequeued;
		}
	}

	public boolean isEmpty()
	{
		if (F == R)
			return true;
		return false;
	}

	public boolean isFull()
	{
		if ((R + 1) % Q.length == F)
			return true;
		return false;
	}

	public void printQ()
	{
		String s = "";
		for (int i = 0; i < Q.length; i++)
		{
			if (i == F)
				s = s + "(F)";
			if (i == R)
				s = s + "(R)";
			if (Q[i] == null)
				s = s + "null | ";
			else
				s = s + Q[i] + " | ";
		}
		System.out.println(s);
	}
}