public class Lab8BinaryNode<Type>
{
	Type data;
	Lab8BinaryNode<Type> left;
	Lab8BinaryNode<Type> right;

	public Lab8BinaryNode(Type d)
	{
		data = d;
	}

	public String toString()
	{
		if (data == null)
			return "null";
		return data.toString();
	}
}