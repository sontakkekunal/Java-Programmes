import java.util.Scanner;
class Node{
	Node next=null;
	Node previous=null;
	int data=0;
	Node(int data){
		this.data=data;
	}
}
class DoubleCircularLinkedList{
	Node head=null;
	void addFirst(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
			head.next=head;
			head.previous=head;
		}
		else{
			newNode.next=head;
			Node temp=head;
			while(temp.next!=head){
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.previous=temp;
			head.previous=newNode;
			head= newNode;
		}
		System.out.println("Node added at first! ");
	}
	void addLast(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
                        head.next=head;
                        head.previous=head;
		}
		else{
			Node temp=head;
			while(temp.next!=head){
				temp=temp.next;
			}
			newNode.next=head;
			newNode.previous=temp;
			head.previous=newNode;
			temp.next=newNode;
		}
		System.out.println("node added at last! ");
	}
	void addAtPos(int pos,int data){
		Node newNode=new Node(data);
		if(pos<=0 || pos>=countNode()+2){
			System.out.println("Invaild index");
			return;
		}
		else if(head==null){
			head= newNode;
			System.out.println("node added");
		}
		else if(pos==1){
			addFirst(data);
		}
		else if(pos==countNode()+1)
			addLast(data);
		else{
			int count=1;
			Node temp=head;
			while(count<pos-1){
				temp=temp.next;
				count++;
			}
			newNode.next=temp.next;
			newNode.previous=temp;
			temp.next.previous=newNode;
			temp.next=newNode;	
		}
		System.out.println("node added at position: "+pos);
	}

	int countNode(){
		if(head==null){
			return 0;
		}
		int count=1;
		Node temp=head.next;
		while(temp!=head){
			temp=temp.next;
			count++;
		}
		return count;
	}
	void deleteFirst(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		else if(countNode()==1){
			head=null;
			System.out.println("Fisrt node detelted");
		}
		else{
			Node temp=head;
			while(temp.next!=head){
				temp=temp.next;
			}
			head.previous=null;
			head=head.next;
			temp.next=head;
			head.previous=temp;
			System.out.println("Fisrt node detelted");
		}
	}
	void deleteLast(){
		if(head==null){
                        System.out.println("List is empty");
                        return;
                }
		else if(countNode()==1){
			head=null;
			System.out.println("last node deleted ");
		}
		else{
			Node temp=head;
			while(temp.next.next!=head){
				temp=temp.next;
			}
			temp.next.next=null;
			temp.next.previous=null;
			temp.next=head;
			head.previous=temp;
			System.out.println("last node deleted ");
		}
	}
	void deletAtPos(int pos){
		if(head==null){
			System.out.println("List is empty");
                        return;
                }
		else if(pos<=0 || pos>countNode()){
			System.out.println("Invaild index");
			return;
		}
		else if(pos==1)
			deleteFirst();
		else if(pos==countNode())
			deleteLast();
		else{
			Node temp=head;
			int count=1;
			while(count<pos-1){
				temp=temp.next;
				count++;
			}
			temp.next=temp.next.next;
			temp.next.previous=temp;
			System.out.println("element deleted at position: "+pos);
		}
	}
	void printLL(){
		Node temp=head;
		System.out.println("Linked list: ");
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		//System.out.println("head: "+head);
		System.out.print(temp.data);
		temp=temp.next;
		while(temp!=head){
			if(temp.next!=head)
				System.out.print("-> "+temp.data);
			else
				System.out.println("-> "+temp.data);
			temp=temp.next;
		}
	}
	void printReverseLL(){
		if(head==null){
                        System.out.println("List is empty");
                        return;
                }
		if(countNode()==1){
			System.out.println("Linked list: ");
			System.out.println(head.data);
			return;
		}
		Node temp=head.next;
		Node end=null;
		while(temp!=head){
			if(temp.next==head)
				end=temp;
			temp=temp.next;
		}
		System.out.println("Linked list: ");
		while(end!=head){
			System.out.print(end.data+"<- ");
			end=end.previous;
		}
		System.out.println(end.data);
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		DoubleCircularLinkedList dll= new DoubleCircularLinkedList();
		while(true){
			boolean flag=false;
			System.out.println("Enter a choice: ");
			System.out.println("1.addFirst ");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.printLL");
			System.out.println("5.printReverseLL");
			System.out.println("6.deleteFirst ");
			System.out.println("7.deleteLast");
			System.out.println("8.deletAtPos");
			System.out.println("9.countNode");
			System.out.println("10.exit the code");
			System.out.println("choose 1/2/3/4/5/6/7/8/9/10: ");
			System.out.println("Note: any other choice will be taking as end of code");
			int choice =sc.nextInt();
			int data=0;
			int pos=-1;
			switch(choice){
				case 1: 
					System.out.println("Enter element: ");
					data=sc.nextInt();
					dll.addFirst(data);
					break;
				case 2:
					System.out.println("Enter element: ");
					data=sc.nextInt();
					dll.addLast(data);
					break;
				case 3:
					System.out.println("Enter element: ");
                                        data=sc.nextInt();
					System.out.println("Enter position: ");
					pos=sc.nextInt();
					dll.addAtPos(pos,data);
					break;
				case 4:
					dll.printLL();
					break;
				case 5:
					dll.printReverseLL();
					break;
				case 6:
					dll.deleteFirst();
					break;
				case 7:
					dll.deleteLast();
					break;
				case 8:
					System.out.println("Enter position: ");
                                        pos=sc.nextInt();
					dll.deletAtPos(pos);
					break;
				case 9:
					System.out.println("Number of node in list is: "+dll.countNode());
					break;
				case 10:
					flag=true;
					break;
				default:
					flag=true;
					break;
			}
			if(flag)
				break;
		}
	}
}
