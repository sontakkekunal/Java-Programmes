/*
 13. Stack Operations
This Java module deals with Stacks, Queues, and ArrayLists. We'll perform various
operations on them.
Given a stack of integers and Q queries. The task is to perform operation on stack
according to the query.
Note: use push() to add element in the stack, peek() to get topmost element without
removal, pop() gives topmost element with removal, search() to return position if found
else -1.
Input Format:

First line of input contains nubmer of testcases T. For each testcase, first line of input
contains Q, number of queries. Next line contains Q queries seperated by space. Queries
are as:
i x : (adds element x in the stack).
r : (returns and removes the topmost element from the stack).
h : Prints the topmost element.
f y : (check if the element y is present or not in the stack). Print "Yes" if present, else
"No".
Output Format:
For each testcase, perform Q queries and print the output wherever required.
Constraints:
1 <= T <= 100
1 <= Q <= 103
Example:
Input:
2
6
i 2 i 4 i 3 i 5 h f 8
4
i 3 i 4 r f 3
Output:
5
No
Yes
Explanation:
Testcase 1: Inserting 2, 4, 3, and 5 onto the stack. Returning top element which is 5.
Finding 8 will give No, as 8 is not in the stack.
*/
import java.util.Scanner;
class Stack{
	int top=-1;
	int maxSize;
	int stackArr[];
	Stack(int size){
		this.maxSize=size;
		stackArr=new int[size];
	}
	void push(int data){
		if(top==maxSize-1){
			System.out.println("Stack OverFlow");
			return;
		}
		else{
			top++;
			stackArr[top]=data;
			System.out.println("Elements pushed in the stack succefully");
		}
	}
	boolean empty(){
		if(top==-1)
			return true;
		else
			return false;
	}
	int pop(){
		if(top==-1){
			System.out.println("Stack underflow");
			return -1;
		}
		else{
			int val=top;
			top--;
			System.out.println("elements poped out of stack succefully");
			return stackArr[val];
		}
	}
	int peek(){
		if(empty()){
			System.out.println("stack is empty");
			return -1;
		}
		else{
			return stackArr[top];
		}
	}
	int size(){
		return top;//do +1 while calling method for getting actuall size,(this gives onlt index)
	}
	void printStack(){
		if(empty()){
			System.out.println("Nothing to print");
			return;
		}
		else{
			System.out.print("[ ");
			for(int i=0;i<=top;i++){
				System.out.print(stackArr[i]+" , ");
			}
			System.out.println("]");
		}
	}
	int search(int val){
		for(int i=0;i<maxSize;i++){
			if(val==stackArr[i])
				return i;
		}
		return -1;
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of queries: ");
		int queries=sc.nextInt();
		int q=1;
		while(queries!=0){
			System.out.println("queries no"+q);
			System.out.println("Enter the size of stack: ");
			int size=sc.nextInt();
			Stack s= new Stack(size);
			System.out.println("Enter the operation on stack in form of exp: ");
			sc.nextLine();
			String str=sc.nextLine();
			int i=0;
			while(i<str.length()){
				if(str.charAt(i)=='i'){
					int val=Integer.parseInt(str.charAt(i+1)+"");
					s.push(val);
					i=i+2;
				}
				else if(str.charAt(i)=='h'){
					System.out.println("topmost element is: "+s.peek());
					i++;
				}
				else if(str.charAt(i)=='f'){
					int val=Integer.parseInt(str.charAt(i+1)+"");
					if(s.search(val)!=-1)
						System.out.println("Yes");
					else 
						System.out.println("No");
					i=i+2;
				}
				else{
					System.out.println("Invaild operation experation");
					break;
				}
			}
			queries--;
			q++;
		}
	}
}
