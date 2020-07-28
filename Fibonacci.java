//Fibonacci
import java.util.*;
import java.io.*;
class Fibonacci
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of fibonacci numbers you need: ");
		int n = Integer.parseInt(br.readLine());
		FibonacciProg f = new FibonacciProg();
		f.getFibonacci(n);
	}
}
class FibonacciProg
{
	public void getFibonacci(int n)
	{
		int a=0,b=1;
		int c = a+b;
		System.out.println("Febonacci numbers are below");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int count=3;
			while(count < n)
			{
				a=b;
				b=c;
				c=a+b;
				System.out.println(c);
				count++;
			}
	}
}

	