public class Teen{
    public static boolean isTeenager(int age){
        boolean isTeenager = age > 12 && age < 20;
        if (isTeenager)
            return true;
        else
            return false;
    }
}
