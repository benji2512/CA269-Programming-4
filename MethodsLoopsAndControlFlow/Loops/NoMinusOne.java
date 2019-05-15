import java.util.Scanner;

public class NoMinusOne{
    public static void main(String[]args){
        int num = 0;
        int penNum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        num = in.nextInt();
        while(num != -1){
            penNum = num;
            num = in.nextInt();
        }
        System.out.println("The penultimate number was: " + penNum);
    }
}
