import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        //create array
        double[] array;
        array = new double[num];
        
        System.out.print("Enter " + num + " numbers: ");

        //find out average
        double sum = 0;
        for(int i=0;i<num;i++){
            double inte = in.nextDouble();
            array[i] = inte;
            sum += inte;
        }
        double avg = sum / num;
        
        //print doubles above average
        System.out.println("The above average numbers are:");
        for(int j=0;j<array.length;j++){
            if(array[j] > avg){
                System.out.print(" " + array[j]);
            }
        }

        System.out.println(); // Should finish with a new line
    }
}
