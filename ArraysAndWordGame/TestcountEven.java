public class TestcountEven
{
    // Create a static method called countEven which returns the number of even numbers in the array
    static int countEven(int[] num){
        int even=0;
        for(int i=0;i<num.length;i++){
            if(num[i] % 2 == 0){
                even += 1;
            }
        }
        return even;
    }
}
