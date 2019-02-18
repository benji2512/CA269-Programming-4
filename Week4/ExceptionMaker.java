public class ExceptionMaker{
    public static void main(String[]args){
        int[] numbers = new int[2];
        numbers[0]=1;
        numbers[1]=2;
        for(int i=numbers.length;i>0;i--){
            System.out.print(numbers[i]);
        }
    }
}
