import java.util.Scanner;

public class SquareIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read in the number (use in.nextInt() and assign it to an integer
        int n = in.nextInt();
        System.out.print(n);
        System.out.print(" squared is ");

        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        int i = n * n;
        
        // prepare the user for the result
        // print out the result (use System.out.println()
        System.out.println(i);
    }
}