import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstSeenRepeatedCharTest {


    String[] stringArr = {"hhjfkoennfkdsidjfkl", "abhjydnbmhj", "ckkiljcnkdo"};
    char[] answers = {'h', 'b', 'c'};
    @Test
    void firstSeenDouble() {
        for(int i = 0; i < answers.length; i++){
          assertEquals( answers[i], FirstSeenRepeatedChar.firstSeenDouble(stringArr[i]));
        }
    }
}