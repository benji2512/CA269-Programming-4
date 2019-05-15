import java.util.Scanner;

public class SplitWord{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();

        int wordlen = word.length();
        for(int letter=1;letter<=wordlen;letter++){
            int prevletter = letter-1;
            if (letter == wordlen){
                break;
            } else {
                String l1 = word.substring(prevletter,letter);
                String l2 = word.substring(letter,letter+1);
                System.out.println(l1+l2);
            }
        }
    }
}
