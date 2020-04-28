package medium;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointers {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node recDeepCopy(Node node, Map map){
        if (node == null)
            return null;
        Node new_node = new Node(node.val);
        map.put(node, new_node);
        new_node.next = recDeepCopy(node.next, map);
        new_node.random = (Node)map.get(node.random);
        return new_node;
    }
    public Node copyRandomList(Node node){
        Map<Node, Node> map = new HashMap<>();
        return recDeepCopy(node, map);
    }
}
