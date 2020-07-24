import java.util.*;	
import java.lang.Math;

class TambolaWithObjects
{
	
	public static void main(String[] args)
	{
		FunctionsCode source = new FunctionsCode();
		
		int numOfPicks=0;
		//Initializing set to hold all the numbers
		//Set<Integer> totNum= new HashSet<Integer>();
		int size = 100;
		int[] input = source.inputInitialization(size);
		
		for (int l=size;l>=1;l--)
			{
				int num = source.pickNumber(l);
				System.out.println("Your number is "+input[num]);
				numOfPicks=numOfPicks+1;
				if(num!=l-1)
				{
				input[num]=input[l-1];
				}
			}	
		
		System.out.println("Total number of picks are "+numOfPicks);
	}
	
}
class FunctionsCode
{
	public int[] inputInitialization(int size)
		{
			int[] input = new int[size];
			for (int i=0;i<size;i++)
			{
				input[i]=i+1;
			}
			return input;
		}
	public int pickNumber(int limit)
	{
		double randNum = Math.random();
                randNum = randNum*limit;
		int randInt = (int)randNum;
		return randInt;
	}
}

	
	
	