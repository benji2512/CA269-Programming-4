//Actual class name for testing on poodle in Test
public class LargestNumber
{
    public static int largest(int a, int b, int c)
    {
        if(a > b && a > c){
            return a;
        }
        if (b > a && b> c){
            return b;
        } else {
            return c;
        }
    }
}
