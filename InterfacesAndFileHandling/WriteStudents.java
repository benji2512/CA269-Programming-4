import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteStudents
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
            }
            catch(FileNotFoundException e)
            {
                System.out.println("The file does not exist");
            }
        }
    }
}
