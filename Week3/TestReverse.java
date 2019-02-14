public class TestReverse
{
    static int[] reverse(int[] num){
        int temp;
        for(int i=0;i<num.length/2;i++){
            temp = num[i];
            num[i]=num[num.length-i-1];
            num[num.length-i-1] = temp;
        }
        return num;
    }
}
