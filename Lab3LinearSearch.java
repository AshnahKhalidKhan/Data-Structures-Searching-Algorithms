//ASHNAH KHALID KHAN ERP # 22889

public class Lab3LinearSearch
{
	public static void main(String[] args)
	{
		System.out.println("LINEAR SEARCH ALGORITHMS:\n");

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
		
		System.out.println("The index where number 11 exists in array is: Array[" + linearSearch(Array, 11) + "] = " + Array[linearSearch(Array, 11)]);
		System.out.print("Time taken: ");
		Long startTime = System.nanoTime();
		linearSearch(Array, 11);
		Long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		System.out.println("Number of comparisons: " + NumberOfComparisons);
		resetComparisons();

		System.out.println("\nThe index where INVALID VALUE number 66000 exists in array is: Array[" + linearSearch(Array, 66000) + "] = 66000");
		System.out.print("Time taken: ");
		startTime = System.nanoTime();
		linearSearch(Array, 66000);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		System.out.println("Number of comparisons: " + NumberOfComparisons);
		resetComparisons();

		System.out.println("\nCHECKING RECURSIVELY:");
		System.out.println("The index where number 11 exists in array is: Array[" + linearSearchRecursive(Array, 11, 0) + "] = " + Array[linearSearchRecursive(Array, 11, 0)]);
		System.out.print("Time taken: ");
		startTime = System.nanoTime();
		linearSearchRecursive(Array, 11, 0);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		System.out.println("Number of function calls: " + NumberOfFunctionCalls);
		resetFunctionCalls();

		System.out.println("\nThe index where INVALID VALUE number 66000 exists in array is: Array[" + linearSearchRecursive(Array, 66000, 0) + "] = 66000");
		System.out.print("Time taken: ");
		startTime = System.nanoTime();
		linearSearchRecursive(Array, 66000, 0);
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

	public static int linearSearch(int[] Array, int NumberToBeSearched)
	{
		int Index = 0;
		NumberOfComparisons++;
		while (Index < Array.length && Array[Index] < NumberToBeSearched)
		{
			NumberOfComparisons++;
			Index++;
		}
		NumberOfComparisons++;
		if (Index < Array.length && Array[Index] == NumberToBeSearched)
			return Index;
		else
			return -1; //Invalid Index Number
	}

	public static int linearSearchRecursive(int[] Array, int NumberToBeSearched, int CheckStartIndex)
	{
		NumberOfFunctionCalls++;
		if (CheckStartIndex >= Array.length || NumberToBeSearched < Array[CheckStartIndex]) //Since array is sorted, if given number is less than the first number of array, then it doesn't exist in array
			return -1;
		else if (NumberToBeSearched == Array[CheckStartIndex]) //If last element of array is the number we are searhing for, return its index number
			return CheckStartIndex;
		return linearSearchRecursive(Array, NumberToBeSearched, CheckStartIndex + 1);
	}
}