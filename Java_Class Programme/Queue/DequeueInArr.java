import java.util.Scanner;
class Queue{
	int front;
	int rear;
	int queueArr[];
	int maxSize;
	Queue(int size){
		this.maxSize=size;
		this.rear=-1;
		this.front=-1;
		this.queueArr= new int[maxSize];
	}
	void pushBack(int data){
		if(rear==maxSize-1){
			System.out.println("Queue is full");
			return;
		}
		else if(front==-1){// either both front and rear is -1 or neither both are not -1, so you want check both or any one
			front=0;
			rear=0;
			queueArr[rear]=data;	
		}
		else{
			rear++;
			queueArr[rear]=data;
		}
		System.out.println("Data added at queue successfully");
	}
	void pushFront(int data){
		if(front==0 && rear==maxSize-1){
			System.out.println("Queue is full");
                        return;
                }
                else if(front==-1){
			front=0;
			rear=0;
			queueArr[front]=data;
		}
		else if(front==0 && rear!=maxSize-1){
			for(int i=front;i<=rear+1;i++){
				int temp=queueArr[i];
				queueArr[i]=data;
				data=temp;
			}
			rear++;
		}
		else{
			front--;
			queueArr[front]=data;
		}
	}
	int popFront(){
		if(front==-1){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			int val=queueArr[front];
			front++;
			if(front>rear){
				front=-1;
				rear=-1;
				System.out.println("Queue reseted");
			}
			return val;
		}
	
	}
	int popBack(){
		if(front==-1){
                        System.out.println("Queue is empty");
                        return -1;
                }
                else{
			int val=queueArr[rear];
			rear--;
			if(rear<front){
				rear=-1;
				front=-1;
			}
			return val;
		}

	}
	boolean empty(){
		if(front==-1)
			return true;
		else
			return false;
	}
	int front(){
		if(front==-1){
			System.out.println("Queue is empty");
			return -1;
		}
		return queueArr[front];
	}
	int rear(){
		if(front==-1){
                        System.out.println("Queue is empty");
			return -1;
                }
                return queueArr[rear];
	}
	void printQueue(){
		if(front==-1){
                        System.out.println("Queue is empty");
                        return ;
                }
		System.out.println("Queue is: ");
		System.out.print("[ ");
		for(int i=front;i<=rear;i++){
			if(i==rear)
				System.out.print(queueArr[i]);
			else
				System.out.print(queueArr[i]+" , ");
		}
		System.out.println(" ]");
	}
	int peek(){
		if(rear==-1){
			System.out.println(" list is empty");
			return -1;
		}
		else
			return queueArr[front];
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the queue: ");
		int size=sc.nextInt();
		Queue q= new Queue(size);
		System.out.println("Queue created successfully of size: "+size);
		char ch;
		do{
			System.out.println("Choose any below operation on queue: ");
			System.out.println("1.pushBack");//void
			System.out.println("2.pushFront");//void
			System.out.println("3.popBack");//int
			System.out.println("4.popFront");//int
			System.out.println("5.empty");//boolean 
			System.out.println("6.front");//int 
			System.out.println("7.rear");//int
			System.out.println("8.printQueue");//void
			System.out.println("9.peek");
			System.out.println("Enter any above choice 1/2/3/4/5/6/7/8/9: ");
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
				case 9:
					int val3=q.peek();
					if(val3!=-1)
						System.out.println("peek of queue is: "+val3);
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




