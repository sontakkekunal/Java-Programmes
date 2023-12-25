import java.util.Scanner;
class Node{
	Node next=null;
	Node previous=null;
	int data=0;
	Node(int data){
		this.data=data;
	}
}
class DoubleLinkedList{
	Node head=null;
	void addFirst(int data){
		Node newNode= new Node(data);
		if(head==null)
			head=newNode;
		else{
			newNode.next=head;
			head.previous=newNode;
			head=newNode;
		}
		System.out.println("Node added at first! ");
	}
	void addLast(int data){
		Node newNode= new Node(data);
		if(head==null)
			head=newNode;
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			newNode.previous=temp;
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
		int count=0;
		Node temp=head;
		while(temp!=null){
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
			head=head.next;
			head.previous=null;
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
			while(temp.next.next!=null){
				temp=temp.next;
			}
			temp.next.previous=null;
			temp.next=null;
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
		//System.out.println("head: "+head);
		while(temp!=null){
			if(temp.next!=null)
				System.out.print(temp.data+"-> ");
			else
				System.out.println(temp.data);
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
		Node temp=head;
		Node end=null;
		while(temp!=null){
			if(temp.next==null)
				end=temp;
			temp=temp.next;
		}
		System.out.println("Linked list: ");
		while(end!=null){
			if(end.previous!=null)
				System.out.print(end.data+"<- ");
			else
				System.out.println(end.data);
			end=end.previous;
		}
	}
	void insertionSort(){
		int cnt=countNode();
		Node temp1=head.next;
		int i=0;
		while(temp1!=null){
			boolean flag=false;
			Node temp2=temp1.previous;
			int element=temp1.data;
			Node current=temp1.next;
			while(temp2!=null && temp2.data>element){
				temp2=temp2.previous;
				flag=true;
			}
			if(flag){
				temp1.previous.next=temp1.next;
				if(temp1.next!=null)
					temp1.next.previous=temp1.previous;
			}
			if(temp2==null && flag){
				addFirst(temp1.data);
			}
			else if(flag){
					Node temp=temp2.next;
					temp2.next=temp1;
					temp1.next=temp;
					temp1.previous=temp2;
					temp.previous=temp1;
			}
			//System.out.println("i: "+i+" "+temp1.data);
			temp1=current;
			//System.out.println("i: "+i+"A "+temp1.data);
			//printLL();
			i++;
		}
		System.out.println("Linked list sorted by insertionSort is: ");
		printLL();
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		DoubleLinkedList dll= new DoubleLinkedList();
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
				case 11:
					dll.insertionSort();
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
