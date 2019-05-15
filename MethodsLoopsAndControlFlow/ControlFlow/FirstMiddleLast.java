import java.util.Scanner;

public class FirstMiddleLast
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");

        String word = in.next();
        int wordlen = word.length();
        int letter = 1;
        int predletter = letter-1;
        
        String t1 = word.substring(predletter,letter);
        String mid = word.substring(letter,wordlen-1);
        String t2 = word.substring(wordlen-1,wordlen);
        System.out.println(t1);
        System.out.println(mid);
        System.out.println(t2);        
    }
}
