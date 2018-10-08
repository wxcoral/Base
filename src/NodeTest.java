import java.util.ArrayList;
import java.util.List;

class Node{
	private Node root;
	private Node left;
	private Node right;
	private Object data;
	private List<Node> nodes;//存储所有的节点
	
	public Node(Node left,Node right,Object data) {
		this.left=left;
		this.right=right;
		this.data=data;
	}
	
	public Node(Object data) {
		this(null,null,data);
	}
	
	public Node() {
		super();
	}
	
	//创建树
	public void createTree(Object[] objs){
		nodes=new ArrayList<Node>();
		for (Object object : objs) {
			nodes.add(new Node(object));
		}
		root=nodes.get(0);
		for(int i=0;i<objs.length/2;i++){
			nodes.get(i).left=nodes.get(i*2+1);
			if(i*2+2<objs.length){
				nodes.get(i).right=nodes.get(i*2+2);
			}
		}
		
	}
	
	public void visit(Object data){
		System.out.print(data);
	}
	
	
	public Node getRoot() {
		return root;
	}

	//前序遍历
	public void preOrder(Node root){
		if(root!=null){
			visit(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	//中序遍历
	public void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			visit(root.data);
			inOrder(root.right);
		}
	}
	
	//中序遍历
	public void afterOrder(Node root){
		if(root!=null){
			afterOrder(root.left);
			afterOrder(root.right);
			visit(root.data);
		}
	}
	
	
}

public class NodeTest{
	public static void main(String[] args) {
		Node node=new Node();
		node.createTree(new Object[]{1,2,3,4,5,6,7});
		//node.preOrder(node.getRoot());
		node.inOrder(node.getRoot());
		//node.afterOrder(node.getRoot());
	}
	
}
