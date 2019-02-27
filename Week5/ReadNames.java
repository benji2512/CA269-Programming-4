import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNames{
    public static void main(String[]args){
        if(args.length < 1){
            System.out.println("Usage: java ReadFile");
        } else {
            Scanner in = null;
            try{
                in = new Scanner(new File(args[0]));
                int numNames = in.nextInt();
                String [] names = new String[numNames];
                for(int i=0;i <  numNames;i++){
                    names[i] = in.next();
                }
                System.out.println("The names in reverse order are:");
                for(int i=numNames-1;i>=0;i--){
                    System.out.println(names[i]+" ");
                }
                System.out.println();
            }
            catch(FileNotFoundException e){
                System.out.println("The file does not exist");
            }
            finally{
                in.close();
            }
        }
    }
}
