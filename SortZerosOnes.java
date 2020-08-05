//Sort an array of 0s and 1s
import java.util.*;
import java.io.*;
class SortZerosOnes
{
	public static void main(String[] args) throws IOException
	{
		SortZerosOnesMethods s = new SortZerosOnesMethods();
		int[] elements = s.getElements();
		s.sortElements(elements);
		//print sorted elements
        s.printElements(elements);

	}
}


class SortZerosOnesMethods
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
		}
		return a;
	}
	public int[] sortElements(int[] elements)
	{
		for(int i=0,j=0;j < elements.length-1;j++)
		{
				if(elements[j] == 0)
				{
					int a = elements[j];
					elements[j]=elements[i];
					elements[i] = a;
					i++;
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

		