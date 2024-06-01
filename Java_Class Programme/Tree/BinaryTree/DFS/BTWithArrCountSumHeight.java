import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
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
class BTWithArrCountSumHeight{
	int index=-1;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	Node constructBT() throws IOException{
		System.out.println("Enter data for node creation: ");
		int data=Integer.parseInt(br.readLine());
		Node newNode = new Node(data);
		System.out.println("Do you want node at left for node "+data+" ?(y/n)");
		char leftDec=br.readLine().charAt(0);
		if(leftDec=='y' || leftDec=='Y')
			newNode.left=constructBT();
		System.out.println("Do you want node at right for node "+data+"?(y/n)");
		char rightDec=br.readLine().charAt(0);
		if(rightDec=='y' || rightDec=='Y')
			newNode.right=constructBT();
		return newNode;
	}
	Node constructBTByArr(int nodes[]){
		index++;
		if(nodes[index]==-1)
			return null;
		Node newNode = new Node(nodes[index]);
		newNode.left=constructBTByArr(nodes);
		newNode.right=constructBTByArr(nodes);
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
		System.out.print(root.data+" ");
		inOrderDFS(root.right);
	}
	void postOrderDFS(Node root){
		if(root==null)
			return;
		postOrderDFS(root.left);
		postOrderDFS(root.right);
		System.out.print(root.data+" ");
	}
	int sumOfNodes(Node root){
		if(root==null)
			return 0;
		int leftSubTreeSum=sumOfNodes(root.left);
		int rightSubTreeSum=sumOfNodes(root.right);
		return leftSubTreeSum+rightSubTreeSum+root.data;
	}
	int countOfNodes(Node root){
		if(root==null)
			return 0;
		int leftSubTreeNodeCnt=countOfNodes(root.left);
		int rightSubTreeNodeCnt=countOfNodes(root.right);
		return leftSubTreeNodeCnt+rightSubTreeNodeCnt+1;
	}
	int heightOfTree(Node root){
		if(root ==null)
			return 0;
		int heightOfLeftSubTree=heightOfTree(root.left);
		int heightOfRightSubTree=heightOfTree(root.right);
		return max(heightOfLeftSubTree,heightOfRightSubTree)+1;
	}
	int max(int leftVal,int rightVal){
		return (leftVal>rightVal)?leftVal:rightVal;
	}
	public static void main(String [] args) throws IOException{
		char ask;
		Node root=null;
		BTWithArrCountSumHeight btm= new BTWithArrCountSumHeight();
		do{
			System.out.println("Choose any following operstion");
			System.out.println("1.constructBT");
			System.out.println("2.constructBTByArr");
			System.out.println("3.preOrderDFS");
			System.out.println("4.inOrderDFS");
			System.out.println("5.postOrderDFS");
			System.out.println("6.countOfNodes");
			System.out.println("7.sumOfNodes");
			System.out.println("8.heightOfTree");
			System.out.println("Enter (1/2/3/4/5/6/7/8: ");
			int choice=Integer.parseInt(btm.br.readLine());
			switch(choice){
				case 1:
					root=btm.constructBT();
					System.out.println("Tree created succesfully");
					break;
				case 2:
					System.out.println("Enter size of array: ");
					int size=Integer.parseInt(btm.br.readLine());
					int arr[]= new int[size];
					System.out.println("Enter array: ");
					for(int i=0;i<arr.length;i++){
						arr[i]=Integer.parseInt(btm.br.readLine());
					}
					btm.index=-1;
					root=btm.constructBTByArr(arr);
					System.out.println("tree created succesfully");
					break;
				case 3:
					if(root!=null){
						System.out.println("preOrder sequence is: ");
						btm.preOrderDFS(root);
						System.out.println();
					}
					else{
						System.out.println("Please define tree first");
					}
					break;
				case 4:
				  	if(root!=null){
						System.out.println("inOrder sequence is: ");
						btm.inOrderDFS(root);
						System.out.println();
					}
					else{
						System.out.println("Please define tree first");
					}
					break;
				case 5:
				  	if(root!=null){
						System.out.println("postOrder sequence is: ");
						btm.postOrderDFS(root);
						System.out.println();
					}
					else{
						System.out.println("Please define tree first");
					}
					break;
				case 6:
					System.out.println("Count of node is: "+btm.countOfNodes(root));
					break;
				case 7:
					System.out.println("Sum of nodes is: "+btm.sumOfNodes(root));
					break;
				case 8:
					System.out.println("Height of tree is: "+btm.heightOfTree(root));
					break;
				default:
					System.out.println("Please enter vaild choic ");
					break;
			}
			System.out.println("Do you want to continue?(y/n)");
			ask=btm.br.readLine().charAt(0);
		}
		while(ask=='y' || ask=='Y');
	}
}

