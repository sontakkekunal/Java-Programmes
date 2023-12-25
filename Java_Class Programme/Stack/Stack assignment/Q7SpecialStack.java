/*
 7. Special Stack
Design a data-structure SpecialStack that supports all the stack operations like push(),
pop(), isEmpty(), isFull() and an additional operation getMin() which should return
minimum element from the SpecialStack. Your task is to complete all the functions, using
stack data-Structure.
Example 1:
Input:
Stack: 18 19 29 15 16
Output: 15
Explanation:
The minimum element of the stack is 15.
Note: The output of the code will be the value returned by getMin() function.
Expected Time Complexity: O(N) for getMin, O(1) for remaining all 4 functions.
Expected Auxiliary Space: O(1) for all the 5 functions.
Constraints:
1 ≤ N ≤ 104
*/
import java.util.Scanner;
class StackNode{
	StackNode next=null;
	int data;
	StackNode(int data){
		this.data=data;
	}
}
class Stack{
	int top=-1;
	StackNode head=null;
	void push(int data){
			StackNode newStackNode= new StackNode(data);
		if(top==-1){
			head=newStackNode;
			top++;
		}
		else{
			StackNode temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newStackNode;
			top++;
		}
	}
	int pop(){
		if(top==-1){
			System.out.println("Stack underflow");
			return -1;
		}
		else if(top==0){
			int val=head.data;
			head=null;
			return val;
		}
		else{
			StackNode temp=head;
			while(temp.next.next!=null){
				temp=temp.next;
			}
			int data=temp.next.data;
			temp.next=null;
			top--;
			return data;
		}
	}
	int peek(){
		if(top==-1){
			System.out.println("stack is empty");
			return -1;
		}
		else{
			StackNode temp=head;
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
	int size(){
		return top;
	}
	void printStack(){
		if(top==-1){
			System.out.println("Nothing to print");
			return;
		}
		else if(top==0){
			System.out.println("[ "+head.data+" ]");
		}
		else{
			StackNode temp=head;
			System.out.print("[ ");
                        while(temp.next!=null){
				System.out.print(temp.data+" , ");
                                temp=temp.next;
                        }
			System.out.println(temp.data+" ]");
		}
	}
	int getMin(){
		StackNode temp=head;
		int min=Integer.MAX_VALUE;
		while(temp!=null){
			if(min>temp.data)
				min=temp.data;
			temp=temp.next;
		}
		return min;
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
			System.out.println("7.getMin");
			System.out.println("enter the choice 1/2/3/4/5/6/7: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data to add: ");
					s.push(sc.nextInt());
					break;
				case 2:
					s.pop();
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
					System.out.println("Minimum data in stack is: "+s.getMin());
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
