import java.util.Scanner;

class EvenOdd {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int mod = num % 2;
        boolean even = mod == 0;
        
        if (even)
        {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
