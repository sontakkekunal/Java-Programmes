/*
 10. Identical Linked Lists
Given two Singly Linked List of N and M nodes respectively. The task is to check whether two
linked lists are identical or not.
Two Linked Lists are identical when they have the same data and with the same arrangement
too.
Example 1:
Input:
LinkedList1: 1->2->3->4->5->6
LinkedList2: 99->59->42->20
Output: Not identical
Example 2:
Input:
LinkedList1: 1->2->3->4->5
LinkedList2: 1->2->3->4->5

Output: Identical
Constraints:
1 <= N <= 10^3
Expected Time Complexity : O(N)
Expected Auxiliary Space : O(1)
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
		Node temp=head;
		if(head==null){
        System.out.println("Linked list is empty");
        return;
    }
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
		SingleLinkedList sll2= new SingleLinkedList();
		System.out.println("Two Single linkedlist created");
		char ch;
		do{
			System.out.println("1.addFirst1");
			System.out.println("2.addFirst2");
			System.out.println("3.addLast1");
			System.out.println("4.addLast2");
			System.out.println("5.addAtPos1");
			System.out.println("6.addAtPos2");
			System.out.println("7.printLL1");
			System.out.println("8.printLL2");
			System.out.println("9.countNode1");
			System.out.println("10.countNode2");
			System.out.println("11.deleteFirst1");
			System.out.println("12.deleteFirst2");
			System.out.println("13.deleteLast1");
			System.out.println("14.deleteLast2");
			System.out.println("15.deleteAtPos1");
			System.out.println("16.deleteAtPos2");
			System.out.println("17.checkIdentical");
			System.out.println("Enter 1/2/3/4/5/6/7/8/9/10/11/12/13/14/15/16/17 for choosing above funtionlity");
			int choice =sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data to add: ");
					sll.addFirst(sc.nextInt());
					break;
				case 2:
                                        System.out.println("Enter data to add: ");
                                        sll2.addFirst(sc.nextInt());
                                        break;
				case 3:
					System.out.println("Enter data to add: ");
                                        sll.addLast(sc.nextInt());
					break;
				case 4:
                                        System.out.println("Enter data to add: ");
                                        sll2.addLast(sc.nextInt());
                                        break;
				case 5:
					System.out.println("Enter data to add: ");
                                        int data=sc.nextInt();
					System.out.println("Enter position: ");
					sll.addAtPos(sc.nextInt(),data);
					break;
				case 6:
                                        System.out.println("Enter data to add: ");
                                        int data1=sc.nextInt();
                                        System.out.println("Enter position: ");
                                        sll2.addAtPos(sc.nextInt(),data1);
                                        break;
				case 7:
					System.out.println("LinkedList is: ");
					sll.printLL();
					break;
				case 8:
                                        System.out.println("LinkedList is: ");
                                        sll2.printLL();
                                        break;
				case 9:
					System.out.println("Count of node is: "+sll.countNode());
					break;
				case 10:
                                        System.out.println("Count of node is: "+sll2.countNode());
                                        break;
				case 11:
					sll.deleteFirst();
					break;
				case 12:
                                        sll2.deleteFirst();
                                        break;
				case 13:
					sll.deleteLast();
					break;
				case 14:
                                        sll2.deleteLast();
                                        break;
				case 15:
					System.out.println("Enter position to delete");
					sll.deleteAtPos(sc.nextInt());
					break;
				case 16:
                                        System.out.println("Enter position to delete");
                                        sll2.deleteAtPos(sc.nextInt());
                                        break;
				case 17:
					if(sll.countNode()!=sll2.countNode())
						System.out.println("Not identical");
					else{
						boolean flag=false;
						Node temp1=sll.head;
						Node temp2=sll2.head;
						while(temp1!=null){
							if(temp1.data!=temp2.data){
								System.out.println("Not identical");
								flag=true;
								break;
							}
							temp1=temp1.next;
							temp2=temp2.next;
						}
						if(flag==false)
							System.out.println("Identical");
					}
					break;
				default:
					System.out.println("Invaild choice");
					break;
			}
			System.out.println("Countinue? ");
			ch= sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
	}
}



