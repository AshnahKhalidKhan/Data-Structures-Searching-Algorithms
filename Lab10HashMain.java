import java.util.*;

public class Lab10HashMain
{
	public static void main(String[] args)
	{
		Lab10HashTableLinear H = new Lab10HashTableLinear(100);
		Lab10HashTableQuadratic HQ = new Lab10HashTableQuadratic(100);

		//Hardcoding in order to check search function later
		H.insert(999);
		HQ.insert(999);

		System.out.println("Generating & inserting random digits:");
		Random R = new Random();
		int RandomNum = 0;
		for (int i = 0; i < 100; i++)
		{
			RandomNum = R.nextInt(900) + 100;	//3 digit random number
			System.out.println("\nInserting " + RandomNum + ":");
			H.insert(RandomNum);
			HQ.insert(RandomNum);
		}

		System.out.println("\nLINEAR PROBED HASHTABLE:\n" + H);

		System.out.println("Finding values in linear probed hash table:");
		System.out.println("Find 999 (should be true): " + H.search(999));
		System.out.println("Find 89 (Invalid value) : " + H.search(89));

		System.out.println("\nQUADRATIC PROBED HASHTABLE:\n" + HQ);

		System.out.println("Finding values in quadratic probed hash table:");
		System.out.println("Find 999 (should be true): " + HQ.search(999));
		System.out.println("Find 89 (Invalid value) : " + HQ.search(89));

		System.out.println("\nLinear Hash Table Stats:");
		System.out.println("Table size: " + H.Table.length);
		System.out.println("Number of Occupied Cells (2/3rd of table size is " + (2.0/3.0)*H.Table.length + " ): " + H.numOfOccupiedCells);
		System.out.println("Number of Collisions: " + + H.numOfCollisions);

		System.out.println("\nQuadratic Hash Table Stats:");
		System.out.println("Table size: " + HQ.Table.length);
		System.out.println("Number of Occupied Cells (2/3rd of table size is " + (2.0/3.0)*HQ.Table.length + " ): " + HQ.numOfOccupiedCells);
		System.out.println("Number of Collisions: " + + HQ.numOfCollisions);
	}
}