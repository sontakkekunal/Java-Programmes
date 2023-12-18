import java.util.Scanner;
class TwoStackUsingArr{
	int top1;
	int top2;
	int maxSize;
	int stackArr[];
	TwoStackUsingArr(int size){
		this.maxSize=size;
		this.top1=-1;
		this.top2=size;
		this.stackArr=new int[size];
	}
	boolean empty(){
		if(top2-top1>1)
			return true;
		else
			return false;
	}
	void push1(int data){
		if(!empty()){
			System.out.println("Stack Overflow");
			return;
		}
		else{
			top1++;
			stackArr[top1]=data;
			System.out.println(stackArr[top1]+" pushed in stack 1");
		}
	}
	void push2(int data){
		if(!empty()){
			System.out.println("Stack Overflow");
                        return;
                }
                else{
                        top2--;
                        stackArr[top2]=data;
			System.out.println(stackArr[top2]+" pushed in stack 2");
                }
	}
	int pop1(){
		if(top1==-1){
			System.out.println("Stack UnderFlow");
			return -1;
		}
		else{
			top1--;
			System.out.println(stackArr[top1+1]+" poped from stack 1");
			return stackArr[top1+1];
		}
	}
	int pop2(){
		if(top2==maxSize){
                        System.out.println("Stack UnderFlow");
                        return -1;
                }
                else{
                        top2++;
			System.out.println(stackArr[top2-1]+" poped from stack 2");
			return stackArr[top2-1];
                }
        
	}
	int size(){
		System.out.println("Stack 1 size is: "+(top1+1));
		System.out.println("Stack 2 size is: "+(maxSize-top2));
		return (top1+1)+(maxSize-top2);
	}
	void printStacks(){
		System.out.println("Stack 1 is: ");
		System.out.print("[ ");
		for(int i=0;i<=top1;i++){
			if(i!=top1)
				System.out.print(stackArr[i]+" , ");
			else
				System.out.print(stackArr[i]);
		}
		System.out.println(" ]");
		System.out.println("Stack 2 is: ");
		System.out.print("[ ");
                for(int i=maxSize-1;i>=top2;i--){
			if(i!=top2)
                        	System.out.print(stackArr[i]+" , ");
			else
				System.out.print(stackArr[i]);
                }
		System.out.println("  ] ");
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		TwoStackUsingArr tsua = new TwoStackUsingArr(size);
		char ch;
		System.out.println("two stack succefully created in array");
		do{
			System.out.println("1.push1");
			System.out.println("2.pop1");
			System.out.println("3.push2");
			System.out.println("4.pop2");
			System.out.println("5.empty");
			System.out.println("6.size");
			System.out.println("7.printStacks");
			System.out.println("Enter choice 1/2/3/4/5/6/7: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data stack 1: ");
					tsua.push1(sc.nextInt());
					break;
				case 2:
					tsua.pop1();
					break;
				case 3:
					System.out.println("Enter data stack 2: ");
                                        tsua.push2(sc.nextInt());
					break;
				case 4:
					tsua.pop2();
					break;
				case 5:
					if(tsua.empty())
						System.out.println("stack is empty");
					else
						System.out.println("stack is not  empty");
					break;
				case 6:
					int size1=tsua.size();
					System.out.println("total size of stack1 and stack2 is :"+size1+"\nRemaning slots is: "+(size-size1));
					break;
				case 7:
					tsua.printStacks();
					break;

				default:
					System.out.println("Invaild choice");
					break;
			}
			System.out.println("Countinue?");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
	}
}
