/*
 7. Swap Kth nodes from ends
Given a singly linked list of size N, and an integer K. You need to swap the Kth node from the
beginning and Kth node from the end of the linked list. Swap the nodes through the links. Do not
change the content of the nodes.

Example 1:
Input:
N = 4, K = 1
value[] = {1,2,3,4}
Output: 1
Explanation: Here K = 1, hence after swapping the 1st node from the beginning and end the
new list will be 4 2 3 1.

Example 2:
Input:
N = 5, K = 7
value[] = {1,2,3,4,5}
Output: 1
Explanation: K > N. Swapping is invalid. Return the head node as it is.
Expected Time Complexity: O(n)
Expected Auxiliary space Complexity: O(1)
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
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){};
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
	void swapNode(Node node1,Node node2){
		Node temp=node1;
		node1.next=node2;
		node2.next=temp;
	}
	int swapPosK(int k){
		double mid=countNode()/2;
		if(k<1 || k>countNode() )
			return head.data;
		else if(countNode()==1)
			return head.data;
		else if(countNode()==k || k==1){
			Node temp=head;
			while(temp.next.next!=null){
				temp=temp.next;
			}
			Node swap=temp.next;
			temp.next.next=head.next;
			temp.next=head;
			head.next=null;
			head=swap;
			return head.data;
		}
		else if(mid==k){
			int pos=k;
                        Node temp=head;
                        while(pos-2>0){
                                temp=temp.next;
                                pos--;
                        }
                        pos=countNode()-k+1;
                        Node temp2=head;
                        while(pos-2>0){
                                temp2=temp2.next;
                                pos--;
                        }


                        Node node1=temp.next;
                        Node node2=temp2.next;
			node1.next=node2.next;
			node2.next=node1;
			temp.next=node2;
			return head.data;
		}	
		else{
			int pos=k;
			Node temp=head;
			while(pos-2>0){
				temp=temp.next;
				pos--;
			}
			pos=countNode()-k+1;
			Node temp2=head;
			while(pos-2>0){
				temp2=temp2.next;
				pos--;
			}
			

			Node node1=temp.next;
                        Node node2=temp2.next;
			Node swap=node1.next;
			node1.next=node2.next;
			node2.next=swap;

			temp.next=node2;
                        temp2.next=node1;


			return head.data;
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
			System.out.println("9.swapPosK");
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
					System.out.println("Enter k-th position to swaping: ");
					int k=sc.nextInt();
					System.out.println("Head of the linked will be: "+sll.swapPosK(k));
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



