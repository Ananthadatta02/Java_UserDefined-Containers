package collections.userdefinded_container;

import java.util.NoSuchElementException;

//Advantages 
//1) Can Store Multiple Values
//2) Array size is not Fixed. It is Growable.
//3) Contain's Pre-definded Methods
//4) 100% Object Oriented Program.. Because of Non-Primitive Datatype
//5) Homogeneous in Nature

class Container3<T>
{
	private T [] arr = (T[])new Object[5];
	private int index = 0;
	public void add(T element)
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
		T [] newArr = (T[])new Object[arr.length+3];
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
	public T remove(int index)
	{
		T ele = null;
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
			arr[arr.length-1] = null;
			return ele;
		}
		else
		{
			throw new NoSuchElementException();
		}
	}
	
	//Set
	public void set(int index, T newElement)
	{
		if(index < size() && arr[index] != null)
			arr[index] = newElement;
		else
			throw new NoSuchElementException();
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
	//Retrieve
	public T get(int index)
	{
		return arr[index];
	}
}
class Car
{
	public void speed()
	{
		System.out.println("Car Speed..");
	}
	public void colour() 
	{
		System.out.println("Car Colour..");
	}
	public void brand()
	{
		System.out.println("Car Brand..");
	}
}
public class Type3_ContainerMainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		//Specific Type Container
		Container3<Integer> c1 = new Container3<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		System.out.println(c1.size());
		System.out.println(c1);
		//Raw Type Container
		Container3 c2 = new Container3();
		c2.add(10); //Primitive DataType
		c2.add("Java"); //Non-primitive Pre-definded 
		c2.add(new Car()); //Non-primitive User-definded 
		System.out.println(c2); // [10,Java,Total Information Of the Object]
		
		System.out.println("Main Ends");
	}
}
