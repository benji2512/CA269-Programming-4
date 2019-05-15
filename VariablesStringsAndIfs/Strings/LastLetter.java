import java.util.Scanner;

public class LastLetter
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = in.next();
        int nameLen = name.length() - 1;
        String lastLetter = name.substring(nameLen);

        System.out.println("The last letter of your name is " + lastLetter + ".");
    }
}
