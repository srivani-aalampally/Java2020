import java.lang.Math;
public class TambolaRollingCount
{
	public static void main(String[] args)
	{
		int index=0;
		int pickNumber=0;
		int[] tNum= new int[100];
		while(index<=99)
		{
			//roll a dice
			int num = pickNumber();
			pickNumber=pickNumber+1;
			//check if the number is duplicate
			boolean dupNum=dupCheck(num,tNum,index);
			//if there is no duplicate print/save number
			if(!dupNum)
			{
				tNum[index]=num;
			//	System.out.println("Your number is"+tNum[index]);
				index++;
			}
		}
		System.out.println("Total number of picks "+pickNumber);
	}
	public static int pickNumber()
	{
	double randNum=Math.random();
		   randNum=randNum*100+1;
	int randInt=(int) randNum; 
//	System.out.println("Step1 rooll dice function number "+randInt);
	return randInt;
	}
	public static boolean dupCheck(int num,int[] tNum,int index)
	{
	//boolean foundDup = false;
		for (int i=0;i<=index;i++)
		{
		if(num==tNum[i])
		{
			//foundDup=true;
//			System.out.println("Found dup");
			return true;	
		}
		}
	return false;
	}
}