/*
 3. Implement two stacks in an array

Your task is to implement 2 stacks in one array efficiently. You need to implement 4
methods.
push1 : pushes element into first stack.
push2 : pushes element into second stack.
pop1 : pops element from first stack and returns the popped element. If first stack is
empty, it should return -1.
pop2 : pops element from second stack and returns the popped element. If second stack is
empty, it should return -1.
Example 1:
Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()
Output:
3 4 -1
Explanation:

push1(2) the stack1 will be {2}
push1(3) the stack1 will be {2,3}
push2(4) the stack2 will be {4}
pop1() the poped element will be 3 from stack1 and stack1 will be {2}
pop2() the poped element will be 4 from stack2 and now stack2 is empty
pop2() the stack2 is now empty hence returned -1.
Example 2:
Input:
push1(1)
push2(2)
pop1()
push1(3)
pop1()
pop1()
Output:
1 3 -1
Explanation:
push1(1) the stack1 will be {1}
push2(2) the stack2 will be {2}
pop1() the poped element will be 1 from stack1 and stack1 will be empty
push1(3) the stack1 will be {3}
pop1() the poped element will be 3 from stack1 and stack1 will be empty
pop1() the stack1 is now empty hence returned -1.
Expected Time Complexity: O(1) for all the four methods.
Expected Auxiliary Space: O(1) for all the four methods.
Constraints:
1 <= Number of queries <= 104
1 <= Number of elements in the stack <= 100
The sum of count of elements in both the stacks < size of the given array
*/
import java.util.Scanner;
class Stack{
	int top1;
	int top2;
	int maxSize;
	int stackArr[];
	Stack(int size){
		this.maxSize=size;
		this.top1=-1;
		this.top2=size;
		stackArr=new int[size];
	}
	boolean empty(){
		if(top2-top1>1)
			return true;
		else 
			return false;
	}
	void push1(int data){
		if(!empty()){
			System.out.println("Stack 1 is full");
			return ;
		}
		else{
			top1++;
			stackArr[top1]=data;
			System.out.println("Data added successfully in stack 1");
		}
	}
	void push2(int data){
                if(!empty()){
                        System.out.println("Stack 2 is full");
                        return ;
                }
                else{
                        top2--;
                        stackArr[top2]=data;
                        System.out.println("Data added successfully in stack 2");
                }
        }
	int pop1(){
		if(top1==-1){
			System.out.println("Stack 1 is empty");
			return -1;
		}
		else{
			int val=stackArr[top1];
			top1--;
			return val;
		}
	}
	int pop2(){
		if(top2==maxSize){
			System.out.println("Stack 1 is empty");
                        return -1;
                }
                else{
                        int val=stackArr[top2];
                        top2++;
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
			System.out.println("1.push1");
			System.out.println("2.pop1");
			System.out.println("3.push2");
			System.out.println("4.pop2");
			System.out.println("Choose any above operation 1/2: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data to push in stack1 : ");
					s.push1(sc.nextInt());
					break;
				case 2:
					System.out.println("element poped from stack1 is: "+s.pop1());
					break;
				case 3:
                                        System.out.println("Enter data to push in stack2: ");
                                        s.push2(sc.nextInt());
                                        break;
                                case 4:
                                        System.out.println("element poped from stack2 is: "+s.pop2());
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
