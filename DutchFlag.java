//Sorting dutchflag problem
//Sort an array of 0s,1s and 2s
import java.util.*;
import java.io.*;
class DutchFlag
{
	public static void main(String[] args) throws IOException
	{
		SortZerosOnesTwosMethods s = new SortZerosOnesTwosMethods();
		int[] elements = s.getElements();
		s.sortElements(elements);
		//print sorted elements
        s.printElements(elements);

	}
}


class SortZerosOnesTwosMethods
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
	{   int n = elements.length;
	int k = n-1;
	int i=0,j=0;
			while(j<=k)
			{
				if(elements[j] == 0)
				{
					int a = elements[j];
					elements[j]=elements[i];
					elements[i] = a;
					i++;
					j++;
				}
				else if(elements[j] == 2)
				{
					int swapN=elements[j];
					elements[j]=elements[k];
					elements[k]=swapN;
					k--;
					
				}
				else
				j++;
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

		