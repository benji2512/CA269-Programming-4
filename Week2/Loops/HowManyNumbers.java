import java.util.Scanner;

public class HowManyNumbers{
    public static void main(String[]args){
        int num = 0;
        int total = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        num = in.nextInt();
        while(num != -1){
            total++;
            num = in.nextInt();
        }
        System.out.println(total + " numbers were entered.");
    }
}
