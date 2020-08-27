//Program to find the class name of an object.
class Class1
{
	int x;
	Class1(int x)
	{
	this.x=x;
	}
}
class KnowName
{
	static void getClassName(Object obj)
	{
		Class c= obj.getClass();
		String name= c.getName();
		System.out.println("Class name is "+name);
	}
	
}
class FindClassName
{
	public static void main(String[] args)
	{
	Class1 obj = new Class1(10);
	KnowName.getClassName(obj);
	}
}
