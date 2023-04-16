package Main.자료정리;

import java.util.NoSuchElementException;

//BFS에 필요

public class Quque<T> { //T - 객체를 만들 때 데이터 타입을 명시해줌

//    class Node<T> {
//        private T data;
//        private Node<T> next; // 다음노드 생성
//
//        public Node(T data){
//            this.data =  data; //생성자에서 데이터를 받아서 내부변수에 저장
//        }
//    }
    //두개의 멤버변수 선언
    private QueueNode<T> first;
    private QueueNode<T> last;

    //함수구현
   public void add(T item){
       QueueNode<T> t =  new QueueNode<T>(item); //T타입의 아이템을 받아 노드를 생성
       if (last !=  null){ //마지막노드가 있으면
           last.next = t; //뒤에 새로 생성한 노드를 붙이고
       }
       last =  t;
       if(first == null) { // 데이터가 없을때는
           first = last;//같은 값을 할당
       }
   }

   public T remove(){
       if(first == null) { //큐 비었으면 익셉션에러
           throw new NoSuchElementException();
       }

       T data = first.data; // 데이터 반환 전에 다음주소를 first로 만들어줘야하므로 데이터를 백업
       first = first.next; // first를 다음주소로 바꿔줌

       if(first ==  null){
           last = null;//삭제니까 last도 변경해줘야 함.
       }
       return data;
   }

   public T peek() {
       if(first == null){//큐 비었으면 익셉션에러
           throw new NoSuchElementException();
       }
       return first.data; //null아니면 first의 데이터를 반화ㅏㄴ
   }

   public boolean isEmpty(){
       return first == null;
   }
}
