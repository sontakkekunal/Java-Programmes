/*
 13. Nth node from end of linked list
Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node
from the end of the linked list.
Example 1:
Input:
N = 2

LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there are 9 nodes in the linked list and we need to find the 2nd
node from the end. the 2

nd node from the end is 8.

Example 2:
Input:
N = 5
LinkedList: 10->5->100->5
Output: -1
Explanation: In the second example, there are 4 nodes in the linked list and we need to find 5th
from the end. Since 'n' is more than the number of nodes in the linked list, the output is -1.
Note:
Try to solve it in a single traversal.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 <= L <= 10^6
1 <= N <= 10^6
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
	int nthNodeFromEnd(int pos){
		int pos1=countNode()-pos+1;
		if(pos1>countNode() || pos1<1 || pos<1)
			return -1;
		Node temp=head;
		while(pos1-2>=0){
			temp=temp.next;
			pos1--;
		}
		return temp.data;
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
			System.out.println("9.nthNodeFromEnd");
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
					System.out.println("Enter postion: ");
					System.out.println("nth node from end is: "+sll.nthNodeFromEnd(sc.nextInt()));
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



