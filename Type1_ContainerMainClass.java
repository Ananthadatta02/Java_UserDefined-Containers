package collections.userdefinded_container;

// Advantages 
// 1) Can Store Multiple Values
// 2) Array size is not Fixed. It is Growable.
// 3) Contain's Pre-definded Methods

//Disadvantages
// 1) Homogeneous in Nature
// 2) Not 100% Object Oriented Program.. Because of Primitive Datatype(int)


class Container1
{
	int [] arr = new int[5];
	int index = 0;
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
		int [] newArr = new int[arr.length+3];
		for(int i=0;i<=arr.length-1;i++)
		{
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
}
public class Type1_ContainerMainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Container1 c = new Container1();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		c.add(60);
		c.add(70);
		c.add(80);
		System.out.println("Main Ends");
	}
}
