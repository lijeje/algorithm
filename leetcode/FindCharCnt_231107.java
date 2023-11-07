package Main.leetcode;

import java.util.Scanner;

public class FindCharCnt_231107 {
    public int solution(String str, char t){
        int answer = 0;
        //대소문자를 구분하지 않기때문에 모든 입력값을 대문자로 바꿀까?
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        System.out.println(str + "/" +t);

        //toCharArray  : 스트링을 문자배열로 만들어줌.
        for(char c :str.toCharArray()){
            if(c == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        FindCharCnt_231107 findCharCnt = new FindCharCnt_231107();
//        백준식
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();//문자열읽기
//        char c = kb.next().charAt(0);//0번째 문자 가져와

        System.out.println(findCharCnt.solution("ComputerCooler", 'c'));
    }
}
