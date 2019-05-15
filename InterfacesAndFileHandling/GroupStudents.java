import java.io.File;
import java.io.FileNotFoundException;
<<<<<<< Updated upstream
=======
import java.io.PrintWriter;
>>>>>>> Stashed changes
import java.util.Scanner;

public class GroupStudents
{
<<<<<<< Updated upstream
    public static void main(String [] args)
=======
    public static void main(String [] args) throws FileNotFoundException
>>>>>>> Stashed changes
    {
        if(args.length < 1)
        {
            System.out.println("Usage: java GroupStudents <filename>");
            System.exit(1);
        }
        else
        {
<<<<<<< Updated upstream
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
=======
            try
            {
                PrintWriter outFile = new PrintWriter(args[1]);
                Scanner in = new Scanner(new File(args[0]));
                int i = 0;
                while(in.hasNextLine()){
                    String line = in.nextLine();
                    if(i==0){
                        outFile.println(line);
                        i++;
                        continue;
                    }
                    String [] lines = line.split(" ");
                    outFile.println(lines[0] + " " + (Integer.parseInt(lines[1])+1));
                }
                outFile.close();
                in.close();
>>>>>>> Stashed changes
            }
            catch(FileNotFoundException e)
            {
                System.out.println("The file does not exist");
            }
<<<<<<< Updated upstream
            finally
            {
                in.close();
            }
=======
>>>>>>> Stashed changes
        }
    }
}
