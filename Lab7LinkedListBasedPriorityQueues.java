//ASHNAH KHALID KHAN ERP # 22889

public class Lab7LinkedListBasedPriorityQueues<Type extends Comparable<Type>>
{
	Lab7Node<Type> Front;
	Lab7Node<Type> Rear;

	public Lab7LinkedListBasedPriorityQueues()
	{
		Front = null;
		Rear = null;
	}

	//Insert using O(N) so deletion can be O(constant)
	//Ascending order from front to rear if shortest job removed first
	public void Enqueue(Type obj)
	{
		Lab7Node<Type> InsertionNode = new Lab7Node<Type>(obj);
		if (isEmpty() == true)
		{
			Front = InsertionNode;
			Rear = InsertionNode;
		}
		else if (obj.compareTo(Front.data) < 0)
		{
			InsertionNode.next = Front;
			Front = InsertionNode;
		}
		else if (obj.compareTo(Rear.data) >= 0) //obj is greater than or equal to rear value
		{
			Rear.next = InsertionNode;
			Rear = InsertionNode;
		}
		else
		{
			Lab7Node<Type> Tracker = Front;
			while (Tracker.next != null && obj.compareTo(Tracker.next.data) >= 0)
			{
				Tracker = Tracker.next;
			}
			if (obj.compareTo(Tracker.next.data) < 0) //obj is less than next node's data
			{
				InsertionNode.next = Tracker.next; //Insert after this node and before next node
				Tracker.next = InsertionNode;
			}
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