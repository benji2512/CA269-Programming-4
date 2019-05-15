import java.util.Scanner;

public class HiCounter
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");

        String word = in.next();
        int wordlen = word.length();
        int counter = 0;
        
        for(int letter = 1 ; letter<=wordlen ; letter++){
             int predletter = letter-1;
             if (letter != wordlen){
                String t1 = word.substring(predletter,letter);
                String t2 = word.substring(letter,letter+1);
                String pair = t1 + t2;
                if(pair.equals("hi")){
                    counter++;
                }
            }
        } 
        System.out.println(counter);
    }
}
