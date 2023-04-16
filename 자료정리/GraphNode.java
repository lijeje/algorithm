package Main.자료정리;

import java.util.LinkedList;

public class GraphNode {
    public int data;
    public LinkedList<GraphNode> adjacent; //인접한 노드
    public boolean marked;//방문여부

    GraphNode (int data){
        this.data = data;
        this.marked = false;
        adjacent =  new LinkedList<GraphNode>();
    }


}
