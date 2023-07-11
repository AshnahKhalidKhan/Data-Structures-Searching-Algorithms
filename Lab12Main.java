public class Lab12Main
{
	public static void main(String[] args)
	{
		System.out.println("\nQUICK SORT...");

		Lab12Sorting L = new Lab12Sorting();
		int[] arr = new int[100];
		String s = "";
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (int) (Math.random()*100) + 1;
			s = s + arr[i] + " ";
		}
		System.out.println(s);
		L.QuickSort(arr, 0, arr.length - 1);
		s = "";
		for (int i = 0; i < arr.length; i++)
		{
			s = s + arr[i] + " ";
		}
		System.out.println(s);
		L.getStats();

		System.out.println("\nHEAP SORT...");

		int[] HeapArray = new int[10]; //{5, 4, 9, 7, 19, 8, 17, 2, 6, 5, 21}

		for (int i = 0; i < HeapArray.length; i++)
		{
			HeapArray[i] = (int) (Math.random()*100) + 1;
			s = s + HeapArray[i] + " ";
		}

		Lab12HeapSort H = new Lab12HeapSort(HeapArray);
		H.print();
		System.out.println("Deleting values now:");
		H.print();
		H.delete();
		H.print();
		H.delete();
		H.print();
		H.delete();
		H.print();
		H.delete();
		H.print();
		H.delete();
		H.print();
		H.delete();
		H.print();
		H.delete();
		H.print();
		H.delete();
		H.print();
		H.delete();
		H.print();
		H.delete();
		H.print();
		H.delete();
	}
}