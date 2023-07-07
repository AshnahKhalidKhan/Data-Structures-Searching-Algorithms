public class Main
{
	public static void main(String[] args)
	{
		Lab2MyArrayList<Integer> A = new Lab2MyArrayList<Integer>();
		System.out.println(A.toString());

		System.out.println("\nAfter inserting values: // Assume the insertion is going to perform in ascending order. If array is full then increase the arr size by double and insert new value");
		A.add(11);
		A.add(200);
		A.add(450);
		A.add(87);
		A.add(870);
		A.add(874);
		A.add(37);
		A.add(59);
		A.add(60);
		A.add(87);
		System.out.println(A);

		System.out.println("\nAfter inserting EXCESS values:");
		A.add(100);
		System.out.println(A);

		System.out.println("\nFind index number for value 100: " + A.find(100));
		System.out.println("(TESTING FIND FUNCTION FOR INVALID VALUE; IT SHOULD GIVE -1)Find index number for invalid value 1: " + A.find(1));

		System.out.println("\nGet value at index 2: " +  A.get(2));

		System.out.println("\nClear array:");
		A.clear();
		System.out.println(A);

		System.out.println("\nUpdate value at index 2 with 33 ");
		System.out.println(" And value at index 3 with 100: ");
		A.Update(2,33);
		A.Update(3,100);
		System.out.println(A);

		System.out.println("\nRemove value 100:");
		A.remove(100);
		System.out.println(A);
	}
}