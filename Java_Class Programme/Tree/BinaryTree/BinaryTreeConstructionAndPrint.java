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
	public static void main(String[] args){
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
					System.out.println();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
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

