package Main;

import Main.과제.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BinarayTreeTest {
    BinaryTree binaryTree;

    @BeforeEach
    void beforeEach(){
        binaryTree = new BinaryTree();
        binaryTree.addNode(5);
        binaryTree.addNode(1);
        binaryTree.addNode(2);
        binaryTree.addNode(6);
        binaryTree.addNode(7);
        binaryTree.addNode(10);
        binaryTree.addNode(9);

    }

    @Test
    @DisplayName("객체 추가")
    void insert(){
        //when
        binaryTree.addNode(20);
        binaryTree.addNode(10);
        //then
        //assertThat(insert_20).isTrue();
        //assertThat(insert_dup_10).isFalse();
    }

    @Test
    @DisplayName("전위 순회 ,깊이우선탐색(DFS)")
    void preOrderTravers(){
        //when
        //List<Integer> preOrderTraverse = binaryTree.Traverse(binaryTree.root, BinaryTree.PRE_ORDER_TRAVERSE);
        //then
       // assertThat(preOrderTraverse).isEqualTo(List.of(5, 1, 2, 6, 7, 10, 9));
    }
}
