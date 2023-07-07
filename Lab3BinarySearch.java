//ASHNAH KHALID KHAN ERP # 22889

public class Lab3BinarySearch
{
	public static void main(String[] args)
	{
		System.out.println("BINARY SEARCH ALGORITHMS:\n");

		//RUN ALGORITHMS FOR DIFFERENT SIZES OF ARRAYS TO COMPARE COMPARISONS BY COMMENTING OUT EACH ONE AND LOGGING THEIR OUTPUTS RESPECTIVELY

		int[] Array = new int[10];
		for (int i = 0; i < 10; i++)
		{
			Array[i] = i*11;
		}

		/*
		int[] Array = new int[100];
		for (int i = 0; i < 100; i++)
		{
			Array[i] = i*11;
		}
		*/

		/*
		int[] Array = new int[1000];
		for (int i = 0; i < 1000; i++)
		{
			Array[i] = i*11;
		}
		*/

		/*
		int[] Array = new int[5000];
		for (int i = 0; i < 5000; i++)
		{
			Array[i] = i*11;
		}
		*/

		System.out.println("The index where number 11 exists in array is: Array[" + binarySearch(Array, 11) + "] = " + Array[binarySearch(Array, 11)]);
		System.out.print("Time taken: ");
		Long startTime = System.nanoTime();
		binarySearch(Array, 11);
		Long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		System.out.println("Number of comparisons: " + NumberOfComparisons);
		resetComparisons();

		System.out.println("\nThe index where INVALID VALUE number 66000 exists in array is: Array[" + binarySearch(Array, 66000) + "] = 66000");
		System.out.print("Time taken: ");
		startTime = System.nanoTime();
		binarySearch(Array, 66000);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		System.out.println("Number of comparisons: " + NumberOfComparisons);
		resetComparisons();
		
		System.out.println("\nCHECKING RECURSIVELY:");
		System.out.println("The index where number 11 exists in array is: Array[" + binarySearchRecursive(Array, 11, 0, Array.length - 1) + "] = " + Array[binarySearchRecursive(Array, 11, 0, Array.length - 1)]);
		System.out.print("Time taken: ");
		startTime = System.nanoTime();
		binarySearchRecursive(Array, 11, 0, Array.length - 1);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		System.out.println("Number of function calls: " + NumberOfFunctionCalls);
		resetFunctionCalls();

		System.out.println("\nThe index where INVALID VALUE number 66000 exists in array is: Array[" + binarySearchRecursive(Array, 66000, 0, Array.length - 1) + "] = 66000");
		System.out.print("Time taken: ");
		startTime = System.nanoTime();
		binarySearchRecursive(Array, 66000, 0, Array.length - 1);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		System.out.println("Number of function calls: " + NumberOfFunctionCalls);
		resetFunctionCalls();
	}

	public static int NumberOfComparisons = 0;
	public static int NumberOfFunctionCalls = 0;

	public static void resetComparisons()
	{
		NumberOfComparisons = 0;
	}

	public static void resetFunctionCalls()
	{
		NumberOfFunctionCalls = 0;
	}

	public static int binarySearch(int[] Array, int NumberToBeSearched)
	{
		int FirstIndex = 0;
		int LastIndex = Array.length - 1;
		int MidpointIndex = (FirstIndex + LastIndex) / 2;
		
		NumberOfComparisons++;
		while(FirstIndex < LastIndex)
		{
			NumberOfComparisons++; //For running of while loop again
			if (NumberToBeSearched < Array[MidpointIndex])
			{
				NumberOfComparisons++; //For
				LastIndex = MidpointIndex - 1;
			}
			else if (Array[MidpointIndex] == NumberToBeSearched)
			{
				NumberOfComparisons++;
				return MidpointIndex;
			}
			else
				FirstIndex = MidpointIndex + 1;
			MidpointIndex = (FirstIndex + LastIndex) / 2;
		}
		if (Array[MidpointIndex] == NumberToBeSearched)
			return MidpointIndex;
		else
			return -1;
	}

	public static int binarySearchRecursive(int[] Array, int NumberToBeSearched, int FirstIndex, int LastIndex) //Given FirstIndex must always be "0" and LastIndex must always be "Array.length - 1"
	{
		NumberOfFunctionCalls++;
		int MidpointIndex = (FirstIndex + LastIndex) / 2;
		if (FirstIndex > LastIndex)
			return -1;
		else if (NumberToBeSearched == Array[MidpointIndex])
			return MidpointIndex;
		else if (NumberToBeSearched < Array[MidpointIndex])
			return binarySearchRecursive(Array, NumberToBeSearched, FirstIndex, MidpointIndex - 1);
		return binarySearchRecursive(Array, NumberToBeSearched, MidpointIndex + 1, LastIndex);
	}
}