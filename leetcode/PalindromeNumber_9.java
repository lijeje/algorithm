package Main.leetcode;

public class PalindromeNumber_9 {

    public static void main(String []args){
        //isPalindrome(10);

        boolean test = isPalindrome2(123454321);
        System.out.println(test);
    }
    public static boolean isPalindrome(int x) {
        int length = (int)Math.log10(x)/2;
        int maxLength = (int)Math.log10(x);
        boolean flag = true;
        String strX = String.valueOf(x);

        if(x<0){
            return false;
        }

        for(int i = 0; i<=length; i++){ // 몇번을 도는지 체크
            char headStr = strX.charAt(i);
            char tailStr = strX.charAt(maxLength -i);
            if(headStr != tailStr){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isPalindrome2(int x) {
        //자바 StringBuilder 랑 Buffer 가 reverse() 메소드 가지고 있는데 이게 안에 있는 문자열을 뒤집어 줌
        // 그래서 그 문자열하구 정수를 문자열로 변경한거를 비교해주면 한줄로 코드를 끝낼 수 있음.
        return String.valueOf(x).equals(new StringBuilder().append(x).reverse().toString());
    }
}
