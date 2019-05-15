import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNames
{
    public static void main(String [] args)
    {
        System.out.println("Enter the file name: ");
        Scanner in = new Scanner(System.in);
        String filename = in.next();
        in.close();

        try {
        in = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(1);
        }

        int num = in.nextInt();
        String[] names = new String[num];
        for (int i = 0; i < num; i++) {
            names[i] = in.next();
        }

        System.out.println("The names in reverse order are: ");
        for (int i = num - 1; i >= 0; i--) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

        in.close();
    }
}
