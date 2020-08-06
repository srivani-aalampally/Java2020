import java.lang.Math;
class MonopolyUsingRecursiveFun
{
	
	public static void main(String[] args)
	{
		MonopolyRollMethods m = new MonopolyRollMethods();
		int total = m.monopolyRolling();
			System.out.println(total);
	}
	
}
// Using recursive functions
class MonopolyRollMethods
{
	public static int numDoubles=0;
	public int rollDice()
	{
	double randNum=Math.random();
		   randNum=randNum*6+1;
	int randInt=(int) randNum;
	//System.out.println("rolldice function");
	return randInt;
	}
	public int monopolyRolling()
	{
	int roll1=rollDice();
	int roll2=rollDice();
	if(roll1!=roll2)
	{
		return roll1+roll2;
	}
	else
	{
		numDoubles=numDoubles+1;
		System.out.println(numDoubles);
		if(numDoubles==3)
			return -1;
		else
		return roll1+roll2+monopolyRolling();
	}
}
}
