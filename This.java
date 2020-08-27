//Prove that this keyword refers to current object
class This
{
	public void msg()
	{
	System.out.println(this);
	}
	public static void main(String[] args)
	{
	This t = new This();
	System.out.println(t);
	t.msg();
	}
}
