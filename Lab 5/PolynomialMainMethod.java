//ASHNAH KHALID KHAN ERP # 22889

public class PolynomialMainMethod
{
	public static void main(String[] args)
	{
		polynomial p1 = new polynomial();
		polynomial p2 = new polynomial();
		polynomial result = new polynomial();

		System.out.println("\nInserting values in p1: ");
		p1.insert(4, 1);
		p1.displayequation();
		p1.insert(10, 0);
		p1.displayequation();
		p1.insert(3, 2);
		p1.displayequation();

		System.out.println("\n\nInserting values in p2: ");
		p2.insert(2, 2);
		p2.displayequation();
		p2.insert(-2, 1);
		p2.displayequation();
		p2.insert(4, 0);
		p2.displayequation();

		System.out.println("\n\nAdding p1 and p2: ");
		p1.displayequation();
		p2.displayequation();
		result.addition(p1, p2);
		System.out.print("\nSum: ");
		result.displayequation();

		System.out.println("\n\nCHECKING FOR OTHER EQUATIONS:");

		polynomial p3 = new polynomial();
		polynomial p4 = new polynomial();
		polynomial newresult = new polynomial();

		//Inserting values in p3
		p3.insert(-3, 1);
		p3.insert(4, 0);
		p3.insert(6, 2);
		p3.displayequation();

		//Inserting values in p4
		p4.insert(5, 1);
		p4.insert(4, 2);
		p4.insert(1, 0);
		p4.displayequation();

		//Adding p3 and p4
		newresult.addition(p3, p4);
		System.out.print("\nSum: ");
		newresult.displayequation();
	}
}