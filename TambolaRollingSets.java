import java.lang.Math;
import java.util.*;
//Pick a number for tambola game - using sets
//Tambola program using sets concept.
class TambolaRollingSets
{
	public static void main(String[] args)
	{
	
		int pickNumber=0;
		//int[] tNum= new int[100];
		Set<Integer> tNum = new HashSet<Integer>();
		while(tNum.size()!=100)
		{
			//Pick a random number		
			int num = pickNumber();
			pickNumber=pickNumber+1;
			//check if the number is duplicate
			//boolean dupNum=dupCheck(num,tNum,index);
			//if there is no duplicate print/save number
			if(!tNum.contains(num))
			{
				tNum.add(num);
			    System.out.println("Your number is "+num);
			}
		}
		System.out.println("Total number of picks "+pickNumber);
	}
	public static int pickNumber()
	{
	double randNum=Math.random();
		   randNum=randNum*100+1;
	int randInt=(int) randNum; 
	return randInt;
	}
}