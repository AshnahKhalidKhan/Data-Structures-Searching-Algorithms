//ASHNAH KHALID KHAN ERP # 22889
//L.I.F.O

public class Lab6ArrayBasedStack<Type extends Comparable<Type>>
{
	Type stackList[];
	int top;

	public Lab6ArrayBasedStack(int size)
	{
		stackList = (Type[]) new Comparable[size];
		top = -1;
	}

	public void PUSH(Type c)
	{
		if (isFull() == true)
		{
			Type[] NewStackList = (Type[]) new Comparable[stackList.length*2];
			for (int i = 0; i < stackList.length; i++)
			{
				NewStackList[i] = stackList[i];
			}
			stackList = NewStackList;
		}
		top++;
		stackList[top] = c;
	}

	public Type POP()
	{
		Type Holder = stackList[top];
		stackList[top] = null;
		top--;
		return Holder;
	}

	public Type PEEK()
	{
		return stackList[top];
	}

	public boolean isEmpty()
	{
		if (top == -1)
			return true;
		return false;
	}

	public boolean isFull()
	{
		if (top == stackList.length - 1)
			return true;
		return false;
	}

	public boolean validate(String Exp)
	{
		Lab6ArrayBasedStack<String> s = new Lab6ArrayBasedStack<String>(Exp.length());
		int count = 0;
		while (Exp.length() > count)
		{
			char symbol = Exp.charAt(count);
			if (symbol == '(' || symbol == '[' || symbol == '{')
				s.PUSH(Character.toString(symbol));
			if (symbol == ')' || symbol == ']' || symbol == '}')
			{
				if (s.isEmpty() == true)
					return false;
				else
				{
					String top = s.PEEK();
					char item = top.charAt(0);
					if ( (item == '(' && symbol == ')') || (item == '[' && symbol == ']') || (item == '{' && symbol == '}') )
						s.POP();
					else
						return false;
				}
			}
			count++;
		}
		if (s.isEmpty() == false)
			return false;
		return true;
	}
}