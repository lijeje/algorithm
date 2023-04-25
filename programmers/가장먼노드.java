package Main.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 가장먼노드 {
    // 트리는 그래프의 한 종류이다.
    // 인접리스트를 사용해 구현해본다. 인접리스트란 정점의 갯수만큼 리스트를 생성하고 정점과 인접한 정보들을 리스트에 넣는 방식
    public ArrayList<Integer>[] graph;
    public boolean[] visited;
    public int[] distance;

    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        가장먼노드 fN = new 가장먼노드();
        fN.solution(n,edge);
    }

    public int solution(int n, int[][] edges) {
        int answer = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // n개의 리스트 생성
        for(int i = 0 ; i <= n ; i++) list.add(new ArrayList<>());
        // 값 넣기
        for(int[] edge : edges) {
            list.get(edge[0]).add(edge[1]);
        }

        //출력
        for (int i = 1; i < list.size(); i++) {
            for(int j = 0 ; j < list.get(i).size(); j++)
                System.out.print(list.get(i).get(j)+" ");
            System.out.println();
        }
        Queue<Integer> q = new LinkedList<>();

        //q.add(list.get(0).get(j));
        // 3,2 들어간 상태
        //3 빼줘
        //3과연결된 노드를 넣어줘 264 2// 그러나 해당 자료구조는 중복을 허용하함 2가 또 들어감
        //




        //최장거리 노드의 갯수가 몇개인지 구하기
        return answer;
    }


}
