import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
<<<<<<< Updated upstream
    public static void main(String [] args) throws FileNotFoundException
    {
        String word = args[0];
        int count = 0;
        File movieReviewFile = new File(args[1]);
        Scanner movieReviewScanner = new Scanner(movieReviewFile);
        while(movieReviewScanner.hasNext())
        {
=======
    public static void main(String [] a) throws FileNotFoundException
    {
        String word = a[0];
        int count = 0;
        File movieReviewFile = new File("reviews1.txt");
        Scanner movieReviewScanner = new Scanner(movieReviewFile);
        while(movieReviewScanner.hasNext())
        {
            // Now you can read in a line with Scanner's nextLine() method and you can
            // read in an int with the nextInt() method.
>>>>>>> Stashed changes
            String compWord = movieReviewScanner.next();
            if(compWord.contains(word)){
                count = count + 1;
            }
        }
        System.out.println(word + " appears " + count + " times.");
    }
}
