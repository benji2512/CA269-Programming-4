import java.util.Scanner;

public class Thrice
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter three numbers: ");
        
        // Read in the numbers (you need a variable and an in.nextInt() call for each integer
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        int result = n1 * n2 * n3;

        // prepare the user for the result
        // print out the result (use System.out.println() )
        System.out.println("The product is " + result);
    }
}
