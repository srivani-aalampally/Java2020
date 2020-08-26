//Method Overriding
//Electricity bill for commercial and domestic connections.
class ElectricityBill
{
	public static void main(String[] args)
	{
		Commercial c = new Commercial();
		c.setName("Nani");
		c.calculateBill(100);
		Domestic s = new Domestic();
		s.setName("Vani");
		s.calculateBill(100);
	}
	
}
class Commercial
{
	//customer name
	private String name;
	//store customer name
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	//calculate bill for commercial
	void calculateBill(int units)
	{
		System.out.println("Customer name: "+getName());
		System.out.println("Bill amount is: "+ units*5.00);
	}
}
class Domestic extends Commercial
{
	void calculateBill(int units)
	{
		System.out.println("Customer name: "+getName());
		System.out.println("Bill amount is: "+ units*2.50);
	}
}
