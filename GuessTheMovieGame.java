/*
Write a program for a game where the player gets to guess the movie name given the number of letters in it (pretty much like hangman but with movies)!
The rules are simple, the computer randomly picks a movie title, and shows you how many letters it's made up of. Your goal is to try to figure out the movie by guessing one letter at a time.
If a letter is indeed in the title the computer will reveal its correct position in the word, if not, you lose a point. If you lose 10 points, game over!
*/
import java.util.*;
import java.io.*;
import java.lang.*;
class GuessTheMovieGame
{
	
public static void main(String[] args) throws IOException
{
	
	//int randInt;
	List<String> movieList = new ArrayList<String>();
	File f = new File("movies.txt");
	Scanner s = new Scanner(f);
//	movieList.add("hi");
//	System.out.println(movieList);
	
	while(s.hasNextLine())
	{
		movieList.add(s.nextLine());
	}
	GameMethods g = new GuessTheMovieMethods();
	String movieName = g.randomMovie(movieList);	
	int points = 0;
	while(points<10)
	{
		char movieLetter = g.getMovieLetterFromUser();
		boolean searchLetter = g.compareMovieName(movieName,movieLetter);
		if(!searchLetter)
		{
			points++;
			System.out.println("You have lost "+points+" points");
		}
	}
}
}
class GameMethods
{
	int randInt;
	boolean searchL;
	char letter;
	public String movieNameDummy;
	String checkLetter="";
	public String randomMovie(List<String> movieList)
	{
		double randNum = Math.random();
			   randNum = randNum*6+1;
	    randInt = (int) randNum;
		String movieName = movieList.get(randInt);
		movieNameDummy = movieName.replaceAll("[a-zA-Z]","_");
		System.out.println(movieName);
		return movieName;
	}
	public char getMovieLetterFromUser() throws IOException
	{  
	if(movieNameDummy.contains("_"))
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Guess a letter of a movie");
			letter = (char) br.read();
			if(checkLetter.indexOf(letter)!=-1)
			{
				System.out.println("You have already guessed this letter please try other");
				getMovieLetterFromUser();
			}
			checkLetter = checkLetter+letter;		
		}
	else
		{
			System.out.println("You have won!!");
			System.exit(0);
		}
	return letter;
	}
		
	public boolean compareMovieName(String movieName,char movieLetter)
	{ 	
		searchL = false;		
		ArrayList<Integer> list = new ArrayList<Integer>();
      	for(int j = 0; j < movieName.length(); j++)
		{
			if(movieName.charAt(j) == movieLetter)
			list.add(j);
		}       
		/*int j= movieName.indexOf(movieLetter);
			while (j >= 0) 
			{
				j = movieName.indexOf(movieLetter, j + 1);
				list.add(j);
			}

*/	    boolean empty = list.isEmpty();
		if(!empty)
		{
			for (Integer i: list)
			{
			movieNameDummy=movieNameDummy.substring(0,i)+movieLetter+movieNameDummy.substring(i+1);
			searchL = true;
			}
		System.out.println(movieNameDummy);
		}
		return searchL;

	}
}

