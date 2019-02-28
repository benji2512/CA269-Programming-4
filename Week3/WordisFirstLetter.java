public class WordisFirstLetter{
    static Boolean isFirstLetter (String st, char ch){
        char first = st.charAt(0);
        boolean isFirst = ch == first;
        if(isFirst){
            return true;
        } else {
            return false;
        }
    }
}
