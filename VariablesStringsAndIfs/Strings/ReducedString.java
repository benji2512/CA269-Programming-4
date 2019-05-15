import java.util.Scanner;

public class ReducedString
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer and a string: ");
        
        int position = in.nextInt();
        String word = in.next();
        int wordLen = word.length();
        
        String sub1 = word.substring(0, position);
        String sub2 = word.substring(position+1, wordLen);
        
        System.out.println(sub1 + sub2);
    }
}
