import java.util.Scanner;
 
public class OnlyHigh{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
 
        int wordlen = word.length();
        for(int letter=1;letter<=wordlen;letter++){
           int prevletter = letter-1;
           if (letter != wordlen){
               String l1 = word.substring(prevletter,letter);
               String l2 = word.substring(letter,letter+1);
               String pair = l1+l2;
               if(pair.equals("hi")){
                   System.out.println(pair);
            }

        }
    }
} 
}
