package study.lc.nary;

import java.util.ArrayList;

public class MaxDepth {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children.size() == 0) return 1;

        int max = 0;
        for (Node child: root.children) {
            max = Math.max(max, findMaximumDepthIter(root));
        }

        return max;
    }

    private int helper(Node root) {
        if (root == null) return 0;

        int max = 0;
        for (Node child: root.children) {
            max = Math.max(max, helper(root));
        }

        return max + 1;
    }

    public int findMaximumDepthIter(Node node) {
        if (node == null) return 0;
        ArrayList<Node> current = new ArrayList<>();
        ArrayList<Node> children = new ArrayList<>();
        int result = 1;
        current.add(node);

        while(true) {
            while(current.size() != 0) {
                Node tmp = current.remove(0);
                for (Node item: tmp.children) {
                    children.add(item);
                }
            }

            if (children.size() == 0) break;
            current = children;
            children = new ArrayList<>();
            result++;
        }


        return result;
    }
}
