package JavaInterviewQ;

import java.util.Arrays;
import java.util.List;

public class vvDelelateParnChieldChildRelationShip51 {
    //Detect Cycles in a Graph-Like Structure
    //Question: Detect cycles in a list of parent-child relationships.
    public static void main(String[] args) {
        List<Node> nodes = Arrays.asList(
                new Node(1, 0), new Node(2, 1), new Node(3, 2), new Node(4, 3), new Node(5,6));
        boolean hasCycle = nodes.stream()
                .anyMatch(node ->
                        nodes.stream()
                                .filter(n -> n.id == node.parentId)
                                .anyMatch(parent -> parent.parentId == node.id)
                );

        System.out.println(hasCycle);

    }
}
class Node {
    int id;
    int parentId;

    Node(int id, int parentId) {
        this.id = id;
        this.parentId = parentId;
    }
}