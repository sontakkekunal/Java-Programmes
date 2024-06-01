import java.util.Scanner;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
	Node(int data,Node left,Node right){
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
class BinaryTreeConstruct{
	Scanner sc= new Scanner(System.in);
	Node constructBT(){
		System.out.println("Enter data to create node: ");
		int data=sc.nextInt();
		Node newNode= new Node(data);
		System.out.println("Do you want node at left for Node "+newNode.data+" ?(y/n)");
		char leftDec=sc.next().charAt(0);
		if(leftDec=='y' || leftDec=='Y')
			newNode.left=constructBT();
		System.out.println("Do you want node at right for Node "+newNode.data+" ?(y/n)");
		char rightDec=sc.next().charAt(0);
		if(rightDec=='y' || rightDec=='Y')
			newNode.right=constructBT();
		return newNode;

	}
	void preOrderDFS(Node root){
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrderDFS(root.left);
		preOrderDFS(root.right);
	}
	void inOrderDFS(Node root){
		if(root==null)
			return;
		inOrderDFS(root.left);
		System.out.print(root.data);
		inOrderDFS(root.right);
	}
	void postOrderDFS(Node root){
		if(root==null)
			return;
		postOrderDFS(root.left);
		postOrderDFS(root.right);
		System.out.print(root.data);
	}
	public static void main(String[] args){
		Node root =null;
		BinaryTreeConstruct bt= new BinaryTreeConstruct();
		char ch;
		do{
			System.out.println("Choose one of the folloing: ");
			System.out.println("1.constructBT ");
			System.out.println("2.preOrderDFS ");
			System.out.println("3.inOrderDFS");
			System.out.println("4.postOrderDFS");
			System.out.println("Enter (1/2/3/4): ");
			int choice=bt.sc.nextInt();
			switch(choice){
				case 1:
					root=bt.constructBT();
					break;
				case 2:
					if(root!=null){
						bt.preOrderDFS(root);
						System.out.println();
					}
					else{
						System.out.println("Please constrcut the tree before printing");
					}
					break;
				case 3:
					if(root!=null){
						bt.inOrderDFS(root);
						System.out.println();
					}
					else{
						System.out.println("Please constrcut the tree before printing");
					}
					
					break;
				case 4:
					if(root!=null){
						bt.postOrderDFS(root);
						System.out.println();
					}
					else{
						System.out.println("Please constrct the Binary tree befor printing");
					}
					break;
				default:
					System.out.println("Invaild choice");
					break;
			}
			System.out.println("Do you want to continue?(y/n) ");
			ch=bt.sc.next().charAt(0);
		}
		while(ch=='Y' || ch=='y');
	}
}

