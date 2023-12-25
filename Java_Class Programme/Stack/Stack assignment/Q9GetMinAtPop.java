/*
 9. Get min at pop
Now, we'll try to solve a famous stack problem.
You are given an array A of size N. You need to first push the elements of the array into a
stack and then print minimum in the stack at each pop until stack becomes empty.
Example 1:
Input:

N = 5
A = {1 2 3 4 5}
Output:
1 1 1 1 1
Explanation:
After pushing elements to the stack,
the stack will be "top -> 5, 4, 3, 2, 1".
Now, start popping elements from the stack
popping 5: min in the stack is 1.popped 5
popping 4: min in the stack is 1. popped 4
popping 3: min in the stack is 1. popped 3
popping 2: min in the stack is 1. popped 2
popping 1: min in the stack is 1. popped 1
Example 2:
Input:
N = 7
A = {1 6 43 1 2 0 5}
Output:
0 0 1 1 1 1 1
Explanation:
After pushing the elements to the stack,
the stack will be 5->0->2->1->43->6->1.
Now, poping the elements from the stack:
popping 5: min in the stack is 0. popped 5
popping 0: min in the stack is 0. popped 0
popping 2: min in the stack is 1. popped 2
popping 1: min in the stack is 1. popped 1
popping 43: min in the stack is 1.
popped 43
popping 6: min in the stack is 1. popped 6
popping 1: min in the stack is 1. popped 1.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
Constraints:
0 <= Ai <= 107
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
	int [] getMinAtPop(){
		int arr[]= new int[maxSize];
		for(int i=0;i<maxSize;i++){
			int min=Integer.MAX_VALUE;
			for(int j=0;j<=top;j++){
				if(min>stackArr[j])
					min=stackArr[j];
			}
			arr[i]=min;
			top--;
		}
		return arr;
	}

}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter stack size: ");
		Stack s= new Stack(sc.nextInt());
		System.out.println("Stack create succesfully");
		char ch;
		do{
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.empty");
			System.out.println("5.size");
			System.out.println("6.printStack");
			System.out.println("7.getMinAtPop");
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
					int[] arr=s.getMinAtPop();
					System.out.println("Output: ");
					for(int i=0;i<arr.length;i++){
						System.out.print(arr[i]+"  , ");
					}
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





