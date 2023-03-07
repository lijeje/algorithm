package Main.과제;


import java.util.Comparator;

public class BinarySearchTree<E>{
    // 클래스 및 생성자 구성
    // 기반 데이터를 저장하늠 방식
    private Node<E> root;
    private int size;

    private final Comparator<? super E> comparator;

    public BinarySearchTree(){
        this(null);
    }

    public BinarySearchTree(Comparator<? super E> comparator){
        this.comparator = comparator;
        this.root = null;
        this.size =0;
    }


}
