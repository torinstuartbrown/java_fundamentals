package labs_examples.datastructures.trees.labs;


import labs_examples.datastructures.trees.examples.CustomBinarySearchTree;

public class TorinsCustomTree {

    Node root;
    int size;

    public static void main(String[] args) {

    }

    TorinsCustomTree(int... data) {
        if (data.length < 1) {
            root = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                insert(data[i]);
            }
        }
    }

    public void insert(int data) {

        if (root == null) {
            root = new Node(data);
            size++;
        } else {
            insert(data, root);
        }
    }

    public Node insert(int data, Node node) {
        if (node == null) {
            node = new Node(data);
            size++;
        }
        if (data < node.data) {
            node.leftChild = insert(data, node.leftChild);
        } else if (data > node.data) {
            node.rightChild = insert(data, node.rightChild);
        } else {
            return node;
        }

        return reblanceInsert(node, data);
    }

    private Node reblanceInsert(Node node, int data) {

        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);

        node.height = 1 + Math.max(leftHeight, rightHeight);
        int balanceFactor = leftHeight - rightHeight;
        if (balanceFactor > 1 && data < node.leftChild.data) {
            return rotateRight(node);
        }
        if (balanceFactor < -1 && data > node.rightChild.data) {
            return rotateLeft(node);
        }
        if (balanceFactor > 1 && data > node.rightChild.data) {
            return rotateRight(node);
        }
        if (balanceFactor < -1 && data < node.rightChild.data) {
            node.rightChild = rotateRight(node.rightChild);
            return rotateLeft(node);
        }
        return node;

    }

    private Node rotateRight(Node node) {
        Node child = node.leftChild;
        Node formerRightChild = child.rightChild;
        child.rightChild = node;
        node.leftChild = formerRightChild;

        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);
        node.height = 1 + Math.max(leftHeight, rightHeight);
        node = child;
        return node;
    }

    private Node rotateLeft(Node node) {
        Node child = node.rightChild;
        Node grandchild = child.leftChild;
        child.leftChild = node;
        node.rightChild = grandchild;
        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);
        leftHeight = height(child.leftChild);
        rightHeight = height(child.rightChild);
        child.height = 1 + Math.max(leftHeight, rightHeight);

        node = child;
        return node;
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public Node remove(int target, Node node) {
        if (target < node.data) {
            node.leftChild = remove(target, node.leftChild);
        } else if (target < node.data) {
            if (target < node.data) {
                node.leftChild = remove(target, node.leftChild);
            } else if (target > node.data) {
                node.rightChild = remove(target, node.rightChild);
            } else {
                if (node.leftChild == null && node.rightChild == null) {
                    size--;
                    return null;
                } else if (node.leftChild == null) {
                    size--;
                    return node.rightChild;
                } else if (node.rightChild == null) {
                    size--;
                    return node.leftChild;
                } else {
                    Node smallest = node.rightChild;
                    while (smallest.leftChild != null) {
                        smallest = smallest.leftChild;
                    }
                    int temp = node.data;
                    node.data = smallest.data;
                    smallest.data = temp;

                    node.rightChild = remove(target, node.rightChild);
                }
            }

        }
        return rebalanceRemove(node);
    }

    private Node rebalanceRemove(Node node) {
        int leftHeight = height(node.leftChild);
        int rightHeight = height(node.rightChild);
        node.height = 1 + Math.max(leftHeight, rightHeight);

        node.height = 1 + Math.max(leftHeight, rightHeight);

        int balanceFactor = leftHeight - rightHeight;

        leftHeight = 0;
        rightHeight = 0;
        if (node.leftChild != null) {
            leftHeight = height(node.leftChild);
            rightHeight = height(node.rightChild);
        }
        int balanceLeft = leftHeight - rightHeight;

        leftHeight = 0;
        rightHeight = 0;
        if (node.rightChild != null) {
            leftHeight = height(node.rightChild.leftChild);
            rightHeight = height(node.rightChild.rightChild);
        }
        int balanceRight = leftHeight - rightHeight;
        if (balanceFactor > 1 && balanceLeft < 0) {
            node.leftChild = rotateLeft(node.leftChild);
            return rotateRight(node);
        }
        if (balanceFactor < -1 && balanceRight <= 0) {
            node = rotateLeft(node);
            return node;
        }
        if (balanceFactor < -1 && balanceRight > 0) {
            node.rightChild = rotateRight(node.rightChild);
            return rotateLeft(node);
        }

        return node;

    }

    boolean search(int target) {

        return search(target, root);
    }

    boolean search(int target, Node node) {
        if (node != null) {
            if (node.data == target) {
                // target found - return true - it does exist
                return true;
            }
            // follow the leftChild branch
            else if (target < node.data) {
                return search(target, node.leftChild);
            }
            else if (target > node.data) {
                return search(target, node.rightChild);
            }
        }
        return false;
    }


    public void printInorderRecursive(Node node) {
        if (node == null)
            return;

        printInorderRecursive(node.leftChild);
        System.out.print(node.data + " ");
        printInorderRecursive(node.rightChild);
    }

    public void printPreorderRecursive(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        printPreorderRecursive(node.leftChild);
        printPreorderRecursive(node.rightChild);
    }

    public void printPostorderRecursive(Node node) {
        if (node == null)
            return;
        printPostorderRecursive(node.leftChild);
        printPostorderRecursive(node.rightChild);
        System.out.print(node.data + " ");
    }

    public Node lowestCommonAncestor (int value1, int value2) {
        Node n = root;

        while (n != null) {
            if (n.data < value1 && n.data < value2) {
                n = n.rightChild;
            }
            else if (n.data > value1 && n.data > value2) {
                n = n.leftChild;
            }
            else {
                return n;
            }
        }

        return null;
    }

    public boolean isBalanced() {
        int balanceFactor = height(root.leftChild) - height(root.rightChild);
        return Math.abs(balanceFactor) <= 1;
    }



    public class Node {
        Node leftChild;
        Node rightChild;
        int data;
        int height;

        Node (int data) {
            this.data = data;
            this.height = 1;
        }

    }

}
