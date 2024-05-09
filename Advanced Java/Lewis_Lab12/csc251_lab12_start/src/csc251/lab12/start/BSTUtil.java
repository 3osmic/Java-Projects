package csc251.lab12.start;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

import csc251.lab12.start.BST.TreeNode;

public class BSTUtil {
    public static final String EMPTY_STRING = "";
    public static final TreeNode<String> MISSING_NODE = new TreeNode<>("-9999");
    public static final TreeNode<String> SHADOW_NODE = new TreeNode<>("-9999");
    
    public static int getHeightRecursively(TreeNode<String> treeNode) {
        if (treeNode == null) {
            return -1;
        } else {
            return Math.max(getHeightRecursively(treeNode.left), getHeightRecursively(treeNode.right)) + 1;
        }
    }
	
    public static List<List<String>> printTree(TreeNode<String> root) {
        int height = getHeightRecursively(root);
        if (height >= 0) {
            Queue<TreeNode<String>> nodesForNextLevel = null;
            int numberOfRows = height + 1;
            int numberOfCols = (int) Math.pow(2, height + 1) - 1;
            List<List<String>> result = new ArrayList<List<String>>();
            String[] lastRow = null;
            for (int i = 0; i < numberOfRows; i++) {
                String[] currentRow = new String[numberOfCols];
                Queue<TreeNode<String>> tempQueue = new ArrayDeque<>();
                if (i == 0) { // root level, height = 0
                    int mid = numberOfCols / 2;
                    currentRow[mid] = String.valueOf(root.element);
                    tempQueue.add(root.left == null ? MISSING_NODE : root.left);
                    tempQueue.add(root.right == null ? MISSING_NODE: root.right);
                } else {
                    int startIndex = ((int) Math.pow(2, height - i)) - 1;
                    int offset = startIndex + 1;
                    for (int j = startIndex; j < numberOfCols; j = j + offset) {
                        if (lastRow[j] == null) {
                            TreeNode<String> next = nodesForNextLevel.remove();
                            tempQueue.add(next.left == null ? MISSING_NODE : next.left);
                            tempQueue.add(next.right == null ? MISSING_NODE : next.right);
                            currentRow[j] = String.valueOf(next.element);
                        } else {
                            currentRow[j] = String.valueOf(SHADOW_NODE.element);
                        }
                    }
                }

                List<String> normalizedList = Arrays.asList(currentRow).stream()
                        .map(x -> x == null || x.equals("-9999") ? "" : x)
                        .collect(Collectors.toList());
                result.add(normalizedList);
                lastRow = currentRow;
                nodesForNextLevel = tempQueue;
            }
            return result;
        } else {
            return Collections.emptyList();
        }
    }

    public static void printTree2D(TreeNode<String> root) {
        List<List<String>> result = printTree(root);
        for (List<String> l: result) {
            for (String s: l) {
                System.out.print(padding(s, 2));
            }
            System.out.println("\n");
        }
    }

    private static String padding(String s, int n) {
        int paddingSize = n - s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paddingSize; i++) {
            sb.append(" ");
        }
        return sb.toString() + s;
    }

}
