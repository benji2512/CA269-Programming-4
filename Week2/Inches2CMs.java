import java.util.Scanner;

public class Inches2CMs{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        double num = in.nextDouble();
        double result = Measure.inches2CMs(num);

        System.out.println(num + " inches is " + result + " CMs.");
    }
}
