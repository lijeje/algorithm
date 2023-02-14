package Main.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
    public static void main (String []args) {
        int result = RomanToInteger("IV");
        System.out.println(result);
    }

    public static int RomanToInteger(String s) {
        HashMap<Character,Integer> indicators= new HashMap<Character,Integer>();
        indicators.put('I',1);
        indicators.put('V',5);
        indicators.put('X',10);
        indicators.put('L',50);
        indicators.put('C',100);
        indicators.put('D',500);
        indicators.put('M',1000);
        int result = indicators.get(s.charAt(s.length() - 1));
        for(int i=0; i<s.length()-1;i++){
            if(indicators.get(i)>indicators.get(i+1)) {
                result += indicators.get(s.charAt(i));
            }else{
                result -= indicators.get(s.charAt(i));
            }
            System.out.println(s.charAt(i));
            System.out.println(indicators.get("I"));
        }
        return result;
    }
}
