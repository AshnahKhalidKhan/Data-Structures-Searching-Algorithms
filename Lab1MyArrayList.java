//ASHNAH KHALID KHAN ERP # 22889

public class Lab1MyArrayList
{
	int[] arr;
	int currIndex;

	public Lab1MyArrayList()
	{
		arr = new int[10];
		currIndex = -1;
	}

	public Lab1MyArrayList(int size)
	{
 		arr = new int[size];
 		currIndex = -1;
	}

	public void PrintList()
	{
 		for (int i = 0; i < arr.length; i++)
		{
 			System.out.println(arr[i]+"\n");
		}
 	}

	public void InsertInOrder(int v)
	{
 		if (currIndex == (arr.length - 1))
		{
			int[] arr2 = new int[arr.length*2];
 			for (int i = 0; i < arr.length; i++)
			{
				arr2[i] = arr[i];
			}
 			arr = arr2;
		}
		if (currIndex == -1)
		{
			currIndex = currIndex + 1;
 			arr[currIndex] = v;
 		}
 		else
		{
			currIndex++;
 			for (int i = 0; i < arr.length - 1; i++)
			{
				if ((v >= arr[i] && v < arr[i+1]) || (v >= arr[i] && arr[i+1] == 0))
				{
					for (int n = i; n < arr.length - 1; n++)
					{
						int Temporary = arr[n+1];
						arr[n+1] = v;
						v = Temporary;
					}
				}
			}
 		}
	}

	public int Length()
	{
		return arr.length;
 	}

	public int get(int index)
	{
 		return arr[index];
 	}

	public void Update (int index, int value)
	{
		arr[index] = value;
 	}

	public int Find(int value)
	{
 		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == value)
				return i;
		}
		return -1;
 	}

	public void Remove (int value)
	{
		int indexRemoveValue = Find(value);
		if (indexRemoveValue >= 0 && indexRemoveValue < arr.length)
		{
			arr[indexRemoveValue] = 0;
			for (int i = indexRemoveValue; i < arr.length - 1; i++)
			{
				arr[i] = arr[i+1];
			}
		}
 	}
}