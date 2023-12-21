import java.util.Scanner;
class Node{
	Node next=null;
	int data;
	Node(int data){
		this.data=data;
	}
}
class Queue{
	Node front=null;
	Node rear=null;
	void enqueue(int data){
		Node newNode = new Node(data);
		if(front==null){
			front=newNode;
			rear=newNode;
		}
		else{
			rear.next=newNode;
			rear= newNode;
		}
	}
	int dequeue(){
		if(front==null){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			int val=front.data;
			front=front.next;
			if(rear.next==front){
				front=null;
				rear=null;
				System.out.println("Queue reseted ");
			}
			return val;
		}
	}
	boolean empty(){
		if(front==null)
			return true;
		else
			return false;
	}
	int front(){
		if(front==null){
			System.out.println("Queue is empty");
                        return -1;
                }
                else{
			return front.data;
		}
	}
	int rear(){
		if(rear==null){
			System.out.println("Queue is empty");
                        return -1;
                }
                else{
			return rear.data;
		}
	}
	void printQueue(){
		if(rear==null){
                        System.out.println("Queue is empty");
                        return ;
                }
		Node temp=front;
		System.out.println("Queue is: ");
		System.out.print("[ ");
		while(temp.next!=null){
			System.out.print(temp.data+" , ");
			temp=temp.next;
		}
		System.out.println(temp.data+" ]");
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		Queue q= new Queue();
		System.out.println("Queue created successfully of size: ");
		char ch;
		do{
			System.out.println("Choose any below operation on queue: ");
			System.out.println("1.enqueue");//void
			System.out.println("2.dequeue");//int
			System.out.println("3.empty");//boolean
			System.out.println("4.front");//int
			System.out.println("5.rear");//int
			System.out.println("6.printQueue");//void
			System.out.println("Enter any above choice 1/2/3/4/5/6: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data: ");
					int data=sc.nextInt();
					q.enqueue(data);
					break;
				case 2:
					int val=q.dequeue();
					if(val!=-1)
						System.out.println("element deleted: "+val);
                                        break;
				case 3:
					if(q.empty())
						System.out.println("Queue is empty");
					else
						System.out.println("Queue is not empty");
                                        break;
				case 4:
					int val1=q.front();
					if(val1!=-1)
						System.out.println("front is : "+val1);
                                        break;
				case 5:
					int val2=q.rear();
					if(val2!=-1)
						System.out.println("rear is: "+val2);
                                        break;
				case 6:
					q.printQueue();
                                        break;
				default:
					System.out.println("please enter valid ");
					break;
			}
			System.out.println("Do you want to continue? ");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
	}
}
