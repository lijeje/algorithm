package Main.과제;


import java.util.Comparator;

public class BinaryTree {
    // 클래스 및 생성자 구성
    // 기반 데이터를 저장하늠 방식
    public Node root;
    public int size;

    public void addNode(int data){
        Node node = new Node(data);
        if(root == null){
            root = node;
        }

        Node currentNode = root;
        if (data < currentNode.getData()) {
            currentNode = currentNode.getLeft();
            if(currentNode == null) {
                currentNode.setLeft(node);
            }
        } else {
            currentNode = currentNode.getRight();
            if(currentNode == null){
               currentNode.setRight(node);
            }
        }
    }

    private boolean find(int data){
        Node currentNode = root;

        while(currentNode != null){
            if(currentNode.getData() == data){
                return true;
            } else if(currentNode.getData() < data) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }
        return false;
    }
}
