package Main.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindCenterOfStarGraph1791 {
    public static void main(String[] args) {
        FindCenterOfStarGraph1791 main = new FindCenterOfStarGraph1791();
        int[][] edges = {{1,2},{2,3},{4,2}};
        int[][] edges2 = {{3,1},{3,2},{3,3}};
        int center = main.findCenter(edges2);
    }

    //메모리를 최악으로 쓰고 시간도 오래걸리는 아주 나쁜 방법
    public int findCenter(int[][] edges){
        Map map = new HashMap<Integer,Integer>();

        System.out.println(edges[1][0]);
        for(int i =0;i< edges.length;i++){
            //1열
            if(map.containsKey(edges[i][0])){
                map.replace(edges[i][0], (Integer)map.get(edges[i][0])+1);
            }else{
                map.put(edges[i][0],1);
            }
            //2얼
            if(map.containsKey(edges[i][1])){
                map.replace(edges[i][1], (Integer)map.get(edges[i][1])+1);
            }else{
                map.put(edges[i][1],1);
            }

        }

        Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        };


        // Max Value의 key, value
        Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), comparator);

        return maxEntry.getKey();
    }
}
