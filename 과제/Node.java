package Main.과제;

public class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public void setRight(Node right){
        this.right = right;
    }

    public int getData(){
        return data;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }
}
