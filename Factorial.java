//Write a program to find factorial of a number without recursion
import java.io.*;
class Factorial
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("For which number you need factorial? ");
		int n = Integer.parseInt(br.readLine());
		FactorialNumber f = new FactorialNumber();
		f.printFactorial(n);
	}
}
class FactorialNumber
{
	public void printFactorial(int num)
	{ 
		int fact = 1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
}

//With recursion
	