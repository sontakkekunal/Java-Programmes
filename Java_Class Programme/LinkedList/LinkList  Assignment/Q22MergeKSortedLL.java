/*
 22. Merge K sorted linked lists
Given K sorted linked lists of different sizes. The task is to merge them in such a way that after
merging they will be a single sorted linked list.
Example 1:
Input:
K = 4
value = {{1,2,3},{4 5},{5 6},{7,8}}
Output: 1 2 3 4 5 5 6 7 8

Explanation:
The test case has 4 sorted linked
list of size 3, 2, 2, 2
1st list 1 -> 2-> 3
2nd list 4->5
3rd list 5->6
4th list 7->8
The merged list will be
1->2->3->4->5->5->6->7->8.
Example 2:
Input:
K = 3
value = {{1,3},{4,5,6},{8}}
Output: 1 3 4 5 6 8
Explanation:
The test case has 3 sorted linked
list of size 2, 3, 1.
1st list 1 -> 3
2nd list 4 -> 5 -> 6
3rd list 8
The merged list will be
1->3->4->5->6->8.
Expected Time Complexity: O(nk Logk)
Expected Auxiliary Space: O(k)
Note: n is the maximum size of all the k link list
Constraints
1 <= K <= 103
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
	int partition(SingleLinkedList arr[],int arr1[],int start,int end){
		int element=arr1[end];
		int i=-1;
		for(int j=0;j<end;j++){
			if(arr1[j]<element){
				i++;
				int temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;

				SingleLinkedList temp1=arr[i];
				arr[i]=arr[j];
				arr[j]=temp1;
			}
		}
		int temp=arr1[i+1];
                arr1[i+1]=arr1[end];
                arr1[end]=temp;

               SingleLinkedList temp1=arr[i+1];
               arr[i+1]=arr[end];
               arr[end]=temp1;
	       return i+1;
	}
	void quickSort(SingleLinkedList arr[],int arr1[],int start, int end){
		if(start<end){
			int pivote=partition(arr,arr1,start,end);
			quickSort(arr,arr1,start,pivote-1);
			quickSort(arr,arr1,pivote+1,end);
		}
	}

	public static void main(String [] args){
		char ch1=' ';
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter k sorted List: ");
		int k=sc.nextInt();
		int i=k;
		SingleLinkedList arr[] = new SingleLinkedList[k];
		for(int x=0;x<arr.length;x++){
			arr[x]=new SingleLinkedList();
		}
		do{
			//if((ch1=='n' || ch1=='N') && i==1)
			//	i--;
			int j=k-i;
			System.out.println("Operation on list: "+(k-i+1));
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.printLL");
			System.out.println("5.countNode");
			System.out.println("6.deleteFirst");
			System.out.println("7.deleteLast");
			System.out.println("8.deleteAtPos");
			System.out.println("Enter 1/2/3/4/5/6/7/8 for choosing above funtionlity");
			int choice =sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data to add: ");
					arr[j].addFirst(sc.nextInt());
					break;
				case 2: 
					System.out.println("Enter data to add: ");
                                        arr[j].addLast(sc.nextInt());
					break;
				case 3:

					System.out.println("Enter data to add: ");
                                        int data=sc.nextInt();
					System.out.println("Enter position: ");
					arr[j].addAtPos(sc.nextInt(),data);
					break;
				case 4:
					System.out.println("LinkedList is: ");
					arr[j].printLL();
					break;
				case 5:
					System.out.println("Count of node is: "+arr[j].countNode());
					break;
				case 6:
					arr[j].deleteFirst();
					break;
				case 7:
					arr[j].deleteLast();
					break;
				case 8:
					System.out.println("Enter position to delete");
					arr[j].deleteAtPos(sc.nextInt());
					break;
				default:
					System.out.println("please enter vaild choice");
					break;
			}
			System.out.println("Do you want to continue operation on "+(k-i+1)+" list(y/n): ");
			ch1=sc.next().charAt(0);
			if((ch1=='n' || ch1=='N'))
				i--;
		}
		while(!(i==0 && (ch1=='n' || ch1=='N')));
		int arr1[]= new int[k];
		for(int x=0;x<k;x++){
			arr1[x]=arr[x].head.data;
		}
		new Client().quickSort(arr,arr1,0,k-1);
		Node temp1=null;
		for(int x=0;x<k;x++){
			SingleLinkedList temp=arr[x];
			if(x!=0)
				temp1.next=temp.head;
			temp1=temp.head;
			while(temp1.next!=null){
				temp1=temp1.next;
			}
		}
		System.out.println("Merged sorted list is: ");
		arr[0].printLL();

	}
}
