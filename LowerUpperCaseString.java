import java.util.*;
import java.io.*;
class LowerUpperCaseString
{
	public static void main(String[] args) throws IOException
	{
	Hashtable<String, String> map = new Hashtable<String, String>();
	String name = "Rajesh";
	StringBuilder s = new StringBuilder(name);
	System.out.println("String after case conversion:"+ConvertString(s));
	}
	public static StringBuilder ConvertString(StringBuilder s)
	{
	for (int i=0;i<s.length();i++)
	{
		if((int)s.charAt(i)>=65 && (int)s.charAt(i) <=90)
		{
		int j=s.charAt(i)+32;
		//name = name.substring(0,i)+(char)j+name.substring(i+1); This used when String is used instead StringBuilder
		s.setCharAt(i,(char)j);
		}
		else
		{
		int j=s.charAt(i)-32;
		//name = name.substring(0,i)+(char)j+name.substring(i+1);This used when String is used instead StringBuilder
		s.setCharAt(i,(char)j);
		}
		
	}
	return s;
	}
	
}

	