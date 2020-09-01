//Compare two strings without using equals method.
//Comparing lexicograpgically

class CompareStrings
{
	public static void main(String[] args)
	{
		String s1 = new String("Corona pandamic");
		String s2 = new String("Corona");
		String s3 = new String("Corona");
		String s4 = new String("pandamic");
		System.out.println("Comparing strings "+s1+" and "+s2+":"+compareTwoStrings(s1,s2));
		System.out.println("Comparing strings "+s2+" and "+s3+":"+compareTwoStrings(s2,s3));
		System.out.println("Comparing strings "+s3+" and "+s4+":"+compareTwoStrings(s3,s4));
	}
	public static int compareTwoStrings(String s1,String s2)
	{
		int l1 = s1.length();
		int l2 = s2.length();
		
			for(int i=0;i<Math.min(l1,l2);i++)
			{
				int s1_c = (int) s1.charAt(i);
				int s2_c = (int) s2.charAt(i);
				if(s1_c!=s2_c)
					return s1_c - s2_c;
			}
		
		if(l1!=l2)
			return l1 - l2;
		else 
			return 0;
	}
}

		