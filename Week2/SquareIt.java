import java.util.Scanner;

public class SquareIt{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int num = in.nextInt();
        int result = Numbers.square(num);

        System.out.println(num + " squared is " + result);
    }
}
