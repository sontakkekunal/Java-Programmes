/*
 4. Delete middle element of a stack
Given a stack, delete the middle element of the stack without using any additional data
structure.
Middle element:- floor((size_of_stack+1)/2) (1-based indexing) from bottom of the stack.

Note: The output shown by the compiler is the stack from top to bottom.
Example 1:
Input:
Stack = {10, 20, 30, 40, 50}
Output:
ModifiedStack = {10, 20, 40, 50}
Explanation:
If you print the stack the bottom-most element will be 10 and the top-most element will
be 50. Middle element will be element at index 3 from bottom, which is 30. Deleting 30,
stack will look like {10 20 40 50}.
Example 2:
Input:
Stack = {10 20 30 40}
Output:
ModifiedStack = {10 30 40}
Explanation:
If you print the stack the bottom-most element will be 10 and the top-most element will
be 40. Middle element will be element at index 2 from bottom, which is 20. Deleting 20,
stack will look like {10 30 40}.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
2 ≤ size of stack ≤ 105
*/
import java.util.Scanner;
class Node{
	Node next=null;
	int data;
	Node(int data){
		this.data=data;
	}
}
class Stack{
	Node head=null;
	int top=-1;
	void push(int data){
		Node newNode= new Node(data);
		if(top==-1){
			head=newNode;
			top++;
		}
		else{
			top++;
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next= newNode;
		}
		System.out.println("Node added in stack successfully");
	}
	int pop(){
		if(top==-1){
			System.out.println("Stack UnderFlow");
			return -1;
		}
		else if(top==0){
			top--;
			Node temp=head;
			head=null;
			System.out.println("element deleted in stack successfully");
			return temp.data;
		}
		else{
			top--;
			Node temp=head;
                        while(temp.next.next!=null){
                                temp=temp.next;
                        }
			Node temp2=temp.next;
			//System.out.println("K "+temp2.data);
			//System.out.println("K "+temp.data);
                        temp.next=null;
			System.out.println("element deleted in stack successfully");
			return temp2.data;
		}
	}
	int peek(){
		if(top==-1){
                        System.out.println("Stack UnderFlow");
                        return -1;
                }
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			return temp.data;
		}
	}
	boolean empty(){
		if(top==-1)
			return true;
		else
			return false;
	}
	void printStack(){
		if(top==-1){
                        System.out.println("Stack UnderFlow");
                        return ;
                }
		Node temp=head;
		System.out.println("Stack is: ");
		System.out.print("[ ");
		while(temp.next!=null){
			System.out.print(temp.data+" , ");
			temp=temp.next;
		}
		System.out.println(temp.data+" ]");
	}
	void removalMidOfStack(){
		if(top==-1){
                        System.out.println("Stack UnderFlow");
                        return ;
                }
		else{
			int index=(top+1);
			Node slow=head;
			index=index/2;
			int count=0;
			while(count<(top/2)-1){
				slow=slow.next;
				count++;
			}
			Node temp2=slow.next.next;
			slow.next=temp2;
		}
		System.out.println("Modified stack is: ");
		printStack();
	}
	int size(){
		return top;
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		Stack s= new Stack();
		System.out.println("Stack create succesfully");
		char ch;
		do{
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.empty");
			System.out.println("5.size");
			System.out.println("6.printStack");
			System.out.println("7.removalMidOfStack");
			System.out.println("enter the choice 1/2/3/4/5/6/7: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data to add: ");
					s.push(sc.nextInt());
					break;
				case 2:
					System.out.println("Ele poped is: "+s.pop());
					break;
				case 3:
					if(s.peek()!=-1)
						System.out.println("peek elements is: "+s.peek());
					break;
				case 4:
					if(s.empty())
						System.out.println("Stack is empty");
					else
						System.out.println("Stack is not empty");
					break;
				case 5:
					System.out.println("Size of the stack is: "+(s.size()+1));
					break;
				case 6:
					System.out.println("Stack is: ");
					s.printStack();
					break;
				case 7:
					s.removalMidOfStack();
					break;
				default:
					System.out.println("pleasse enter vaild choice");
					break;
			}
			System.out.println("Do you want to contimue?(y/n)");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='y');
	}
}

