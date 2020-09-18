import java.io.*;
class ZeroNonzero
{
	public static void main(String[] args) throws IOException
	{
	int[] list = {1,1,2,3,0,0,1,4,7,0};
	Code c = new Code();
	int[] listSorted = c.sortElements(list);
	c.printElements(listSorted);
	}
	public void printElements(int[] listSorted)
	{    
		System.out.println("Elements are: ");
		for (int i=0;i<listSorted.length;i++)
		{
			System.out.print(" "+listSorted[i]);
		}
	}
}
class Code
{
	public int[] sortElements(int[] list)
	{
		for(int i=0,j=0;j<list.length;j++)
		{
			if(list[j]==0)
			{
				int a = list[j];
				list[j]=list[i];
				list[i]=a;
				i++;
			}
		}
		return list;
	}
	public void printElements(int[] listSorted)
	{    
		System.out.println("Elements are: ");
		for (int i=0;i<listSorted.length;i++)
		{
			System.out.print(" "+listSorted[i]);
		}
	}
}
