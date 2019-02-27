import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroupStudents
{
    public static void main(String [] args)
    {
        if(args.length < 1)
        {
            System.out.println("Usage: java GroupStudents <filename>");
            System.exit(1);
        }
        else
        {
            Scanner in = null;
            try
            {
                in = new Scanner(new File(args[0])); // args[0] contains the name of the file
                int numStudents = in.nextInt();
                Student [] group = new Student[numStudents];
                for(int i=0;i < numStudents;i++){
                    String n = in.next();
                    int m = in.nextInt(); 
                    group[i] = new Student(n,m);
                }
                Student.print(group);
            }
            catch(FileNotFoundException e)
            {
                System.out.println("The file does not exist");
            }
            finally
            {
                in.close();
            }
        }
    }
}
