public class Word{
    public static Boolean containsLetter (String word, char letter){
        for(int i=0;i<word.length();i++)
            char ch = word.charAt(i);
            if(letter==ch)
                return true;
            else 
                return false;
            
    }
}
