package main;

class Node {
	 
    int data;
    Node left, right;
 
    Node(int val)
    {
        data = val;
        left = right = null;
    }
}

public class BinarySearchTree {

	public Node root;
	
	public BinarySearchTree() 
	{ 
		root = null; 
	}
	
    public void insert(int key) 
    { 
    	root = insertRecord(root, key);
    }


    Node insertRecord(Node root, int data)
    {
 
        
        if (root == null) {
            root = new Node(data);
            return root;
        }
 
        
        if (data < root.data)
            root.left = insertRecord(root.left, data);
        else if (data > root.data)
            root.right = insertRecord(root.right, data);
 
        return root;
    }
    
    public boolean isPairPresent(Node root, Node temp, int target)
    {
        if (temp == null)
            return false;
 
        return search(root, temp, target - temp.data)
            || isPairPresent(root, temp.left, target)
            || isPairPresent(root, temp.right, target);
    }
    
    boolean search(Node root, Node temp, int k)
    {
 
        if (root == null)
            return false;
 
        Node currRoot = root;
        boolean flag = false;
        while (currRoot != null && flag != true) {
            if (currRoot.data == k && temp != currRoot) {
                flag = true;
                System.out.println("Pair is : "  + currRoot.data
                                   + " + " + temp.data);
                return true;
            }
            else if (k < currRoot.data)
            	currRoot = currRoot.left;
            else
            	currRoot = currRoot.right;
        }
 
        return false;
    }

}
