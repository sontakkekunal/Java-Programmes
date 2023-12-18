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
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		DoubleLinkedList dll= new DoubleLinkedList();
		DoubleLinkedList dll2= new DoubleLinkedList();
		System.out.println("Two double linked list created");
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
			System.out.println("17.sumOfTwoLL");
			System.out.println("Enter 1/2/3/4/5/6/7/8/9/10/11/12/13/14/15/16/17 for choosing above funtionlity");
			int choice =sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data to add: ");
					dll.addFirst(sc.nextInt());
					break;
				case 2:
                                        System.out.println("Enter data to add: ");
                                        dll2.addFirst(sc.nextInt());
                                        break;
				case 3:
					System.out.println("Enter data to add: ");
                                        dll.addLast(sc.nextInt());
					break;
				case 4:
                                        System.out.println("Enter data to add: ");
                                        dll2.addLast(sc.nextInt());
                                        break;
				case 5:
					System.out.println("Enter data to add: ");
                                        int data=sc.nextInt();
					System.out.println("Enter position: ");
					dll.addAtPos(sc.nextInt(),data);
					break;
				case 6:
                                        System.out.println("Enter data to add: ");
                                        int data1=sc.nextInt();
                                        System.out.println("Enter position: ");
                                        dll2.addAtPos(sc.nextInt(),data1);
                                        break;
				case 7:
					System.out.println("LinkedList is: ");
					dll.printLL();
					break;
				case 8:
                                        System.out.println("LinkedList is: ");
                                        dll2.printLL();
                                        break;
				case 9:
					System.out.println("Count of node is: "+dll.countNode());
					break;
				case 10:
                                        System.out.println("Count of node is: "+dll2.countNode());
                                        break;
				case 11:
					dll.deleteFirst();
					break;
				case 12:
                                        dll2.deleteFirst();
                                        break;
				case 13:
					dll.deleteLast();
					break;
				case 14:
                                        dll2.deleteLast();
                                        break;
				case 15:
					System.out.println("Enter position to delete");
					dll.deletAtPos(sc.nextInt());
					break;
				case 16:
                                        System.out.println("Enter position to delete");
                                        dll2.deletAtPos(sc.nextInt());
                                        break;
				case 17:
					Node temp1=dll.head;
					Node temp2=dll2.head;
					while(temp1.next!=null){
						temp1=temp1.next;
					}
					while(temp2.next!=null){
						temp2=temp2.next;
					}
					int carry=0;
					DoubleLinkedList dllResult= new DoubleLinkedList();
					while(temp1!=null && temp2!=null){
						int result =temp1.data+temp2.data+carry;
						int temp=result;
						result=temp%10;
						carry=temp/10;
						dllResult.addFirst(result);
						temp1=temp1.previous;
						temp2=temp2.previous;
					}
					boolean flag=true;
					while(temp1!=null){
						int sum=temp1.data+carry;
						if(flag && sum>9){
							dllResult.addFirst(sum%10);
							carry=sum/10;
						}
						else{
							dllResult.addFirst(sum);
							carry=sum/10;
						}
						if(carry<=0)
							flag=false;
						temp1=temp1.previous;
					}
					while(temp2!=null){
                                                int sum=temp2.data+carry;
                                                if(flag && sum>9){
                                                        dllResult.addFirst(sum%10);
                                                        carry=sum/10;
                                                }
                                                else{
                                                        dllResult.addFirst(sum);
                                                        carry=sum/10;
                                                }
                                                if(carry<=0)
                                                        flag=false;
                                                temp2=temp2.previous;
                                        }
					/*
					 //Or
					 boolean flag=true;
					 while(temp1!=null || temp2!=null){
						if(temp1!=null){
							int sum=temp1.data+carry
							if(flag && sum>9){
								dllResult.addFirst(sum%10);
								carry=sum/10;
							}
							else{
                	                                        dllResult.addFirst(sum);
        	                                                carry=sum/10;
	                                                }
							temp1=temp1.previous;
                	                        }
						else{
							int sum=temp2.data+carry
                                                        if(flag && sum>9){
                                                                dllResult.addFirst(sum%10);
                                                                carry=sum/10;
                                                        }
                                                        else{
                                                                dllResult.addFirst(sum);
                                                                carry=sum/10;
                                                        }
                                                        temp2=temp2.previous;
	                                        }
						if(carry<=0){
							flag=false;
						}
					 }
					 */
					System.out.println("Added linked list is: ");
					dllResult.printLL();
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
