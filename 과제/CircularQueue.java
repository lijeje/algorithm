package Main.과제;

import java.util.LinkedList;
import java.util.Queue;

/*원형큐
 특징 : 선형큐의 단점을 보완한 큐.
 큐의 크기가 프론트가 되면 데이터를 다시 앞으로 보냄.
*/
public class CircularQueue {
    private static Queue<Integer> linkedQueue;

    public static void main(String[] args) {
        linkedQueue  = new LinkedList<>();
        linkedQueue  = addLinkedQueue();
        linkedQueue = offerLinkedQueue();
        //linkedQueue  = removeLinkedQueue();
        linkedQueue =  pollLinkedQueue();
        linkedQueue = peekLinkedQueue();

        System.out.println(linkedQueue);
    }

    public static Queue<Integer> addLinkedQueue() {
        //추가할 수 없는 상황에서 에러를 발생시킴.
        linkedQueue.add(1);
        linkedQueue.add(2);
        linkedQueue.add(3);
        return linkedQueue;
    }

    public static Queue<Integer> offerLinkedQueue() {
        //추가 성공 시 ture,  실패시 false 반환
        linkedQueue.offer(1);
        linkedQueue.offer(2);
        linkedQueue.offer(3);
        //linkedQueue.offer("test");  //java: incompatible types: java.lang.String cannot be converted to java.lang.Integer에러 발
        //linkedQueue.offer(null);//[1, 2, 3, 1, 3, 4, null] 생성
        return linkedQueue;
    }

    public static Queue<Integer> removeLinkedQueue(){
        //원소를 삭제하고 리턴. remove는 Queue가 비어있을 때 NoSuchElementException발생
        linkedQueue.remove();
        linkedQueue.remove();
        return linkedQueue;
    }

    public static Queue<Integer> pollLinkedQueue(){
        //원소를 삭제하고 리턴. 삭제 실패시 리턴값 []
        linkedQueue.poll();
        linkedQueue.poll();
        return linkedQueue;
    }

    public static Queue<Integer> peekLinkedQueue(){
        //원소를 삭제하지 않고 값만 리턴
        int peekNum = linkedQueue.element();
        System.out.println("peek Number is :"+peekNum);
        return linkedQueue;
    }

}
