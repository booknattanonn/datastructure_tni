package java;

public class TreeApp {
	public static void main(String[] args) {
		System.out.println("------------------------------");
		System.out.println("Binary Tree from creatTree1()");
		System.out.println("-------------------------------");
		
		BinaryTree tree = new BinaryTree();
		tree.createTree1();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree from creatTree2()");
		System.out.println("-------------------------------");
		
		BinaryTree tree2 = new BinaryTree();
		tree.createTree2();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("------------------------------");
		System.out.println("Binary Tree from creatTree3()");
		System.out.println("-------------------------------");
		
		BinaryTree tree3 = new BinaryTree();
		tree.createTree3();
		tree.printTree(tree.getRoot(), 0);
		
	}

}
