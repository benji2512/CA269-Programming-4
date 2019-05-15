import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Read in the numbers
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        //  Create an array
        int[] nums = new int[num];
        System.out.print("Enter " + num + " numbers: ");
        for(int i=0;i<num;i++){
            int inte = in.nextInt();
            nums[i] = inte;
        }
        
        // reverse the numbers
        int temp;
        for(int j=0;j<nums.length/2;j++){
            temp = nums[j];
            System.out.println(temp);
            nums[j] = nums[nums.length-j-1];
            nums[nums.length-j-1] = temp;
        }
        
        // Print array
        for(int k=0;k<nums.length;k++){
            System.out.print(" " + nums[k]);
        }
        
        System.out.println();
    }
}
