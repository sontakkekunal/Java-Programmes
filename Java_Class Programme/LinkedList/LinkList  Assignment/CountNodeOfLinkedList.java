/*
 1. Count nodes of linked list
Given a singly linked list. The task is to find the length of the linked list, where length is defined
as the number of nodes in the linked list.
Example 1:
Input:
LinkedList: 1->2->3->4->5
Output: 5
Explanation: Count of nodes in the linked list is 5, which is its length.
Example 2:
Input:
LinkedList: 2->4->6->7->5->1->0
Output: 7
Explanation: Count of nodes in the linked list is 7. Hence, the output
is 7.
Expected Time Complexity : O(N)
Expected Auxiliary Space : O(1)
Constraints:
1 <= N <= 10^5
1 <= value <= 10^3
*/
import java.util.Scanner;
class Node{
	Node next=null;
	int data;
	Node(int data){
		this.data=data;
	}
}
class LinkedList{
	Node head=null;
	void addFirst(int data){
		Node newNode = new Node(data);
		if(head==null)
			head= newNode;
		else{
			newNode.next=head;
			head= newNode;
		}
	}
	void deleteFirst(){
		if(head==null)
			System.out.println("List is already empty");
		else{
			head=head.next;
		}
	}
	void printLL(){
		if(head==null)
                        System.out.println("List is already empty");
		else{
			System.out.println("Linked list is: ");
			Node temp=head;
			while(temp.next!=null){
				System.out.print(temp.data+" ->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	int countNode(){
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
}
class Client{
	public static void main(String [] arsg){
		Scanner sc= new Scanner(System.in);
		LinkedList ll= new LinkedList();
		char ch;
		do{
			System.out.println("1.addFirst");
			System.out.println("2.deleteFirst");
			System.out.println("3.printLL");
			System.out.println("4.countNode");
			System.out.println("Enter above choice 1/2/3/4: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data: ");
					ll.addFirst(sc.nextInt());
					break;
				case 2:
					ll.deleteFirst();
					break;
				case 3:
					ll.printLL();
					break;
				case 4:
					System.out.println("Count of linklist is: "+ll.countNode());
					break;
				default:
					System.out.println("Enter vaild number");
					break;
			}
			System.out.println("continue? ");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');

	}
}


