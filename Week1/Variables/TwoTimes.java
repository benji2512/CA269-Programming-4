import java.util.Scanner;

class TwoTimes{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int num2 = num * 2;

        System.out.println("Times two is: " + num2);
    }
}
