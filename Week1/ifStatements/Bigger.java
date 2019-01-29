import java.util.Scanner;

class Bigger{
    public static void main(String[]args){
        System.out.print("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        boolean bigger = num1 > num2;
        
        if (bigger){
            System.out.println(num1 + " is the biggest.");
        } else{
            System.out.println(num2 + " is the biggest.");
        }
    }
}
