package Driver;

import main.BinarySearchTree;

public class Driver {
	public static void main(String[] args)
    {
        BinarySearchTree BStree = new BinarySearchTree();
       
        BStree.insert(40);
        BStree.insert(20);
        BStree.insert(60);
        BStree.insert(10);
        BStree.insert(30);
        BStree.insert(50);
        BStree.insert(70);
 
        boolean isPair
            = BStree.isPairPresent(BStree.root, BStree.root,50);
        if (!isPair)
            System.out.println("No such values are found!");
    }
    


}
