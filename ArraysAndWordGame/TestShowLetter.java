import java.util.Scanner;

public class TestShowLetter
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user for a word and a letter
        System.out.print("Enter a word and a letter: ");
        String word = in.next();
        char guess = in.next().charAt(0);
        
        String show = WordShowLetter.showLetter(word, guess);
        System.out.println(show);
    }
}
