/*
 12. Merge Sort on Doubly Linked List
Given Pointer/Reference to the head of a doubly linked list of N nodes, the task is to Sort the
given doubly linked list using Merge Sort in both non-decreasing and non-increasing order.
Example 1:
Input:
N = 8
value[] = {7,3,5,2,6,4,1,8}
Output:
1 2 3 4 5 6 7 8
8 7 6 5 4 3 2 1
Explanation: After sorting the given linked list in both ways, the resultant matrix will be as given
in the first two lines of output, where the first line is the output for non-decreasing order and next
line is for non - increasing order.
Example 2:
Input:
N = 5
value[] = {9,15,0,-1,0}
Output:
-1 0 0 9 15
15 9 0 0 -1
Explanation: After sorting the given linked list in both ways, the resultant list will be -1 0 0 9 15 in
non-decreasing order and 15 9 0 0 -1 in non-increasing order.
Constraints:
1 <= N <= 10^5
*/
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
	int countPos(Node find){
		Node temp=head;
		int count=0;
		while(temp!=find){
			count++;
			temp=temp.next;
		}
		return count+1;
	}
	Node middleNode(Node start,Node end){
		if(countPos(end)-countPos(start)==1)
			return start;
		Node slow=start;
		Node fast=slow.next;
		while(fast!=end){
			fast=fast.next;
			if(fast!=null)
				fast=fast.next;
			slow=slow.next;
		}
		return slow;
	}
	void merge(Node start,Node mid,Node end){
		DoubleLinkedList dll1= new DoubleLinkedList();
		DoubleLinkedList dll2= new DoubleLinkedList();
		Node temp1=start;

		while(temp1!=mid){
			dll1.addLast(temp1.data);
			temp1=temp1.next;
		}
		dll1.addLast(temp1.data);
                temp1=temp1.next;
		System.out.println("here1");
		while(temp1!=end){
			dll2.addLast(temp1.data);
			temp1=temp1.next;
		}
		dll2.addLast(temp1.data);
                temp1=temp1.next;

		Node dLL1=dll1.head;
		Node dLL2=dll2.head;
		Node temp2=start;
		while(dLL1!=null && dLL2!=null){
			System.out.println("dLL1: "+dLL1.data+" dLL2: "+dLL2.data+"  "+temp2.data);
			if(dLL1.data>dLL2.data){
				int pos=countPos(temp2);
				System.out.println("jj");
				deletAtPos(pos);
				addAtPos(pos,dLL2.data);
				dLL2=dLL2.next;
			}
			else{
				int pos=countPos(temp2);
				deletAtPos(pos);
				addAtPos(pos,dLL1.data);
                                dLL1=dLL1.next;
			}
			temp2=temp2.next;
		}
		while(dLL1!=null){
			int pos=countPos(temp2);
			deletAtPos(pos);
			addAtPos(pos,dLL1.data);
                        dLL1=dLL1.next;
			temp2=temp2.next;
		}
		while(dLL2!=null){
			int pos=countPos(temp2);
                        deletAtPos(pos);
                        addAtPos(pos,dLL2.data);
                        dLL2=dLL2.next;
                        temp2=temp2.next;
                }

	}		
	void mergeSort(Node start,Node end){
		if(countPos(start)<countPos(end)){
			Node mid=middleNode(start,end);
			mergeSort(start,mid);
			mergeSort(mid.next,end);
			merge(start,mid,end);
		}
	}
	void mergeSortLL(){
		Node end=head;
		while(end.next!=null){
			end=end.next;
		}
		mergeSort(head,end);
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
					dll.mergeSortLL();
					break;
				case 11:
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
