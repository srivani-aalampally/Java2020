//Bubblesort algorithm
//Starting with index 0, compare the adjacent element of the array
//If current element is greater than next element swap them
//If current element is less than next element move to the next element and repeat the process.
import java.util.*;
import java.io.*;
class BubbleSort
{
	public static void main(String[] args) throws IOException
	{
		//get the elements of an array
		BubbleSortMethods b = new BubbleSortMethods();
		int[] elements = b.getElements();
		//sort elements
	    b.sortElements(elements);
		//print sorted elements
        b.printElements(elements);
	}
}
class BubbleSortMethods
{
	public int[] getElements() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements to sort: ");
		int n = Integer.parseInt(br.readLine());
		int[] a= new int[n];
		System.out.println("Enter the elements with space in between: ");
		StringTokenizer s = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<n;i++)
		{
			a[i]=Integer.parseInt(s.nextToken());
			System.out.println(a[i]);
		}
		return a;
	}
	public int[] sortElements(int[] elements)
	{
		for(int i=0;i < elements.length-1;i++)
		{
			for(int j=0;j < elements.length-1;j++)
			{
				if(elements[j] > elements[j+1])
				{
					int a = elements[j];
					elements[j]=elements[j+1];
					elements[j+1] = a;
				}
			}
			
		}
		return elements;
	}
	public void printElements(int[] elements)
	{
		System.out.println(" Sorted elements are: ");
		for (int i=0; i< elements.length; i++)
		{
			System.out.print(" "+elements[i]);
		}
	}
	
}


			
		
		