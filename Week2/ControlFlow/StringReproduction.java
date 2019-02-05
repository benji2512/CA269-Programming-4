import java.util.Scanner;

public class StringReproduction{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer and a string: ");
        int num = in.nextInt();
        String word = in.next();

        for(int rep=1;rep<=num;rep++)
            System.out.print(word);

        System.out.println();
    }
}
