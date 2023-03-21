package Main.programmers;

public class TargetNumber {
    int answer = 0;
    public static void main(String[] args) {
        int [] numbers = {1, 1, 1, 1, 1};
        int [] numbers2 = {4, 1, 2, 1};
        int target = 3;
        int target2 = 4;
        TargetNumber targetNumber = new TargetNumber();
        targetNumber.solution(numbers, target);
    }

    public int solution(int[] numbers, int target) {

        int depth = 0;
        int sum = 0;
        //DFS방식으로 풀어볼까ㅏ 그렇다면 재귀호출?
        DFS(numbers,target,depth,sum);




        return answer;
    }

    public void DFS(int[] numbers, int target,int depth,int sum){
        if(numbers.length == depth){
            if(sum == target) answer++;
        }else {
            DFS(numbers,target,depth+1,sum+numbers[depth]);
            DFS(numbers,target,depth+1,sum-numbers[depth]);
        }

    }
 }
