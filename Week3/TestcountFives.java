public class TestcountFives
{
    // Create a static method called countFives which returns the number of fives in the array
    static int countFives(int[] num){
        int fives = 0;
        for(int i=0;i<num.length;i++){
            if(num[i] == 5){
                fives+=1;
            }
        }
        return fives;
    }
}
