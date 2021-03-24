import java.util.*;
import static java.lang.Thread.sleep;

class SpeakTheNumber{

    static String[] ones = {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine "};
    static String[] tens = {"","ten ","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
    static String[] teens = {"","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
    static String[] toOneHundredAndAbove = {"hundred ","thousand ","million ","billion "};
    public static void main(String[] args) throws InterruptedException {
        Random rnd = new Random();
        int holder;
        for(int i = 0; i < 10; i++){
            System.out.println(holder = rnd.nextInt(Integer.MAX_VALUE));
            System.out.println(numSay(holder));
        StringBuilder answer = new StringBuilder();
        }
    }





    static String numSay(int num){return numSay(num,0);}


    static String numSay(int num, int counter){
        StringBuilder str = new StringBuilder();

        // if the number is greater than 100's place
        if (num / 100 > 9) {
//            Send everything beyond the hundreds place to  the next call
            str.append(numSay(num/1000, counter+1)); //gets the hundreds place
//            process the hundreds place for this call
            num = num%1000;
        }

        int ten = num % 100; //23
        int one = ten % 10;

        if (num / 100 != 0) {
            str.append(ones[(num / 100)] + "" + toOneHundredAndAbove[0]);
        }
        if ((ten % 10 != 0) && ten / 10 == 1) {
            str.append(teens[ten % 10]);
        } else {
            str.append(tens[ten / 10]);
            str.append(ones[one]);
        }
        if(counter>0) {
            str.append(toOneHundredAndAbove[counter]);
        }
        return str.toString();
    }
}