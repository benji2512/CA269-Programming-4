public class TestgetSum
{
    // Create a static method called getSum which sums an array of ints
    static int getSum(int[] num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        return sum;
    }
}
