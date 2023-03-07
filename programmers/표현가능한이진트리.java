package Main.programmers;

public class 표현가능한이진트리 {

    public static void main(String[] args) {
        표현가능한이진트리 표현가능한이진트리 = new 표현가능한이진트리();
        long[] numbers =  {7, 42, 5};
        System.out.println(표현가능한이진트리.solution(numbers));
    }

    public int[] solution(long[] numbers) {
        int[] answer = {};
        StringBuilder strbuilder = new StringBuilder();

        // 십진수를 이진수로 바꿔주기
        for(int i=0; i<numbers.length;i++){
            long number = numbers[i];
            while(number == 0){
                strbuilder.append(String.valueOf(number % 2));
                System.out.println(strbuilder.toString().);
                if(number == 1) break;
            }

        }


        // 변형한 이진수로 트리 구현

        // 트리가 성립하는지 확인 성립한다면 answer에 1, 성립하지않으면 0 넣기

        return answer;
    }


}
