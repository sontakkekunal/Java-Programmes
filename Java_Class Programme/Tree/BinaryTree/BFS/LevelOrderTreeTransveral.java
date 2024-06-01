import java.util.Scanner;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;
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
class LevelOrderTreeTransversal{
	Scanner sc = new Scanner(System.in);
	int index=-1;
	Node contructBT(){
		System.out.println("Enter the data to create a node: ");
		int data=sc.nextInt();
		Node newNode = new Node(data);
		System.out.println("Do you want to node at left for node "+data+" ?");
		char leftDec=sc.next().charAt(0);
		if(leftDec=='y' || leftDec=='Y')
			newNode.left=contructBT();
		System.out.println("Do you want node at right for node "+data+" ?");
		char rightDec=sc.next().charAt(0);
		if(rightDec=='y' || rightDec=='Y')
			newNode.right=contructBT();
		return newNode;
	}

	Node constructBTByArr(int[] nodes){
		index++;
		if(nodes[index]==-1)
			return null;
		Node newNode = new Node(nodes[index]);
		newNode.left=constructBTByArr(nodes);
		newNode.right=constructBTByArr(nodes);
		return newNode;
	}

	void levelOrderInSingleLine(Node root){
		if(root==null){
			System.out.println("pleae define tree before printing");
			return;
		}
		Queue<Node> que= new LinkedList<>();
		que.add(root);
		System.out.println("BFS level-order single line tranversal: ");
		while(!que.isEmpty()){
			Node node=que.remove();
			System.out.print(node.data+" ");
			if(node.left!=null)
				que.add(node.left);
			if(node.right!=null)
				que.add(node.right);
		}
		System.out.println();
	}

	void levelOrderInLevelLine(Node root){
		if(root==null){
			System.out.println("Please define the tree before printing");
			return;
		}
		Queue<Node> que= new LinkedList<Node>();
		System.out.println("BFS Level-order level line tranversal: ");
		que.add(root);
		que.add(null);
		while(!que.isEmpty()){
			Node node=que.remove();
			if(node==null){
				System.out.println();
				if(!que.isEmpty())
					que.add(null);
			}
			else{
				System.out.print(node.data+"  ");
				if(node.left!=null)
					que.add(node.left);
				if(node.right!=null)
					que.add(node.right);
			}
		}
	}

	Node contructBTM2(){
		System.out.println("Enter the data to create a node: ");
		int data=sc.nextInt();
		System.out.println("Do you want to node at left for node "+data+" ?");
		char leftDec=sc.next().charAt(0);
		Node temp1=null;
		if(leftDec=='y' || leftDec=='Y')
			temp1=contructBTM2();
		System.out.println("Do you want node at right for node "+data+" ?");
		char rightDec=sc.next().charAt(0);
		Node temp2=null;
		if(rightDec=='y' || rightDec=='Y')
			temp2=contructBTM2();
		return new Node(data,temp1,temp2);
	}

	Node constructBTByList(List<Integer> arr){
		index++;
		if(arr.get(index)==-1)
			return null;
		int data=arr.get(index);
		Node temp1=constructBTByList(arr);
		Node temp2=constructBTByList(arr);
		return new Node(data,temp1,temp2);
	}

	public static void main(String [] args){
		LevelOrderTreeTransversal lott= new LevelOrderTreeTransversal();
		char ask;
		Node root=null;
		do{
			System.out.println("Choose the following: ");
			System.out.println("1.constructBT");
			System.out.println("2.contructBTByArr");
			System.out.println("3.levelOrderBFS_M1");
			System.out.println("4.levelOrdeBFS_M2");
			System.out.println("5.constructBT_m2");
			System.out.println("6.constructBTByList");
			System.out.println("Enter (1/2/3/4/5/6): ");
			int choice=lott.sc.nextInt();
			switch(choice){
				case 1:
					boolean val1=false;
					if(root==null)
						val1=true;
					root=lott.contructBT();
					if(val1)
						System.out.println("Tree created succesfully");
					else
						System.out.println("Tree replaced successfully");
					break;
				case 2:
					boolean val2=false;
					if(root==null)
						val2=true;
					lott.index=-1;
					System.out.println("Enter size of arr: ");
					int size=lott.sc.nextInt();
					int arr[]= new int[size];
					System.out.println("Enter array: ");
					for(int i=0;i<arr.length;i++){
						arr[i]=lott.sc.nextInt();
					}
					root=lott.constructBTByArr(arr);
					if(val2)
						System.out.println("Tree created successfully");
					else
						System.out.println("Tree replaces successfully");
					break;
				case 3:
					lott.levelOrderInSingleLine(root);
					break;
				case 4:
					lott.levelOrderInLevelLine(root);
					break;
				case 5:
				    	boolean val3=false;
					if(root==null)
						val3=true;
					root=lott.contructBTM2();
					if(val3)
						System.out.println("Tree created succesfully");
					else
						System.out.println("Tree replaced successfully");	
					break;
				case 6:
				    	boolean val4=false;
					if(root==null)
						val4=true;
					List<Integer> arrList= new LinkedList<>();
					char ch;
					do{
						System.out.println("Enter data: ");
						arrList.add(lott.sc.nextInt());
						System.out.println("do you want to enter more data?(y/n)");
						ch=lott.sc.next().charAt(0);
					}
					while(ch=='y' || ch=='Y');
					root=lott.constructBTByList(arrList);
					if(val4)
						System.out.println("Tree created succesfully");
					else
						System.out.println("Tree replaced successfully");
					break;
				default:
					System.out.println("Plesae enter valid choice");
					break;
			}
			System.out.println("do you want to continue?(y/n)");
			ask=lott.sc.next().charAt(0);
		}
		while(ask=='y' || ask=='Y');
	}
}
