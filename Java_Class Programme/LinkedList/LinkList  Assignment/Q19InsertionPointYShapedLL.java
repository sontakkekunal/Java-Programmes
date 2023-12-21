/*
 19. Intersection Point in Y Shaped Linked Lists
Given two singly linked lists of size N and M, write a program to get the point where two linked
lists intersect each other.
Example 1:
Input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15
Explanation:

Example 2:
Input:
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation:
4 5
| |
1 6
\ /
8 ----- 1
|
4
|
5
|

NULL
Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N + M ≤ 2*105
-1000 ≤ value ≤ 1000
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
	void addLast(int data,Node further){
		addLast(data);
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=further;
	}
	Node getNodeAtPos(int pos){
		Node temp=head;
		while(pos-2>0){
			temp=temp.next;
			pos--;
		}
		return temp.next;
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
			System.out.println("1.addLastWithNextNode1");
			System.out.println("2.addLastWithNextNode2");
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
			System.out.println("17.checkForIntersectionIntwoLink");
			System.out.println("Enter 1/2/3/4/5/6/7/8/9/10/11/12/13/14/15/16/17 for choosing above funtionlity");
			int choice =sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data to add: ");
                                        int datax=sc.nextInt();
					System.out.println("what should be next node?(1.null/2.nodefromanotherLink)");
					int choosex=sc.nextInt();
					if(choosex==1)
						sll.addLast(datax);
					else{
						System.out.println("Enter position of node in another linK: ");
						int posx=sc.nextInt();
						Node tempx=sll2.head;
						while(tempx!=null && posx-2>0 && posx<=sll2.countNode()){
							tempx=tempx.next;
							posx--;
						}
						sll.addLast(datax,tempx.next);
					}
					break;
				case 2:
                                        System.out.println("Enter data to add: ");
                                        int datay=sc.nextInt();
                                        System.out.println("what should be next node?(1.null/2.nodefromanotherLink)");
                                        int choosey=sc.nextInt();
                                        if(choosey==1)
                                                sll2.addLast(datay);
                                        else{
                                                System.out.println("Enter position of node in another linK: ");
                                                int posy=sc.nextInt();
                                                Node tempy=sll.head;
						while(tempy!=null && posy-2>0 && posy<=sll.countNode()){
							tempy=tempy.next;
							posy--;
						}
                                                sll2.addLast(datay,tempy.next);
                                        }
                                        break;

				case 3:
					System.out.println("Enter data to add: ");
					int data=sc.nextInt();
					Node temp=sll2.head;
					Node temp2=sll.head;
					while(temp2!=null && temp2.next!=null){
						temp2=temp2.next;
					}
					boolean flag=true;
					while(temp!=null){
						if(temp.data==data){
							temp2.next=temp;
							flag=false;
							break;
						}
						temp=temp.next;
					}
					if(flag)
                                        	sll.addLast(data);
					else{
						System.out.println("Comman link found for further");
					}
					break;
				case 4:
                                        System.out.println("Enter data to add: ");
                                        int data1=sc.nextInt();
                                        Node temp3=sll.head;
                                        Node temp4=sll2.head;
                                        while(temp4!=null && temp4.next!=null){
                                                temp4=temp4.next;
                                        }
                                        boolean flag1=true;
                                        while(temp3!=null){
                                                if(temp3.data==data1){
                                                        temp4.next=temp3;
                                                        flag1=false;
                                                        break;
                                                }
						temp3=temp3.next;
                                        }
                                        if(flag1)
                                                sll2.addLast(data1);
                                        else{
                                                System.out.println("Comman link found for further");
					}
                                        break;

				case 5:
					System.out.println("Enter data to add: ");
                                        int data3=sc.nextInt();
					System.out.println("Enter position: ");
					sll.addAtPos(sc.nextInt(),data3);
					break;
				case 6:
                                        System.out.println("Enter data to add: ");
                                        int data4=sc.nextInt();
                                        System.out.println("Enter position: ");
                                        sll2.addAtPos(sc.nextInt(),data4);
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
					Node temp5=sll.head;
					while(temp5!=null){
						temp5.marker=true;
						temp5=temp5.next;
					}
					Node temp6=sll2.head;
					boolean checker=false;
					while(temp6!=null){
						if(temp6.marker==true){
							checker=true;
							break;
						}
						temp6=temp6.next;
					}
					temp5=sll.head;
					while(temp5!=null){
						temp5.marker=false;
						temp5=temp5.next;
					}
					if(checker){
						System.out.println("Itersection of two node found at: "+temp6.data);
					}
					else
						System.out.println("Itersection not found at two node");
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

