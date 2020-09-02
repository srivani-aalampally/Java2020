//Check whether two strings are Anagram of each other.
class Anagram
{
	public static void main (String[] args)
	{
		String str1 = new String("TRIANGLE");
		String str2 = new String("INTEGRAL");
		
		int l1 = str1.length();
		int l2 = str2.length();
		int str1value = getAsccivalue(str1);
		int str2value = getAsccivalue(str2);
		if (str1value==str2value)
			System.out.println("Strings are anagram of each other");
		else
			System.out.println("Strings are not anagram of each other");
	}
	public static int getAsccivalue(String str1)
	{   int v = 0;
		for(int i=0;i<str1.length();i++)
		{
			v = str1.charAt(i)+v;
			System.out.println(v);
		}
		System.out.println("Final String value of "+str1+" is "+v);
		return v;
	}
}

			