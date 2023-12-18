import java.util.*;
class MergeStack{
	Stack<Integer> mergeSortedStack(Stack <Integer>s1,Stack <Integer>s2){
			Stack<Integer> s3= new Stack<Integer>();
			while(!s1.empty() && !s2.empty()){
				if(s1.peek()>s2.peek()){
					s3.push(s1.pop());
				}
				else{
					s3.push(s2.pop());
				}
			}
			while(!s1.empty()){
				s3.push(s1.pop());
			}
			while(!s2.empty()){
                                s3.push(s2.pop());
                        }
			while(!s3.empty()){
				s2.push(s3.pop());
			}
			return s2;
	}
}
class Clinet{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		char ch;
		Stack<Integer> s1= new Stack<Integer>();
		Stack<Integer> s2= new Stack<Integer>();
		do{
			System.out.println("1.push1");
			System.out.println("2.pop1");
			System.out.println("3.push2");
			System.out.println("4.pop2");
			System.out.println("5.print1");
			System.out.println("6.print2");
			System.out.println("7.mergetwoSortedStack");
			System.out.println("Enter choice 1/2/3/4/5/6/7: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter data: ");
					s1.push(sc.nextInt());
					break;
				case 2:
					s1.pop();
					break;
				case 3:
					System.out.println("Enter data: ");
                                        s2.push(sc.nextInt());
					break;
				case 4:
					s2.pop();
					break;
				case 5:
					System.out.println(s1);
					break;
				case 6:
					System.out.println(s2);
					break;
				case 7:
					MergeStack ms= new MergeStack();
					System.out.println("merged sorted stack is: "+ms.mergeSortedStack(s1,s2));
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
