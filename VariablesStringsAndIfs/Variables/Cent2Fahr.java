import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String [] args)
    {
     Scanner in = new Scanner(System.in);
     int cent = in.nextInt();
     double fahr = 9.0 * cent/5.0 + 32.0;
     System.out.println(cent + " " + fahr);
    }
}
