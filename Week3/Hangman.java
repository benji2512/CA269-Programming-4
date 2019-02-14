// Write your Hangman class here
import java.util.Scanner;

public class Hangman
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // First get the word
        //int wordSeed = in.nextInt();

        //String word = Word.getWord(wordSeed);
        String word = "dog";
        String guesses = "";
        
        // Hide word
        String uword = "";
        for(int i=0;i<word.length();i++){
            uword+="_";
        }
        
        // Now you have the word ... encourage the user to guess.
        System.out.println("The word is");
        System.out.println(uword);
        
        // Start guesses
        boolean done = WordAllDone.allDone(word,uword);
        while(done!=true){
            System.out.println("Guess a letter:");
            guesses+=in.next();
            uword=WordShowLetters.showLetters(word,guesses);
            System.out.println(uword);
            done=WordAllDone.allDone(word,uword);
        }
        System.out.println("Well Done, the word was " + uword);
    }
}
