public class Lab10HashTableQuadratic
{
	int[] Table;
	int numOfCollisions = 0;
	int numOfOccupiedCells = 0;

	public Lab10HashTableQuadratic(int s)
	{
		int size = s + (s/3);
		int newSize = getPrime(size);
		Table = new int[newSize];
	}

	private int getPrime(int size)
	{
		while(true)
		{
			if (isPrime(size))
				return size;
			else
				size++;
		}
	}

	private boolean isPrime(int size)
	{
		for (int i = 2; i <= size/2; i++)
		{
			if (size % i == 0)
				return false;
		}
		return true;
	}

	public int Hash(int key)
	{
		return (key % Table.length);
	}

	public int Rehash(int key, int i)
	{
		int Rehash = (key + (i*i)) % Table.length;
		int numOfRehashes = 1;
		int FirstAppearance = Rehash;
		//System.out.println("Rehash-" + Rehash);
		while (Table[Rehash] != 0)
		{
			//System.out.println("Rehash-" + Rehash);
			numOfCollisions++;
			i++;
			Rehash = (key + (i*i)) % Table.length;
			numOfRehashes++;
			if (Rehash == FirstAppearance)
			{
				//System.out.println("Repeating traversal now");
				return Table.length; //Invalid value
			}
		}
		System.out.println("Number Of Quadratic Probing Rehashes: " + numOfRehashes);
		return Rehash;
	}

	public void insert(int key)
	{
		int hash = Hash(key);
		if ((double)numOfOccupiedCells <= (2.0/3.0)*(double)Table.length && Table[hash] == 0)
		{
			//System.out.println("Entering first case: Hash-" + hash + " Key-" + key);
			Table[hash] = key;
			numOfOccupiedCells++;
		}
		else if ((double)numOfOccupiedCells <= (2.0/3.0)*(double)Table.length && Table[hash] != 0)
		{
			//System.out.println("Entering second case: Hash-" + hash + " Key-" + key);
			hash = Rehash(key, 1);
			//System.out.println("Rehash-" + hash + " Key-" + key);
			if (hash == Table.length)
				System.out.println("No further unfilled spots left; cannot insert!");
			else
			{
				Table[hash] = key;
				numOfOccupiedCells++;
			}
		}
		else
			System.out.println("Less than 1/3rd empty cells left; cannot insert!");
	}

	public boolean search(int key)
	{
		int hash = Hash(key);
		if (Table[hash] == key)
			return true;
		else
		{
			int i = hash;
			hash = (key + i) % Table.length;
			int FirstAppearance = hash;
			while (Table[hash] != key)
			{
				i++;
				hash = (key + i) % Table.length;
				if (hash == FirstAppearance)
					return false;
			}
			if (Table[hash] == key)
				return true;
		}
		return false;
	}

	public String toString()
	{
		String str = "";
		for (int i = 0; i < Table.length; i++)
		{
			str = str + "[" + i + "]" + Table[i] + "\n";
		}
		return str;
	}
}