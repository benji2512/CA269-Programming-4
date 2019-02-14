public class WordShowLetter{
    static String showLetter(String word, char guess){
        String uword = "";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) != guess){
                uword += "_";
            } else {
                uword += word.charAt(i);
            }
        }
        return uword;
    }
}
