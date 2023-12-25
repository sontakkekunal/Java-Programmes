import java.util.Scanner;
class Queue{
	int maxSize;
	int front;
	int rear;
	int[] queueArr;
	Queue(int size){
		this.maxSize=size;
		this.front=-1;
		this.rear=-1;
		this.queueArr=new int[size];
	}
	void enqueue(int data){
		//if((front==0 && rear==maxSize-1) || ((front-1)%maxSize==rear)){
		if((front==0 && rear==maxSize-1) || ((rear+1)%maxSize==front)){
			System.out.println("Queue is full");
			return;
		}
		else if(front==-1){
			front=0;
			rear=0;
		}
		else if((rear==maxSize-1) && (front!=0)){
			rear=0;
		}
		else{
			rear++;
		}
		queueArr[rear]=data;
		System.out.println(data+" data inserted successfully");
	}
	
	int dequeue(){
		if(front==-1){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			int val=queueArr[front];
			if(rear==front){
				rear=-1;
				front=-1;
			}
			else{
				if(front==maxSize-1){
					front=0;
				}
				else{
					front++;
				}
			}
			return val;
		}
	}
	/*
	int dequeue(){
		if(front==-1){
			System.out.println("Queue is empty");
                        return -1;
                }
                else{
                        int val=queueArr[front];
                        if(rear==front){
                                rear=-1;
                                front=-1;
                        }
                        else if(front==maxSize-1){
				front=0;
			}
			else{
				front++;
			}
			return val;
		}
	}
	*/
	void printCirculayQueue(){
		System.out.println("Circular queue is: ");
		System.out.print("[ ");
		int i=front;
		while(i!=rear){
			System.out.print(queueArr[i]+" , ");
			if(i==maxSize-1)
				i=0;
			else
				i++;
		}
		if(i!=-1)
			System.out.println(queueArr[i]+" ]");
		else
			System.out.println(" ]");

	}
	/*
	void printCirculayQueue(){
		if(rear==-1){
			System.out.println("Queue is empty");
                        return ;
                }
		System.out.println("front: "+front+" rear:"+rear);
		System.out.println("Circular queue is: ");
                System.out.print("[ ");
		if(front<rear){
			for(int i=front;i<=rear;i++){
				System.out.print(queueArr[i]+" , ");
			}
		}
		else if(rear==front){
			System.out.println(queueArr[front]);
		}
		else{
			for(int i=front;i<maxSize;i++){
				System.out.print(queueArr[i]+" , ");
                        }
			for(int i=0;i<=rear;i++){
                                System.out.print(queueArr[i]+" , ");
                        }
		}
		System.out.println(" ]");
	}
	*/
	
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of the queue: ");
		int size=sc.nextInt();
		char ch;
		Queue cq = new Queue(size);
		do{
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.printCirculayQueue");
			System.out.println("Enter above choice 1/2/3: ");
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
					cq.printCirculayQueue();
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
