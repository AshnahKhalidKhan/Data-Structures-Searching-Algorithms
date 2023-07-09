//ASHNAH KHALID KHAN ERP # 22889

public class Lab7LinkedListBasedQueues<Type>
{
	Lab7Node<Type> Front;
	Lab7Node<Type> Rear;

	public Lab7LinkedListBasedQueues()
	{
		Front = null;
		Rear = null;
	}

	public void Enqueue(Type obj) //ALWAYS insert at rear
	{
		Lab7Node<Type> InsertionNode = new Lab7Node<Type>(obj);
		if (isEmpty() == true)
		{
			Front = InsertionNode;
			Rear = InsertionNode;
		}
		else
		{
			Rear.next = InsertionNode;
			Rear = InsertionNode;
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
			if (Front == Rear) //Only one node in queue
				Rear = null;
			Type ValueBeingDequeued = Front.data;
			Front = Front.next;
			return ValueBeingDequeued;
		}
	}

	public boolean isEmpty()
	{
		if (Front == null && Rear == null)
			return true;
		return false;
	}

	public String toString()
	{
		if (isEmpty() == true)
			return "List is empty";
		String s = "(Front)";
		Lab7Node<Type> Tracker = Front;
		while (Tracker.next != null)
		{
			s = s + Tracker + " ";
			Tracker = Tracker.next;
		}
		s = s + Tracker + "(Rear)";
		return s;
	}
}