package Tree;

public class TreeTraversal {
	//前序遍历
	public void preOrder(TreeNode root){
		if(root==null){
			return;
		}
		System.out.print(root.getValue());
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	//中序遍历
	public void inOrder(TreeNode root){
		if(root==null){
			return;
		}
		inOrder(root.getLeft());
		System.out.print(root.getValue());
		inOrder(root.getRight());
	}
	
	//后续遍历
	public void postOrder(TreeNode root){
		if(root==null){
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getValue());
	}
	
	public static void main(String[] args) {
		TreeCreator treeCreator=new TreeCreator();
		TreeNode root=treeCreator.createSampleTree();
		TreeTraversal treeTraversal=new TreeTraversal();
		treeTraversal.preOrder(root);
		System.out.println();
		treeTraversal.inOrder(root);
		System.out.println();
		treeTraversal.postOrder(root);
	}
}
