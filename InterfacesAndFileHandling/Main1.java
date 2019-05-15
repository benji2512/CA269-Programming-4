import java.util.Scanner;

public class Main1
{
    public static Cat1 getCat(Scanner in)
    {
        String name = in.nextLine();
        return new Cat1(name);
    }
    
    private static void swap(Order [] items, int a, int b)
    {
        Order tmp;
        tmp = items[a];
        items[a] = items[b];
        items[b] = tmp;
    }
    
    // This method is going to sort a list of items. The only thing it knows about these items is that
    // they implement the Order interface and therefore they have a lessThan method.
    public static void sort(Order [] items)
    {
        // Use selection sort.
        for(int i = 0; i < items.length - 1; i++)
        {
            // Find the smallest and put it in the current position
            int min = i; // Assume it's the first
            for(int j = i + 1; j < items.length; j++)
                if(items[j].lessThan(items[min]))
                    min = j; // something is lessThan our current min ... update
                    
            swap(items, i, min); // Put the smallest in the correct location
        }
    }
    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // Dump the newline
        Cat1 [] cats = new Cat1[n];
        for(int i = 0; i < n; i++)
            cats[i] = getCat(in);
            
        sort((Order []) cats);
        
        // Print out the sorted points
        System.out.println("The sorted cats:");
        for(int i = 0; i < n; i++)
            System.out.println(cats[i]);
    }
}
