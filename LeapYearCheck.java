//Program to check whether given year is leap year or not.
import java.util.*;
import java.io.*;
class LeapYearCheck
{
	public static void main(String args[]) throws IOException
	{
		//BufferedReader reads a couple of characters from the inut stream and stored them in buffer but InputStreamReaders reads only one charachter and remaining charachters still remain in inputStream.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any year: ");
		
		int year = Integer.parseInt(br.readLine());
		LeapYearLogic leapYear = new LeapYearLogic();
		
		if(Integer.toString(year).length()==4)
		{
			leapYear.leapYearCheck(year);
		}
		else
			System.out.println("Please enter a valid year");
	}
}
class LeapYearLogic
{
	public void leapYearCheck(int year)
	{
		if(year%100==0&&year%400==0)
			System.out.println("Year is leap year");
		else
			System.out.println("Year is not a leap year");
	}
}


	


