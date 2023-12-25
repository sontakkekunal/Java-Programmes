import java.util.Scanner;
class Node{
	Node next=null;
	int data;
	Node(int data){
		this.data=data;
	}
}
class CircularQueueInLL{
	Node front=null;
	Node rear=null;
	int maxSize;
	CircularQueueInLL(int size){
		maxSize=size;
	}
	CircularQueueInLL(){
		maxSize=2048;
	}
	int countNode(){
		if(front==null)
			return 0;
		else if(front==rear){
			return 1;
		}
		else{
			int count=1;
			Node temp=front.next;
			while(temp!=front){
				count++;
				temp=temp.next;
			}
			return count;
		}
	}
	void enqueue(int data){
		Node newNode = new Node(data);
		if(front==null){
			front=newNode;
			front.next=front;
			rear=front;
		}
		else if(countNode()==maxSize){
			System.out.println("Queue Linked list is full");
		}
		else {
			if(front==rear){
				front.next=newNode;
				newNode.next=front;
				rear= newNode;
			}
			else{
				rear.next=newNode;
				newNode.next=front;
				rear= newNode;
			}
		}
	}
	int dequeue(){
		if(front==null){
			System.out.println("Queue LL is empty");
			return -1;
		}
		else if(front==rear){
			int val=front.data;
			front=null;
			rear=null;
			return val;
		}
		else{
			int val=front.data;
			front=front.next;
			rear.next=front;
			return val;
		}
	}
	void printQueueLL(){
		if(front==null){
                        System.out.println("Queue LL is empty");
                        return ;
                }
		else{
			Node temp=front;
			System.out.println("Queue LL is: ");
			System.out.print("[ ");
			while(temp.next!=front){
				System.out.print(temp.data+" , ");
				temp=temp.next;
			}
			System.out.println(temp.data+" ]");
		}
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("do you want sized circular queue or unsized circular queue:\n1.sized\n2.Unsized");
		int choice1=sc.nextInt();
		CircularQueueInLL cq=null;
		if(choice1==1){
			System.out.println("Enter size of the queue: ");
			int size=sc.nextInt();
			cq = new CircularQueueInLL(size);
		}
		else if(choice1==2){
			cq = new CircularQueueInLL();
		}
		else{
			System.out.println("Inavild choice");
			System.exit(0);
		}
		char ch;
		do{
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.printCirculayQueue");
			System.out.println("4.countNode");
			System.out.println("Enter above choice 1/2/3/4: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data: ");
					int data=sc.nextInt();
					cq.enqueue(data);
					break;
				case 2:
					int val=cq.dequeue();
					if(val!=-1)
						System.out.println("Node deleted is: "+val);
					break;
				case 3:
					cq.printQueueLL();
					break;
				case 4:
					System.out.println("Number of element in queue is: "+cq.countNode());
					break;
				default:
					System.out.println("Please enter vaild choice");
					break;
			}
			System.out.println("Do you want to continue? ");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
	}
}

		
