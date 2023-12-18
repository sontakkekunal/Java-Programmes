/*
 3.Linked List Insertion
Create a link list of size N according to the given input literals. Each integer input is
accompanied by an indicator which can either be 0 or 1. If it is 0, insert the integer in the
beginning of the link list. If it is 1, insert the integer at the end of the link list.
Hint: When inserting at the end, make sure that you handle NULL explicitly.
Example 1:
Input:
LinkedList: 9->0->5->1->6->1->2->0->5->0
Output: 5 2 9 5 6
Explanation:
Length of Link List = N = 5
9 0 indicated that 9 should be inserted in the beginning. Modified
Link List = 9.
5 1 indicated that 5 should be inserted in the end. Modified Link
List = 9,5.
6 1 indicated that 6 should be inserted in the end. Modified Link

List = 9,5,6.
2 0 indicated that 2 should be inserted in the beginning. Modified
Link List = 2,9,5,6.
5 0 indicated that 5 should be inserted in the beginning. Modified
Link List = 5,2,9,5,6.
Final linked list = 5, 2, 9, 5, 6.
Example 2:
Input:
LinkedList: 5->1->6->1->9->1
Output: 5 6 9

Expected Time Complexity: O(1) for insertAtBeginning() and O(N) for insertAtEnd().
Expected Auxiliary Space: O(1) for both.
Constraints:
1 <= N <= 10^4
 */
import java.util.Scanner;
class Node{
	Node next=null;
	int data=0;
	Node(int data){
		this.data=data;
	}
}
class SingleLinkedList{
	Node head=null;
	int countNode(){
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	void addFirst(int data){
		Node newNode= new Node(data);
		if(head==null)
			head= newNode;
		else{
			newNode.next=head;
			head= newNode;
		}
		System.out.println("Node at first added succesufully");
	}
	void addLast(int data){
		Node newNode= new Node(data);
                if(head==null)
                        head= newNode;
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
		System.out.println("Node at last added succesufully");
        }
	void addAtPos(int pos,int data){
		if(pos==1)
			addFirst(data);
		else if(pos==countNode()+1)
			addLast(data);
		else if(pos<1 || pos>countNode()+1)
			System.out.println("Invaild position to add data");
		else{
			int pos1=pos;
			Node newNode = new Node(data);
			Node temp=head;
			while(pos-2>0){
				temp=temp.next;
				pos--;
			}
			newNode.next=temp.next;
			temp.next= newNode;
			System.out.println("Node added at position: "+pos1);
		}
	}
	void printLL(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		while(temp.next!=null){
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	void deleteFirst(){
		if(head==null){
			System.out.println("Linked list is empty");
			return;
		}
		Node temp=head;
		head=head.next;
		temp=null;
		System.out.println("Deleted node at first");
	}
	void deleteLast(){
		Node temp=head;
		if(head==null){
                        System.out.println("Linked list is empty");
                        return;
                }
		if(countNode()==1){
			head=null;
			System.out.println("Deleted node at last");
			return;
		}
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next=null;
		System.out.println("Deleted node at last");
	}
	void deleteAtPos(int pos){
		if(pos==1)
			deleteFirst();
		else if(pos==countNode())
			deleteLast();
		else if(pos<1 || pos>countNode())
			System.out.println("Invaild position to delete data");
		else{
			Node temp=head;
			int pos1=pos;
			while(pos-2>0){
				temp=temp.next;
				pos--;
			}
			temp.next=temp.next.next;
			System.out.println("Deletd node at position: "+pos1);
		}
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		SingleLinkedList sll= new SingleLinkedList();
		System.out.println("Single linkedlist");
		char ch;
		do{
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.printLL");
			System.out.println("5.countNode");
			System.out.println("6.deleteFirst");
			System.out.println("7.deleteLast");
			System.out.println("8.deleteAtPos");
			System.out.println("9.LinkedListInsertion");
			System.out.println("Enter 1/2/3/4/5/6/7/8/9 for choosing above funtionlity");
			int choice =sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data to add: ");
					sll.addFirst(sc.nextInt());
					break;
				case 2: 
					System.out.println("Enter data to add: ");
                                        sll.addLast(sc.nextInt());
					break;
				case 3:

					System.out.println("Enter data to add: ");
                                        int data=sc.nextInt();
					System.out.println("Enter position: ");
					sll.addAtPos(sc.nextInt(),data);
					break;
				case 4:
					System.out.println("LinkedList is: ");
					sll.printLL();
					break;
				case 5:
					System.out.println("Count of node is: "+sll.countNode());
					break;
				case 6:
					sll.deleteFirst();
					break;
				case 7:
					sll.deleteLast();
					break;
				case 8:
					System.out.println("Enter position to delete");
					sll.deleteAtPos(sc.nextInt());
					break;
				case 9:
					SingleLinkedList sll2= new SingleLinkedList();
					while(sll.head!=null && sll.head.next!=null){
						//System.out.println(sll.head.data+"l");
						if(sll.head==null)
							System.out.println("List is empty");
						else if(sll.head.next==null)
							System.out.println("Invaild list");
						else if(sll.head.next.data==0){
							sll2.addFirst(sll.head.data);
							sll.deleteFirst();
							sll.deleteFirst();
						}
						else if(sll.head.next.data==1){
							sll2.addLast(sll.head.data);
							sll.deleteFirst();
							sll.deleteFirst();
						}
						else
							System.out.println("Inviald list");
						//System.out.println(sll2.head.data+"m");
					}
						System.out.println("Formed list is: ");
					sll2.printLL();
						
					break;
				default:
					System.out.println("please enter vaild choice");
					break;
			}
			System.out.println("Do you want to countinue?(y/n)");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
	}
}



