package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeDeserialize {

    //https://leetcode.com/explore/featured/card/google/65/design-4/3092/
    private String serialize(TreeNode root, String result) {
        if (root == null) {
            result += "null,";
        } else {
            result += root.val + ",";
            result = serialize(root.left, result);
            result = serialize(root.right, result);
        }

        return result;
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return serialize(root, "");
    }

    public TreeNode deserialize(List<String> l) {
        if (l.get(0).equals("null")) {
            l.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.left = deserialize(l);
        root.right = deserialize(l);

        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        return deserialize(new ArrayList<>(Arrays.asList(nodes)));
    }
}
