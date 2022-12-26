package algos;

import structurs.Stack.CustomStack;

/**
 * Обход дерева в глубину, если изменить стек на очередь - то в ширину
 */

public class TreeSolution {
    public static void main(String[] args) {

        Tree root = new Tree(20,
                new Tree(7,
                        new Tree(4, null, new Tree(6)), new Tree(9)),
                new Tree(35,
                        new Tree(31, new Tree(28), null),
                        new Tree(40, new Tree(38), new Tree(52))));
        System.out.println(root.sumDeep());
    }

    private static class Tree {
        Tree right;
        Tree left;
        int value;

        public Tree(int value, Tree right, Tree left) {
            this.right = right;
            this.left = left;
            this.value = value;
        }

        public Tree(int value) {
            this.value = value;
        }

        public int sum() {
            int result = value;
            if (left != null) {
                result += left.sum();
            }
            if (right != null) {
                result += right.sum();
            }
            return result;
        }

        public int sumDeep() {
            CustomStack<Tree> stack = new CustomStack<>();
            stack.push(this);
            int sum = 0;
            while (!stack.isEmpty()) {
                Tree node = stack.pop();
                sum += node.value;
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
            return sum;
        }
    }
}
