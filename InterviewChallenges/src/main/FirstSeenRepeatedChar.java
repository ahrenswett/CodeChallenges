import java.util.*;

public class FirstSeenRepeatedChar {

    public static char firstSeenDouble(String chars){
        HashMap<Character,Integer> seenChars = new HashMap<>();
        char[] charArr = chars.toCharArray();
        for(char ch: charArr){
            if(seenChars.get(ch) == null){
                seenChars.put(ch,1);
            }else{
                seenChars.put(ch,seenChars.get(ch)+1);
            }
        }
        for(char ch: charArr){
            if(seenChars.get(ch)>1){
                return ch;
            }
        }
        return ' ';
    }
}
