import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
    public static void main(String [] args) throws FileNotFoundException
    {
        String word = args[0];
        int count = 0;
        File movieReviewFile = new File(args[1]);
        Scanner movieReviewScanner = new Scanner(movieReviewFile);
        while(movieReviewScanner.hasNext())
        {
            String compWord = movieReviewScanner.next();
            if(compWord.contains(word)){
                count = count + 1;
            }
        }
        System.out.println(word + " appears " + count + " times.");
    }
}
