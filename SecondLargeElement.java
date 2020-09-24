//Find 2nd largest element in an array of integrers.

class SecondLargeElement
{
	public static void main(String[] args)
	{
		int[] elements = {1,4,2,23,56,123,90,234};
		int a = getSecondLargestElement(elements);
		System.out.println("SecondLargeElement is:"+a);
	}
	public static int getSecondLargestElement(int[] elements)
	{
		int largest = elements[0];
		int secondLargest=0;
		for(int i=1;i<elements.length;i++)
		{
			if(elements[i]>largest)
			{
				secondLargest=largest;
				largest=elements[i];
			}
		}
		return secondLargest;
				
	}
}