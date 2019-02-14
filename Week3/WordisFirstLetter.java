public class WordisFirstLetter{
    static Boolean isFirstLetter (String st, char ch){
        char first = st.charAt(0);
        if(ch == first){
            return true;
        } else {
            return false;
        }
    }
}
