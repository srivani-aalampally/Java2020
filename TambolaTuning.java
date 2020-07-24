import java.util.*;	
import java.lang.Math;

public class TambolaTuning
{
	static int[] input;
	public static void main(String[] args)
	{
		
		int numOfPicks=0;
		//Initializing set to hold all the numbers
		//Set<Integer> totNum= new HashSet<Integer>();
		int size = 100;
		inputInitialization(size);
		
		for (int l=size;l>=1;l--)
			{
				int num = pickNumber(l);
				System.out.println("Your number is "+input[num]);
				numOfPicks=numOfPicks+1;
				if(num!=l-1)
				{
				input[num]=input[l-1];
				}
			}	
		
		System.out.println("Total number of picks are "+numOfPicks);
	}
	public static void inputInitialization(int size)
		{
			input = new int[size];
			for (int i=0;i<size;i++)
			{
				input[i]=i+1;
			}
		}
	public static int pickNumber(int limit)
	{
		double randNum = Math.random();
                randNum = randNum*limit;
		int randInt = (int)randNum;
		return randInt;
	}
}

	
	
	