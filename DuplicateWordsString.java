//Finding dupicate words and number of occurences in a string
import java.io.*;
import java.util.*;
	
class DuplicateWordsString
{
	public static void duplicateWords(String input)
	{
		String[] words=input.split(" ");
        HashMap<String,Integer>  wordCount=new HashMap<String,Integer>();
		for(String word:words)
		{
			if(wordCount.containsKey(word.toLowerCase()))
			{
				wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
			}
			else
			{
				wordCount.put(word.toLowerCase(),1);
			}
		}
		Set<String> wordsC = wordCount.keySet();
		for(String s: wordsC)
		{	
			if(wordCount.get(s)>1)
			{
			System.out.println(s+":"+wordCount.get(s));
			}
		}
	}
	public static void main(String[] args)
	{ 
		duplicateWords("I Scream I scream you scream we all scream for ice cream");
	}
}
