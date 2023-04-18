package Main.programmers;

import Main.자료정리.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class 가장먼노드 {
    // 트리는 그래프의 한 종류이다.
    // 트리에서 최단거리를 구할 때 BFS를 사용했다. -> BFS를 사용해보자
    // BFS를 사용할때는 Queue를 이용하여 구현한다.
    public ArrayList<Integer>[] graph;
    public boolean[] visited;
    public int[] distance;

    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        가장먼노드 fN = new 가장먼노드();
        fN.solution(n,edge);
    }

    public int solution(int n, int[][] edge) {
        int answer = 0;
        //최장거리를 구하고
        ArrayList list =  new ArrayList<>();
        list.add(1,3);
        list.add(1,2);

        System.out.println(list);


        //최장거리 노드의 갯수가 몇개인지 구하기
        return answer;
    }

}
