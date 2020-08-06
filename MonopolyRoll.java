import java.lang.Math;
class MonopolyRoll
{
	public static void main(String[] args)
	{
		MonopolyRollMethods m = new MonopolyRollMethods();
		int total = m.monopolyRolling();
			System.out.println(total);
	}
	
}

// If player rolls doubles 3 times go to jail, return -1 instead of rolling again.

class MonopolyRollMethods
{   public int numDoubles=0;
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
	int total = roll1+roll2;
		while(roll1==roll2)
		{
			numDoubles=numDoubles+1;
			//System.out.println(numDoubles);
			if(numDoubles==3)
			{
				return -1;
			}
			roll1=rollDice();
			roll2=rollDice();
			total=total+roll1+roll2;
		}
	return total;
}
}

