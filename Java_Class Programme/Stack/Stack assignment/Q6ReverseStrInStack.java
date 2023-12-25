/*
 6. Reverse a string using Stack
You are given a string S, the task is to reverse the string using stack.
Example 1:
Input: S="GeeksforGeeks"

Output: skeeGrofskeeG

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 ≤ length of the string ≤ 100
 */
import java.util.Scanner;
class StackNode{
	StackNode next=null;
	char data;
	StackNode(char data){
		this.data=data;
	}
}
class Stack{
	int top=-1;
	StackNode head=null;
	void push(char data){
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
	char pop(){
		if(top==-1){
			System.out.println("Stack underflow");
			return ' ';
		}
		else if(top==0){
			top--;
			char ch=head.data;
			head=null;
			return ch;
		}
		else{
			StackNode temp=head;
			while(temp.next.next!=null){
				temp=temp.next;
			}
			char ch= temp.next.data;
			temp.next=null;
			top--;
			return ch;
		}
	}
	char peek(){
		if(top==-1){
			System.out.println("stack is empty");
			return ' ';
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
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string do you want reverse: ");
		String str=sc.nextLine();
		Stack s= new Stack();
		for(int i=0;i<str.length();i++){
			s.push(str.charAt(i));
		}
		char ch[]= new char[str.length()];
		int i=0;
		//s.printStack();
		//System.out.println(s.pop());
		while(!s.empty()){
			ch[i]=s.pop();
			i++;
		}
		System.out.println("Reveresd string is: "+new String(ch));
	}
}
