import java.lang.Math;
//Write a program to pick a random number between 1 to 100 - tambola
public class RandomNumberForTambola
{
	public static void main(String[] args)
	{
		int index=0;
		int[] tNum= new int[100];
		while(index<=99)
		{
			//roll a dice
			int num = pickNumber();
			//check if the number is duplicate
			boolean dupNum=dupCheck(num,tNum,index);
			//if there is no duplicate print/save number
			if(!dupNum)
			{
				tNum[index]=num;
				System.out.println("Your number is"+tNum[index]);
				index++;
			}
		}
	}
	public static int pickNumber()
	{
	double randNum=Math.random();
		   randNum=randNum*100+1;
	int randInt=(int) randNum; 
	// test
	//System.out.println("Step1: Pick random number function "+randInt);
	return randInt;
	}
	public static boolean dupCheck(int num,int[] tNum,int index)
	{
	//boolean foundDup = false;
		for (int i=0;i<=index;i++)
		{
		if(num==tNum[i])
		{
			//Test
			//System.out.println("Found duplicate");
			return true;	
		}
		}
	return false;
	}
}