package Main.programmers;

public class 표현가능한이진트리 {

    public static void main(String[] args) {
        표현가능한이진트리 표현가능한이진트리 = new 표현가능한이진트리();
        long[] numbers =  {7, 42, 5};
        System.out.println(표현가능한이진트리.solution(numbers));
    }

    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];
       // String[] binarynumbers = new String[numbers.length]; //이진수로 바꿔준 값을 넣기
        StringBuilder sb = new StringBuilder();

        // 십진수를 이진수로 바꿔주기
//        for(int i=0; i<numbers.length;i++){
//            long number = numbers[i];
//            while(number != 0 ){//|| number != 1
//
//                sb.append(String.valueOf(number % 2));
//                number = number/2;
//                if(number == 1 ||number == 0 ) {
//                    sb.append(number);
//                    break;
//                };
//            }
//            binarynumbers[i] = sb.reverse().toString();
//            sb.setLength(0);
//        }

        // 함수가 있었군요 ㅇㅅㅇ
        for(int i = 0; i<numbers.length;i++){
            String currentStr = Long.toBinaryString(numbers[i]);
            int j = 0;
            while((int)Math.pow(2, j)-1 < currentStr.length()) {
                j++;
            }
            while((int)Math.pow(2, j)-1 != currentStr.length()) {
                currentStr = "0"+ currentStr;
            }
            if(dfs(currentStr)) {
                answer[i] = 1;
            }
        }


        return answer;
    }


    private static boolean dfs(String number) {
        boolean valid = true;

        int mid = (number.length()-1)/2;
        char root = number.charAt(mid);
        String left = number.substring(0,mid);
        String right = number.substring(mid+1,number.length());

        if(root == '0' && (left.charAt((left.length()-1)/2)=='1' || right.charAt((right.length()-1)/2)=='1')){
            return false;
        }

        if(left.length() >= 3) {
            valid = dfs(left);
            if(valid) {
                valid = dfs(right);
            }
        }
        return valid;
    }


}
