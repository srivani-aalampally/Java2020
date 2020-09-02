//Anagram using Hashmap
import java.util.*;
import java.io.*;
class AnagramUsingHashmap
{

	public static void main(String[] args)
	{
		HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
	    HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();
		String str1 = new String("LISTEN");
		String str2 = new String("SILENT");
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		hmap1 = getHashMap(arr1,hmap1);
		hmap2 = getHashMap(arr2,hmap2);
		if(hmap1.equals(hmap2))
			System.out.println("Given strings are anagram of each other");
		else
			System.out.println("Given strings are not anagram of each other");
		
	}
    
	public static HashMap<Character, Integer> getHashMap(char arr[],HashMap<Character, Integer> hmap)
	{
	for(int i = 0; i < arr.length; i++)
		{
			if(hmap.containsKey(arr[i]))
				hmap.put(arr[i],hmap.get(arr[i])+1);
			else
				hmap.put(arr[i],1);
		}
		return hmap;
	}
	
}
