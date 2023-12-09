import java.util.Scanner;
class Node{
	Node next=null;
	int data=0;
	Node(int data){
		this.data=data;
	}
}
class SingleCircularLinkedList{
	Node head=null;
	void addFirst(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
			head.next=head;
		}
		else{
			newNode.next=head;
			Node temp=head.next;
			while(temp.next!=head){
				temp=temp.next;
			}
			head=newNode;
			temp.next=head;
		}
		System.out.println("Node added at first! ");
	}
	void addLast(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
			head.next=head;
		}
		else{
			Node temp=head.next;
			while(temp.next!=head){
				temp=temp.next;
			}
			newNode.next=head;
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
			temp.next=newNode;	
		}
		System.out.println("node added at position: "+pos);
	}

	int countNode(){
		if(head==null)
			return 0;
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
			head=head.next;
			temp.next=head;
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
			temp.next=head;
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
			System.out.println("element deleted at position: "+pos);
		}
	}
	void printLL(){
		if(countNode()==0){
			System.out.println("List is empty: ");
			return;
		}
		Node temp=head;
		System.out.println("Linked list: ");
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
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		SingleCircularLinkedList dll= new SingleCircularLinkedList();
		while(true){
			boolean flag=false;
			System.out.println("Enter a choice: ");
			System.out.println("1.addFirst ");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.printLL");
			System.out.println("5.deleteFirst ");
			System.out.println("6.deleteLast");
			System.out.println("7.deletAtPos");
			System.out.println("8.countNode");
			System.out.println("9.exit the code");
			System.out.println("choose 1/2/3/4/5/6/7/8/9: ");
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
					dll.deleteFirst();
					break;
				case 6:
					dll.deleteLast();
					break;
				case 7:
					System.out.println("Enter position: ");
                                        pos=sc.nextInt();
					dll.deletAtPos(pos);
					break;
				case 8:
					System.out.println("Number of node in list is: "+dll.countNode());
					break;
				case 9:
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
