//Compare two objects of a general class and two objects of a wrapper class Using equals method .

class Class1
{
	int x;
	Class1(int x)
	{
	this.x=x;
	}
	public void printNum()
	{
		System.out.println(x);
	}
}
class CompareObjects
{
	public static void main(String[] args)
	{
	Class1 obj1 = new Class1(10);
	Class1 obj2 = new Class1(10);
	
	Integer obj3 = new Integer(10);
	Integer obj4 = new Integer(10);
	
	obj1.printNum();
	
	if(obj1.equals(obj2))
		System.out.println("Obj1 and Obj2 are same.");
	else
		System.out.println("Obj1 and Obj2 are not same.");
	
	if(obj3.equals(obj4))
		System.out.println("Obj3 and Obj4 are same.");
	else
		System.out.println("Obj3 and Obj4 are not same.");
	}
}



