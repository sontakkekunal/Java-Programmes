/*
 2. Implement stack using array
Write a program to implement a Stack using Array. Your task is to use the class as shown
in the comments in the code editor and complete the functions push() and pop() to
implement a stack.
Example 1:
Input:
push(2)
push(3)
pop()
push(4)
pop()
Output: 3, 4
Explanation:
push(2) the stack will be {2}
push(3) the stack will be {2 3}
pop() poped element will be 3,
the stack will be {2}
push(4) the stack will be {2 4}
pop() poped element will be 4
Example 2:
Input:
pop()

push(4)
push(5)
pop()
Output: -1, 5
Expected Time Complexity : O(1) for both push() and pop().
Expected Auixilliary Space : O(1) for both push() and pop().
Constraints:
1 <= Q <= 100
1 <= x <= 100
 */
import java.util.Scanner;
class Stack{
	int maxSize;
	int top;
	int stackArr[];
      	 Stack(int size){
		 this.maxSize=size;
		 this.top=-1;
		 this.stackArr= new int[size];
	 }
	 void push(int data){
		 if(top==maxSize-1){
			 System.out.println("Stack is full");
			 return;
		 }
		 else{
			 top++;
			 stackArr[top]=data;
			 System.out.println("Element added succesfully");
		 }
	 }
	 int pop(){
		 if(top==-1){
			 System.out.println("Stack is empty");
			 return -1;
		 }
		 else{
			 int val=stackArr[top];
			 top--;
			 return val;
		 }
	 }
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of stack: ");
		int size=sc.nextInt();
		Stack s= new Stack(size);
		char ch;
		do{
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("Choose any above operation 1/2: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data to push: ");
					s.push(sc.nextInt());
					break;
				case 2:
					System.out.println("element poped is: "+s.pop());
					break;
				default:
					System.out.println("Invaild choice");
					break;
			}
			System.out.println("Continue? ");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
	}
}

