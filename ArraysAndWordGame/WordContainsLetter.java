// Create a Word class with one static method called containsLetter
public class WordContainsLetter{
    static boolean containsLetter(String word, char letter){
        if(word.length() != 0){
            for(int i=0;i<word.length();i++){
                if(letter != word.charAt(i)){
                    continue;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
