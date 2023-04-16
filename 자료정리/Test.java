package Main.자료정리;

public class Test {
    public static void main(String[] args) {
        //큐 테스트
//        Quque<Integer> q = new Quque<Integer>();
//        q.add(1);
//        q.add(2);
//        q.add(13);
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        q.add(8);
//        System.out.println(q.peek());
//        System.out.println(q.isEmpty());
//        System.out.println(q.remove());
//        System.out.println(q.isEmpty());

        // 그래프테스트
        Graph g = new Graph(9);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(5,6);
        g.addEdge(5,7);
        g.addEdge(6,8);
        g.dfs();
    }
}
