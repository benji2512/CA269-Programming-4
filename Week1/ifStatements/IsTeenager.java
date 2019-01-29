import java.util.Scanner;

class IsTeenager{
    public static void main(String[]args){
        System.out.print("Enter your age: ");
        Scanner in = new Scanner(System.in);
        
        int age = in.nextInt();
        boolean teenager = age > 12 && age < 20;
        
        if (teenager){
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are not a teenager.");
        }
    }
}
