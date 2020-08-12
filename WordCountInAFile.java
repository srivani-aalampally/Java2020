import java.io.File;
import java.util.Scanner;

class WordCountInAFile
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("Inputfile.txt");
		Scanner s = new Scanner(f);
		int wcount=0;
		while(s.hasNextLine())
		{
			String line= s.nextLine();
			wcount=wcount+(line.split(" ").length);
		}
		System.out.println("Word count in a file is: "+wcount);
	}
}
