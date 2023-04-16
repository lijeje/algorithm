package Main.자료정리;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    GraphNode[] nodes;
    Graph(int size){
        nodes = new GraphNode[size];
        for(int i = 0; i<size; i++){
            nodes[i] = new GraphNode(i);
        }
    }
    void addEdge(int i1, int i2) {// 두 노드의 관계를 저장
        GraphNode n1 = nodes[i1];
        GraphNode n2 = nodes[i2];
        //데이터와 인덱스가 같으니 받은 숫자를 인덱스로 사용가능
        if(!n1.adjacent.contains(n2)) { //인접함을 갖는 노드에 상대방이 있는지 확인하고 없으면 서로 추가
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    void dfs(){//dfs그냥 호출시 dfs 0번부터 호출하기
        dfs(0);
    }

    void dfs(int index){ //시작인덱스를 받아 순회결과 출력
        GraphNode root = nodes[index]; //인덱스로 노드를 가져오고
        Stack<GraphNode> stack = new Stack<GraphNode>();
        stack.push(root); //현재노드를 스택에 추가하고
        root.marked = true; //노드가 스텍에 들어있다고 마크
        while (!stack.isEmpty()){
            GraphNode r= stack.pop(); // 스택에서 데이터를 가져오고
            for(GraphNode n : r.adjacent) {
                    if ( n.marked == false){//추가된 적 없는 노드의 경우
                        n.marked = true;
                        stack.push(n);
                    }
                }
                visit(r);//출력
            }
    }




    void visit(GraphNode n ){
        System.out.print(n.data + " ");
    }
}
