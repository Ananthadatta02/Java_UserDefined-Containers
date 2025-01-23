package collections.userdefinded_container;

//Advantages 
//1) Can Store Multiple Values
//2) Array size is not Fixed. It is Growable.
//3) Contain's Pre-definded Methods
//4) 100% Object Oriented Program.. Because of Non-Primitive Datatype

//Disadvantages
//1) Homogeneous in Nature

class Container2
{
	Integer [] arr = new Integer[5];
	private int index = 0;
	public void add(int element)
	{
		if(index == arr.length)
		{
			grow();
		}
		arr[index] = element;
		index++;
	}
	private void grow()
	{
		Integer [] newArr = new Integer[arr.length+3];
		for(int i=0;i<=arr.length-1;i++)
		{
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	@Override
	public String toString()
	{
		String st = "[";
		for (int i = 0; i <= arr.length-1; i++) 
		{
			if(arr[i] != null)
			{
				if(i<=(size()-2))
					st = st+arr[i]+",";
				else
					st = st+arr[i];
			}
		}
		st = st+"]";
		return st;
	}
	//Remove
	public Integer remove(int index)
	{
		Integer ele = null;
		if(index < size())
		{
			if(arr[index] != null)
			{
				ele = arr[index];
				for (int i=index; i< arr.length-1; i++) 
				{
					arr[i] = arr[i+1];
				}
			}
		}
		arr[arr.length-1] = null;
		return ele; 
	}
	//Size
	public int size()
	{
		int count = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i] != null)
				count++;
		}
		return count;
	}
}
public class Type2_ContainerMainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Container2 c = new Container2();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		System.out.println(c); // Implicit Call to toString()
//		System.out.println(c.toString());
		System.out.println(c.remove(3)); // returning Address
		System.out.println(c.size());
		System.out.println(c);
		System.out.println("Main Ends");
	}
}
