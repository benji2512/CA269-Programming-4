//Actual class name for testing on poodle is Test
public class FirstShallBeLast
{
    public static String firstShallBeLast(String word)
    {
        int wordlen = word.length();
        int letter = 1;
        int predletter = letter-1;
        
        String t1 = word.substring(predletter,letter);
        String mid = word.substring(letter,wordlen-1);
        String t2 = word.substring(wordlen-1,wordlen);
        
        String newWord = t2+mid+t1;
        
        return newWord;
    }
}
