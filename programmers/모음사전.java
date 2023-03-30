package Main.programmers;

import java.util.HashMap;
import java.util.Map;

public class 모음사전 {

    //1. 몇번째 번호인지 물어봤으니 모든 조합을 완전 탐색하는 Bruce force를 사용해야 하지 않을까?
    //1. map을 생성해서 순서와 값을 넣기 , 맵을 생성안하고 cnt만 반환하기 어떤것이 더 좋은 효율일까 사용

    public static void main(String[] args) {
        모음사전 dictionary = new 모음사전();
        System.out.println(dictionary.fintCnt());
    }

    public int fintCnt(){
        int answer = 0;
        Map<Integer,String> map = new HashMap<Integer, String>();
        

        return answer;
    }
}
