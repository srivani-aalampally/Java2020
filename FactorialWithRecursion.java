//Write a program to find factorial of a number with recursion
import java.io.*;
class FactorialWithRecursion
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("For which number you need factorial? ");
		int n = Integer.parseInt(br.readLine());
		FactorialNumber f = new FactorialNumber();
		int r=f.printFactorial(n);
		System.out.println("Factorial of "+n+" is "+r);
	}
}
class FactorialNumber
{
	public int printFactorial(int num)
	{ 
		if(num==1) return 1;
		int r=printFactorial(num-1)*num;
		return r;
	}
}
	