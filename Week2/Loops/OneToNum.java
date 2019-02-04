import java.util.Scanner;

public class OneToNum{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int top = in.nextInt();
        int i = 1;
        while (i <= top){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for(int j=1;j<=top;j++)
            System.out.print(j + " ");

        System.out.println();
    }
}
