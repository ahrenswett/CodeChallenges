import static org.junit.jupiter.api.Assertions.*;

class SpeakTheNumberTest {
    static String[] ones = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine "};
    static String[] tens = {"","ten ","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
    static String[] teens = {"","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
    static String[] toOneHundredAndAbove = {"hundred ","thousand ","million ","billion "};

    int[] testArr ={  1, 17, 11,28, 137, 215, 3428, 35991, 678514, 9876477, 19738113, Integer.MAX_VALUE};
    String[] testAnswers = {
            ones[1],

            teens[7],

            teens[1],

            tens[2]+""+ ones[8],

            ones[1]+""+toOneHundredAndAbove[0]+""+ tens[3]+""+ ones[7],

            ones[2]+""+toOneHundredAndAbove[0]+""+teens[5],

            ones[3]+""+toOneHundredAndAbove[1]+""+ones[4]+""+toOneHundredAndAbove[0]+""+tens[2]+""+ones[8],

            tens[3]+""+ones[5]+""+toOneHundredAndAbove[1]+""+ones[9]+""+toOneHundredAndAbove[0]+""+tens[9]+""+ones[1],

            ones[6]+""+toOneHundredAndAbove[0]+""+tens[7]+""+ones[8]+""+toOneHundredAndAbove[1]+""+ones[5]+""+toOneHundredAndAbove[0]+""+teens[4],

            ones[9]+""+toOneHundredAndAbove[2]+""+ones[8]+""+toOneHundredAndAbove[0]+""+tens[7]+""+ones[6]+""+toOneHundredAndAbove[1]+""+ones[4]+""+toOneHundredAndAbove[0]+""+tens[7]+""+ones[7],

            teens[9]+""+toOneHundredAndAbove[2]+ones[7]+""+toOneHundredAndAbove[0]+""+tens[3]+""+ones[8]+""+toOneHundredAndAbove[1]+""+ones[1]+""+toOneHundredAndAbove[0]+""+teens[3],

            ones[2]+""+toOneHundredAndAbove[3]+""+ones[1]+""+toOneHundredAndAbove[0]+""+tens[4]+""+ones[7]+""+toOneHundredAndAbove[2]+""+ones[4]+""+toOneHundredAndAbove[0]+""+tens[8]+""+ones[3]+""+toOneHundredAndAbove[1]+""+ones[6]+""+toOneHundredAndAbove[0]+""+tens[4]+""+ones[7]};

    @org.junit.jupiter.api.Test
    void numSay() {
        for (int i= 0; i < testArr.length; i++){
            System.out.println(testArr[i] +" on call: " + i);
            assertEquals(testAnswers[i],SpeakTheNumber.numSay(testArr[i]));
        }

    }
}