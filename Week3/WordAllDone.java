public class WordAllDone{
    static boolean allDone(String word, String guessed){
        int end = 0;
        if(word.length()!=0){
            for(int i=0;i<word.length();i++){
                for(int j=0;j<guessed.length();j++){
                    if(word.charAt(i)!=guessed.charAt(j)){
                        continue;
                    } else {
                        end+=1;
                    }
                }
            }
        }
        boolean finish = end == word.length();
        return finish;
    }
}
