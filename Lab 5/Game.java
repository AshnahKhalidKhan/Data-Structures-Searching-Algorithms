//ASHNAH KHALID KHAN ERP # 22889

import java.util.*;

public class Game
{
	node head;

	Game() //Constructor
	{
		head = null;
	}

	public void insert(String player)
	{
		//Two cases catered:
		//If list is empty
		//If want to insert at end of list

		node InsertionNode = new node(player);
		if (head == null)
		{
			head = InsertionNode;
			head.next = head;
		}
		else
		{
			node TrackerNode = head;
			while (TrackerNode.next != head)
			{
				TrackerNode = TrackerNode.next;
			}
			TrackerNode.next = InsertionNode;
			InsertionNode.next = head;
		}
	}

	public String playGame()
	{
		while(head.next != head)
		{
			System.out.println("\nCurrent state of list: " + toString());
			int R = (int)(Math.random()*10) * (int)(Math.random()*10);
			System.out.println("Random Number used: " + R);
			int counter = 2;
			node NodeBeforeTrackerNode = head;
			node TrackerNode = head.next;
			while (counter != R)
			{
				NodeBeforeTrackerNode = TrackerNode;
				TrackerNode = TrackerNode.next;
				counter++;
			}
			System.out.println("Node that will be removed: " + TrackerNode.name + "\n");
			delete(NodeBeforeTrackerNode, TrackerNode);
		}
		return head.name;
	}

	public void delete(node prev, node temp)
	{
		//Catered cases:
		//If deleting head (remove head, update overall head)
		//Normal delete

		prev.next = temp.next; //Do this for every node
		if (temp == head) //Current node is head, update list head
		{
			head = temp.next;
		}
	}

	public String toString()
	{
		String s = "";
		if (head == null) //If list is empty
			return s;
		else if (head.next == head) //If list has only one node
		{
			return head.name;
		}
		else
		{
			s = s + head.name + ", ";
			node TrackerNode = head.next;
			while (TrackerNode != head)
			{
				s = s + TrackerNode.name;
				if (TrackerNode.next != head)
					s = s + ", ";
				TrackerNode = TrackerNode.next;
			}
		}
		return s;
	}
}