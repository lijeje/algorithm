package Main.자료정리;

import java.util.LinkedList;

public class QueueNode<T> {
    public T data;
    public QueueNode<T> next; // 다음노드 생성


    public QueueNode(T data){
        this.data =  data; //생성자에서 데이터를 받아서 내부변수에 저장
    }
}
