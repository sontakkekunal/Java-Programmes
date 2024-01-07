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
	void pushBack(int data){
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
	void pushFront(int data){
		Node newNode= new Node(data);
		if(front==null){
			front=newNode;
			rear=newNode;
		}
		else{
			newNode.next=front;
			front=newNode;
		}
	}
	int popFront(){
		if(front==null){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			int val=front.data;
			if(rear==front){
				front=null;
				rear=null;
				System.out.println("Queue reseted ");
			}
			else
				front=front.next;
			return val;
		}
	}
	int popBack(){
		if(front==null){
			System.out.println("Queue is empty");
                        return -1;
                }
		else if(rear==front){
			int val=rear.data;
			rear=null;
			front=null;
			System.out.println("Queue reseted ");
			return val;
      	        }
		else{
			int val=rear.data;
			Node temp=front;
			while(temp.next!=rear){
				temp=temp.next;
			}
			rear=temp;
			rear.next=null;
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
	static void inputRestrictedQueue(){
		Scanner sc= new Scanner(System.in);
		Queue q= new Queue();
		System.out.println("Queue created successfully of size: ");
		char ch;
		do{
			System.out.println("Choose any below operation on queue: ");
			System.out.println("1.pushBack");//void
			System.out.println("3.popBack");//int
			System.out.println("4.popFront");//int
			System.out.println("5.empty");//boolean
			System.out.println("6.front");//int
			System.out.println("7.rear");//int
			System.out.println("8.printQueue");//void
			System.out.println("Enter any above choice 1/2/3/4/5/6/7/8/: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data: ");
					int data=sc.nextInt();
					q.pushBack(data);
					break;
				case 3:
					int val=q.popBack();
					if(val!=-1)
						System.out.println("element deleted: "+val);
                                        break;
				case 4:
					int val1=q.popFront();
                                        if(val1!=-1)
                                                System.out.println("element deleted: "+val1);
					break;
				case 5:
					if(q.empty())
						System.out.println("Queue is empty");
					else
						System.out.println("Queue is not empty");
                                        break;
				case 6:
					int val5=q.front();
					if(val5!=-1)
						System.out.println("front is : "+val5);
                                        break;
				case 7:
					int val2=q.rear();
					if(val2!=-1)
						System.out.println("rear is: "+val2);
                                        break;
				case 8:
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
	static void outputRestrictedQueue(){
		Scanner sc= new Scanner(System.in);
		Queue q= new Queue();
		System.out.println("Queue created successfully of size: ");
		char ch;
		do{
			System.out.println("Choose any below operation on queue: ");
			System.out.println("1.pushBack");//void
			System.out.println("2.pushFront");//void
			System.out.println("4.popFront");//int
			System.out.println("5.empty");//boolean
			System.out.println("6.front");//int
			System.out.println("7.rear");//int
			System.out.println("8.printQueue");//void
			System.out.println("Enter any above choice 1/2/3/4/5/6/7/8/: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data: ");
					int data=sc.nextInt();
					q.pushBack(data);
					break;
				case 2:
					System.out.println("Enter data: ");
                                        int data1=sc.nextInt();
                                        q.pushFront(data1);
					break;
				case 4:
					int val1=q.popFront();
                                        if(val1!=-1)
                                                System.out.println("element deleted: "+val1);
					break;
				case 5:
					if(q.empty())
						System.out.println("Queue is empty");
					else
						System.out.println("Queue is not empty");
                                        break;
				case 6:
					int val5=q.front();
					if(val5!=-1)
						System.out.println("front is : "+val5);
                                        break;
				case 7:
					int val2=q.rear();
					if(val2!=-1)
						System.out.println("rear is: "+val2);
                                        break;
				case 8:
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
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("1.InputRestrictedQueue");
		System.out.println("2.OutputRestrictedQueue");
		System.out.println("Enter any above option(1/2): ");
		int choice=sc.nextInt();
		if(choice==1)
			inputRestrictedQueue();
		else if(choice==2)
			outputRestrictedQueue();
		else{
			System.out.println("Invaild choice");
			System.exit(0);
		}
	}
}
