//ASHNAH KHALID KHAN ERP # 22889

public class Lab7ArrayBasedPriorityQueues<Type extends Comparable<Type>>
{
	Type[] Q;
	int F; //front

	public Lab7ArrayBasedPriorityQueues()
	{
		Q = (Type[]) new Comparable[10];
		F = -1;
	}

	public Lab7ArrayBasedPriorityQueues(int size)
	{
		Q = (Type[]) new Comparable[size];
		F = -1;
	}

	public void Enqueue(Type obj) //Insert in order so that insert takes O(N) while deletion can take O(constant)
	{
		if (isFull() == true)
		{
			System.out.println("ERROR: Queue is full");
		}
		else if (F == -1)
		{
			F++;
			Q[F] = obj;
		}
		else if (obj.compareTo(Q[F]) < 0) //Descending order; insert after last element
		{
			F++;
			Q[F] = obj;
		}
		else //Insert in middle or insert at first element
		{
			F++;
			Q[F] = obj;
			for (int i = F-1; i >= 0; i--)
			{
				if (obj.compareTo(Q[i]) >= 0) //Larger element(obj) goes at back
				{
					Type Swapper = Q[i];
					Q[i] = Q[i+1];
					Q[i+1] = Swapper;
				}
				else
					break;
			}
		}
	}

	public Type Dequeue() //ALWAYS remove from front (FIFO structure) which is last element in array
	{
		if (isEmpty() == true)
		{
			System.out.println("ERROR: Queue is empty");
			return null;
		}
		else
		{
			Type ValueBeingDequeued = Q[F];
			Q[F] = null;
			F--;
			return ValueBeingDequeued;
		}
	}

	public boolean isEmpty()
	{
		if (F == -1)
			return true;
		return false;
	}

	public boolean isFull()
	{
		if (F == Q.length - 1)
			return true;
		return false;
	}

	public String toString()
	{
		String s = "";
		for (int i = 0; i < Q.length; i++)
		{
			s = s + " | ";
			if (i == 0)
				s = s + "(R)";
			s = s + Q[i];
			if (i == F || (i == 0 && F = -1))
				s = s + "(F)";
		}
		return s;
	}
}