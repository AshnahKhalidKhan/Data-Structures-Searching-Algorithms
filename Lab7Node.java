//ASHNAH KHALID KHAN ERP # 22889

public class Lab7Node<Type>
{
	Type data;
	Lab7Node<Type> next;

	public Lab7Node(Type DATA)
	{
		data = DATA;
		next = null;
	}

	public String toString()
	{
		if (data == null)
			return "null";
		return data.toString();
	}
}