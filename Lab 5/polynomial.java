//ASHNAH KHALID KHAN ERP # 22889

public class polynomial
{
	Node head;

	polynomial()
	{
		head = null;
	}

	public void insert(int c, int p)
	{
		//Catered case:
		//If list is empty
		//Must be in sorted order
		//If insert before head
		//If insert at end

		Node InsertionNode = new Node(c, p);
		if (head == null)
		{
			head = InsertionNode;
		}
		else
		{
			Node TrackerNode = head;
			while (TrackerNode.next != null && TrackerNode.power > InsertionNode.power)
			{
				TrackerNode = TrackerNode.next;
			}
			if (TrackerNode == head && InsertionNode.power > head.power) //Insert before head (then update head)
			{
				head.prev = InsertionNode;
				InsertionNode.next = head;
				head = InsertionNode;
			}
			else if (TrackerNode.next == null && TrackerNode.power > InsertionNode.power) //Insert after last node
			{
				TrackerNode.next = InsertionNode;
				InsertionNode.prev = TrackerNode;
			}
			else if (TrackerNode.next != null && TrackerNode.power > InsertionNode.power)
			{
				TrackerNode.prev.next = InsertionNode;
				InsertionNode.prev = TrackerNode.prev;
				InsertionNode.next = TrackerNode;
				TrackerNode.prev = InsertionNode;
				
			}
		}
	}

	public void addition(polynomial p1, polynomial p2)
	{
		//Approach:
		//First add to this polynomial all powers of p1 that are not present in p2
		//Then add to this polynomial all powers of p2 that are not present in p1
		//Then add all similar powers of p1 and p2 and insert their sum to this polynomial

		Node p1TrackerNode = p1.head;

		while (p1TrackerNode.next != null)
		{
			Node p2TraversalNode = p2.head;
			while (p2TraversalNode != null && p2TraversalNode.power != p1TrackerNode.power)
			{
				p2TraversalNode = p2TraversalNode.next;
			}
			if (p2TraversalNode == null) //End of p2 reached and same power term not found
				this.insert(p1TrackerNode.coefficient, p1TrackerNode.power);
			p1TrackerNode = p1TrackerNode.next;
		}

		Node p2TrackerNode = p2.head;

		while (p2TrackerNode.next != null)
		{
			Node p1TraversalNode = p1.head;
			while (p1TraversalNode != null && p1TraversalNode.power != p2TrackerNode.power)
			{
				p1TraversalNode = p1TraversalNode.next;
			}
			if (p1TraversalNode == null) //End of p1 reached and same power term not found
				this.insert(p2TrackerNode.coefficient, p2TrackerNode.power);
			p2TrackerNode = p2TrackerNode.next;
		}

		p1TrackerNode = p1.head;
		p2TrackerNode = p2.head;

		while (p1TrackerNode != null)
		{
			while (p2TrackerNode != null && p1TrackerNode.power != p2TrackerNode.power)
			{
				p2TrackerNode = p2TrackerNode.next;
			}
			if (p2TrackerNode != null && p1TrackerNode.power == p2TrackerNode.power)
			{
				this.insert(p1TrackerNode.coefficient + p2TrackerNode.coefficient, p1TrackerNode.power);
				p2TrackerNode = p2.head;
			}
			p1TrackerNode = p1TrackerNode.next;
		}
	}

	public void displayequation()
	{
		Node TrackerNode = head;
		System.out.println();
		while (TrackerNode != null)
		{
			if (TrackerNode.power == 0)
				System.out.print(TrackerNode.coefficient + " ");
			else
				System.out.print(TrackerNode.coefficient + "x^" + TrackerNode.power + " ");
			if (TrackerNode.next != null && TrackerNode.next.coefficient > 0) //If number is positive
				System.out.print("+ ");
			TrackerNode = TrackerNode.next;
		}
	}
}