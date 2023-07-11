public class Lab12Sorting
{
	int NumOfComparisons;
	int NumOfSwaps;

	public Lab12Sorting()
	{
	}

	public void QuickSort(int[] arr, int L, int U)
	{
		int m = Partition(arr, L, U);
		if (m - 1 > L)
			QuickSort(arr, L, m - 1);
		if (m + 1 < U)
			QuickSort(arr, m + 1, U);
	}

	public int Partition(int[] arr, int L, int U)
	{
		int pivot = L;
		int temp;
		while (L < U)
		{
			NumOfComparisons++;
			while (L <= U && arr[L] <= arr[pivot])
			{
				NumOfComparisons++;
				L++;
			}
			NumOfComparisons++;
			while (L <= U && arr[U] > arr[pivot])
			{
				NumOfComparisons++;
				U--;
			}
			if (L < U)
			{
				NumOfSwaps++;
				temp = arr[U];
				arr[U] = arr[L];
				arr[L] = temp;
			}
		}
		NumOfSwaps++;
		temp = arr[pivot];
		arr[pivot] = arr[U];
		arr[U] = temp;
		return U;
	}

	public void getStats()
	{
		System.out.println("Number of comparisons: " + NumOfComparisons);
		System.out.println("Number of swaps: " + NumOfSwaps);
	}
}