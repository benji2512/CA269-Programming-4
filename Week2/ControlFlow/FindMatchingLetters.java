import java.util.Scanner;

public class FindMatchingLetters
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two lines:");

        String line1 = in.nextLine();
        String line2 = in.nextLine();

        int numMatching = 0;
        int letter = 1;
        int end = line2.length();

        int lcount = 0;        
        while(lcount < end){
            int predletter = letter-1;
            String chara1 = line1.substring(predletter, letter);
            String chara2 = line2.substring(predletter, letter);
            if (chara1.equals(chara2)){
                numMatching++;
                letter++;
                lcount++;
            } else {
                letter++;
                lcount++;
            }
        }
        System.out.println("There are " + numMatching + " corresponding characters.");
    }
}
