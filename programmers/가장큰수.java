package Main.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public static void main(String[] args) {
        가장큰수 bigNum = new 가장큰수();
        int [] numbers = {6,10,2};
        String result = bigNum.bigNum(numbers);

        System.out.println(result);
    }


    public String bigNum(int[] numbers){
        String answer = "";
        String [] str = new String[numbers.length];
        for(int i=0; i<numbers.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });

        if (str[0].equals("0")) return "0";

        //0이 아니면 문자열을 더해준다.
        for(String s: str) answer += s;
        return answer;
    }
}
