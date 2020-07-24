//Accept numbers from keyboard
import java.util.*;
import java.io.*;
class AcceptInput
{
	public static void main(String args[]) throws IOException
	{
		//BufferedReader reads a couple of characters from the inut stream and stored them in buffer but InputStreamReaders reads only one charachter and remaining charachters still remain in inputStream.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		int num = Integer.parseInt(br.readLine());
		
		//Display the number
		System.out.println("The number entered is: "+num);
	}
}

		