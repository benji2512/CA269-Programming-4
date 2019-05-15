import java.util.Scanner;
 
public class NumToTwenty{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = in.nextInt();

        while (i <= 20){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter another number; ");
        
        for(int j=in.nextInt();j<=20;j++)
            System.out.print(j + " ");

        System.out.println();
    }
}
     
