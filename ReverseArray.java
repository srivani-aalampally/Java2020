//Reverse an array without using an additional array
class ReverseArray
{
	public static void main(String[] args)
	{
		int[] array1 = {1,2,3,4,5,6,0};
		Code c = new Code();
		c.reverseArray(array1);
		//int[] reversedArray = c.reverseArray(array1);
		c.printElements(array1);
	
	}
}
class Code
{
	public void reverseArray(int[] array1)
	{
		for(int i=0,j=array1.length-1 ;i<array1.length/2;i++,j--)
		{
			int a = array1[j];
			array1[j]=array1[i];
			array1[i]=a;
		}
	}
	public void printElements(int[] reversedArray)
	{    
		System.out.println("Elements are: ");
		for (int i=0;i<reversedArray.length;i++)
		{
			System.out.print(" "+reversedArray[i]);
		}
	}

}
			
