//ASHNAH KHALID KHAN ERP # 22889

public class Lab1DynamicArrays
{
	public static void main(String[] args)
	{
		Lab1MyArrayList A = new Lab1MyArrayList(4);
		A.PrintList();
		System.out.println("Array Length:" + A.Length());

		System.out.println("\nAfter inserting values:");
		A.InsertInOrder(11);
		A.InsertInOrder(200);
		A.InsertInOrder(45);
		A.InsertInOrder(87);
		A.PrintList();
		System.out.println("Array Length:" + A.Length());

		System.out.println("\nAfter inserting EXCESS values:");
		A.InsertInOrder(100);
		A.PrintList();
		System.out.println("Array Length:" + A.Length());

		System.out.println("\nGet value at index 2: " +  A.get(2));

		System.out.println("\nUpdate value at index 2 with 33: ");
		A.Update(2,33);
		A.PrintList();

		System.out.println("\nFind index number for value 100: " + A.Find(100));
		System.out.println("(TESTING FIND FUNCTION FOR INVALID VALUE; IT SHOULD GIVE -1)Find index number for invalid value 1: " + A.Find(1));

		System.out.println("\nRemove value 100:");
		A.Remove(100);
		A.PrintList();
	}
}
