import java.io.*;
class FindDuplicateElements
{ 
    static boolean duplicate;
	static int count=0;
	public static void main(String[] args)
	{
		int[] a = {1,2,1,4,2,4,0,8,9,4,4,4,4};
		int key[] = new int[a.length];
		int[] value = new int[a.length];
		int totalcnt = countElements(a,count,key,value);
	    getduplicateElements(key,value,totalcnt);
	}
	public static int countElements(int[] a,int count,int[] key,int[] value)
	{
	     if(count==0)
		 {
			 key[0]=a[0];
			 value[0]=1;
			 count++;
		 }
		for(int j=1;j<a.length;j++)
		{   
			duplicate=false;
			int total=count;
			duplicate=checkDuplicates(j,total,key,value,a);
				if(!duplicate)
				{  
					key[count]=a[j];
					value[count]=1;	
					count++;
				}
		}
	return count;	
	}
	public static void getduplicateElements(int[] key,int[] value,int totalcnt)
	{
		System.out.println("Duplicate Elemenets are: ");
		for(int i=0;i<totalcnt;i++)
			if(value[i]>1)
			System.out.println(key[i]+":"+value[i]);
	}
	public static boolean checkDuplicates(int j,int total,int[] key,int[] value,int[] a)
	{
		for(int i=0;i<total;i++)
			{
			if(a[j]==key[i])
			{
				value[i]=value[i]+1;
				duplicate=true;
				break;
			}
			}
	return duplicate;
	}
}
					    

					
