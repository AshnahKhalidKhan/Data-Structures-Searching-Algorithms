public class Lab12HeapSort
{
	int LastIndex;
	int[] array;

	public Lab12HeapSort(int[] arr)
	{
		this.buildMaxHeap(arr);
	}

	public void buildMaxHeap(int[] arr)
	{
		LastIndex = arr.length - 1;
		int c = 1;
		int p;
		while (c < arr.length)
		{
			p = (c - 1)/2;
			while (p >= 0)
			{
				if (arr[c] > arr[p])
				{
					int temp = arr[p];
					arr[p] = arr[c];
					arr[c] = temp;
					c = p;
					p = (c - 1)/2;
				}
				else
					break;
			}
			c++;
		}
		array = arr;
	}

	public void ReHeap(int[] arr)
	{
		int Parent = 0;
		int LeftChild;
		int RightChild;
		int temp;
		while (Parent >= 0 && Parent <= LastIndex)
		{
			LeftChild = (2*Parent) + 1;
			RightChild = (2*Parent) + 2;
			if ( (LeftChild <= LastIndex && RightChild > LastIndex && arr[Parent] < arr[LeftChild]) || (LeftChild <= LastIndex && RightChild <= LastIndex && arr[LeftChild] >= arr[RightChild] && arr[Parent] < arr[LeftChild]) )
			{
				temp = arr[Parent];
				arr[Parent] = arr[LeftChild];
				arr[LeftChild] = temp;
				Parent = LeftChild;
				LeftChild = (2*Parent) + 1;
				RightChild = (2*Parent) + 2;
			}
			else if ( (RightChild <= LastIndex && LeftChild > LastIndex && arr[Parent] < arr[RightChild]) || (RightChild <= LastIndex && LeftChild <= LastIndex && arr[RightChild] > arr[LeftChild] && arr[Parent] < arr[RightChild]) )
			{
				temp = arr[Parent];
				arr[Parent] = arr[RightChild];
				arr[RightChild] = temp;
				Parent = RightChild;
				LeftChild = (2*Parent) + 1;
				RightChild = (2*Parent) + 2;
			}
			else
				Parent++;
		}
	}

	public void delete()
	{
		if (LastIndex >= 0)
		{
			array[0] = array[LastIndex];
			array[LastIndex] = 0;
			LastIndex--;
			ReHeap(array);
		}
		else
			System.out.println("Heap is already empty!");
	}

	public void print()
	{
		String s = "";
		for (int i = 0; i < array.length; i++)
		{
			s = s + array[i] + " ";
		}
		System.out.println(s + "\n");
	}
}