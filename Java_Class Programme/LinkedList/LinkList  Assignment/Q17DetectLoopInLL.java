/*
 17. Detect Loop in linked list
Given a linked list of N nodes. The task is to check if the linked list has a loop. Linked list can
contain a self loop.
Example 1:

Input:
N = 3
value[] = {1,3,4}
x(position at which tail is connected) = 2
Output: True
Explanation: In above test case N = 3. The linked list with nodes N = 3 is given. Then the value
of x=2 is given which means the last node is connected with the x

th node of the linked list.

Therefore, there exists a loop.
Example 2:
Input:
N = 4
value[] = {1,8,3,4}
x = 0
Output: False
Explanation: For N = 4 ,x = 0 means
the lastNode->next = NULL, then
the Linked list does not contains
any loop.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^4
1 ≤ Data on Node ≤ 10^3
*/
import java.util.Scanner;
class Node{
	Node next=null;
	int data=0;
	boolean marker;
	Node(int data){
		this.data=data;
		this.marker=false;
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
	void createLoop(int pos){
		if(pos>countNode() || head==null || pos<1){
			System.out.println("Invaild position to create loop");
			return;
		}
		else if(pos==1){
                        Node temp=head;
                        while(temp.next!=null){
                                temp=temp.next;
                        }
                        temp.next=head;
                }
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			Node temp1=head;
			while(pos-2>0){
				temp1=temp1.next;
				pos--;
			}
			temp.next=temp1.next;
			System.out.println("Loop created succesufully");
		}
	}
	boolean detectLoop(){
		Node temp=head;
		int pos=0;
		boolean flag=false;
		while(temp!=null){
			if(temp.marker==false){
				temp.marker=true;
			}
			else{
				flag=true;
				break;
			}
			pos++;
			temp=temp.next;
		}
		Node temp2=head;
		while(pos!=0){
			temp2.marker=false;
			temp2=temp2.next;
			pos--;
		}
		return flag;
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
			System.out.println("9.createLoop");
			System.out.println("10.detectLoop");
			System.out.println("Enter 1/2/3/4/5/6/7/8/9/10 for choosing above funtionlity");
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
					System.out.println("Enter position to create loop with: ");
					sll.createLoop(sc.nextInt());
					break;
				case 10:
					if(sll.detectLoop())
						System.out.println("Loop detected ");
					else
						System.out.println("Loop not detected");
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



