//To check the euquality of two arrays.
class CheckArraysEquality
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,10};
		boolean checkEqual = checkEquality(a,b);
		if(checkEqual)
			System.out.println("Both arrays are equal.");
		else
			System.out.println("Both arrays are not equal.");
	}
	public static boolean checkEquality(int[] a,int[] b)
	{   
	    int count = 0;
		boolean equality=true;
		boolean lengthCheck = checkLength(a,b);
		if(lengthCheck)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
					count++;
			}
		}
		else
			equality = false;
		if(count!=a.length)
			equality = false;
	
	return equality;
	}
	public static boolean checkLength(int[] a,int[] b)
	{
		boolean lengthCheck=true;
		int aLength=a.length;
		int bLength=b.length;
		if(aLength!=bLength)
			lengthCheck=false;
	return lengthCheck;	
	}
	
}