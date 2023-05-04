package binary_search_tree;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    @Override
    public void postorder() {
       postorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    protected  void postorder(TreeNode<E> root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }
    protected boolean delete(E e) {
        TreeNode<E> current = root;
        TreeNode<E> parent = null;
        boolean isLeftChild = false;

        // Search for the node containing the element to be deleted
        while (current != null && !current.element.equals(e)) {
            parent = current;

            if (e.compareTo(current.element) < 0) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }

        // If the element is not found, return true
        if (current == null) {
            return true;
        }

        // Case 1: The node to be deleted has no left child
        if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        // Case 2: The node to be deleted has a left child
        else {
            TreeNode<E> rightmost = current.left;
            TreeNode<E> parentOfRightmost = current;

            while (rightmost.right != null) {
                parentOfRightmost = rightmost;
                rightmost = rightmost.right;
            }

            current.element = rightmost.element;

            if (parentOfRightmost == current) {
                parentOfRightmost.left = rightmost.left;
            } else {
                parentOfRightmost.right = rightmost.left;
            }
        }

        return true; // Element deleted
    }



}
