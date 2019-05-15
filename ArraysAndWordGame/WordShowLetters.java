import java.util.*;
public class WordShowLetters{
    static String showLetters(String word, String letters)
	{
		List<Character> charList = new ArrayList<Character>();
		for(int i = 0; i < letters.length(); i++)
		{
		    charList.add(letters.charAt(i));
		}
		
        for(int j = 0; j<word.length();j++)
		{
		    if(!(charList.contains(word.charAt(j))))
		    {
			    word = word.replace(word.charAt(j), '_');
		    }
		}
	    return word;
    }
}
