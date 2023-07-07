//ASHNAH KHALID KHAN ERP # 22889

public class Lab4GenericLinkedList<Type extends Comparable<Type>>
{
	Lab4GenericNode<Type> head;

	Lab4GenericLinkedList() //Constructor
	{
		head = null;
	}

	//O(N)
	public void insertInOrder(Type DATA) //In ASCENDING order
	{
		Lab4GenericNode<Type> InsertionNode = new Lab4GenericNode<Type>(DATA);
		if (head == null) //Insert at beginning of list when list is empty list
		{
			head = InsertionNode;
		}
		else if (head.data.compareTo(DATA) > 0) //Insert at beginning of list when head data is less than given data
		{
			InsertionNode.next = head;
			head = InsertionNode;
		}
		else
		{
			Lab4GenericNode<Type> TrackerNode = head;
			while (TrackerNode.next != null && TrackerNode.next.data.compareTo(DATA) < 0) //Checking that next node exists and next node's value is less than given value
			{
				TrackerNode = TrackerNode.next;
			}
			//Loop breaks when either next node is empty or next node's value is greater than given value
			if (TrackerNode.next == null) //Insert at end of list (after last node) i.e. next node is empty
			{
				if (TrackerNode.data.compareTo(DATA) < 0)
					TrackerNode.next = InsertionNode;
				else //means if TrackerNode.data.compareTo(DATA) > 0
				{
					InsertionNode.next = TrackerNode;
					TrackerNode.next = InsertionNode;
				}
			}
			else if (TrackerNode.data.compareTo(DATA) < 0 && TrackerNode.next.data.compareTo(DATA) >= 0) //Insert at any desired place i.e. current node's value is greater than given value (so insert before current node and next node)
			{
				InsertionNode.next = TrackerNode.next;
				TrackerNode.next = InsertionNode;
				
			}
		}
	}

	//O(N)
	public boolean find(Type DATA)
	{
		//30, 40, 40, 80, 100, 200
		Lab4GenericNode<Type> TrackerNode = head;
		while (TrackerNode.next != null && TrackerNode.data.compareTo(DATA) != 0) //Checking that next node exists and next node's value is not equal to given value
		{
			TrackerNode = TrackerNode.next;
		}
		//Loop breaks if either match is found or value is not found in whole list
		if (TrackerNode.next == null && TrackerNode.data.compareTo(DATA) != 0) //Value is not found so reached end of list
			return false;
		return true; //This means TrackerNode.data == DATA (Match is found)
	}

	//O(constant)
	public void clear()
	{
		head = null;
	}

	//O(constant)
	public boolean isEmpty()
	{
		if (head == null ) //Check next node doesn't exist and head is unfilled with any value.
			return true;
		return false;
	}

	//O(N)
	public int length()
	{
		if (isEmpty() == true)
			return 0;
		Lab4GenericNode<Type> TrackerNode = head;
		int count = 1; //Cause while will end at N + 1 if using TrackerNode.next
		while (TrackerNode.next != null)
		{
			count++;
			TrackerNode = TrackerNode.next;
		}
		return count;
	}

	//O(N)
	public void remove(Type DATA)
	{
		if (find(DATA) == true)
		{
			if (head.data.compareTo(DATA) == 0) //Check if first node matches given value
			{
				head = head.next;
			}
			else
			{
				Lab4GenericNode<Type> TrackerNode = head;
				Lab4GenericNode<Type> NodeBehindTrackerNode = head;
				while (TrackerNode.next != null && TrackerNode.data.compareTo(DATA) != 0) //Checking that next node exists and current node's value is not equal to given value
				{
					NodeBehindTrackerNode = TrackerNode;
					TrackerNode = TrackerNode.next;
				}
				//Loop breaks only if match is found since we've already checked for does-not-exist-in-list case using find(DATA) method OR if we've reached end of list
				if (TrackerNode.data.compareTo(DATA) == 0)
				{
					NodeBehindTrackerNode.next = TrackerNode.next; //Bypassing node that matches given value; if end of list is reached so TrackerNode.next will be equal to null so end of list case catered
				}
			}
		}
	}

	//O(N)
	public void addAll(Lab4GenericLinkedList NEWLIST)
	{
		if (isEmpty() == false)
		{
			Lab4GenericNode<Type> TrackerNode = head;
			while (TrackerNode.next != null)
			{
				TrackerNode = TrackerNode.next;
			}
			//Loop breaks when TrackerNode equals the last node of the list
			TrackerNode.next = NEWLIST.head;
		}
		else
		{
			head = NEWLIST.head;
		}
	}

	//O(N)
	public void reverse()
	{
		// (head)1 --> 2 --> 3 --> 4 --> null

		// (head)1 --> (Temporary)2 --> 3 --> 4 --> null

		// (head)1 --> (Temporary)2 --> (NodeAfterTemporary)3 --> 4 --> 5 --> null

		// (head)1 <--> (Temporary)2    (NodeAfterTemporary)3 --> 4 --> 5 --> null

		// null <-- (head)1 <-- (Temporary)2    (NodeAfterTemporary)3 --> 4 --> 5 --> null

		// null <-- 1 <-- (head)(Temporary)2    (NodeAfterTemporary)3 --> 4 --> 5 --> null

		// null <-- 1 <-- (head)2    (Temporary)(NodeAfterTemporary)3 --> 4 --> 5 --> null

		// null <-- 1 <-- (head)2    (Temporary)3 --> (NodeAfterTemporary)4 --> 5 --> null

		// null <-- 1 <-- (head)2 <-- (Temporary)3     (NodeAfterTemporary)4 --> 5 --> null

		// null <-- 1 <-- 2 <-- (head)(Temporary)3     (NodeAfterTemporary)4 --> 5 --> null

		// null <-- 1 <-- 2 <-- (head)3     (Temporary)(NodeAfterTemporary)4 --> 5 --> null

		// null <-- 1 <-- 2 <-- (head)3     (Temporary)4 --> (NodeAfterTemporary)5 --> null

		// null <-- 1 <-- 2 <-- (head)3 <-- (Temporary)4     (NodeAfterTemporary)5 --> null

		// null <-- 1 <-- 2 <-- 3 <-- (head)(Temporary)4     (NodeAfterTemporary)5 --> null

		// null <-- 1 <-- 2 <-- 3 <-- (head)4     (Temporary)(NodeAfterTemporary)5 --> null

		// null <-- 1 <-- 2 <-- 3 <-- (head)4     (Temporary)5 --> (NodeAfterTemporary)null

		// null <-- 1 <-- 2 <-- 3 <-- (head)4 <-- (Temporary)5     (NodeAfterTemporary)null

		// null <-- 1 <-- 2 <-- 3 <-- 4 <-- (head)(Temporary)5     (NodeAfterTemporary)null

		// null <-- 1 <-- 2 <-- 3 <-- 4 <-- (head)5

		Lab4GenericNode<Type> Temporary = head.next;
		Lab4GenericNode<Type> NodeAfterTemporary = Temporary.next; //head.next.next
		Temporary.next = head;
		head.next = null;
		head = Temporary;
		Temporary = NodeAfterTemporary;
		NodeAfterTemporary = NodeAfterTemporary.next;
		while (NodeAfterTemporary != null)
		{
			Temporary.next = head;
			head = Temporary;
			Temporary = NodeAfterTemporary;
			NodeAfterTemporary = NodeAfterTemporary.next;
		}
		Temporary.next = head;
		head = Temporary;
	}

	//O(N)
	public String toString()
	{
		String s = "";
		Lab4GenericNode<Type> TrackerNode = head;
		while (TrackerNode != null)
		{
			s = s + TrackerNode.data;
			if (TrackerNode.next != null)
			{
				 s = s + ", ";
			}
			TrackerNode = TrackerNode.next;
		}
		return s;
	}
}