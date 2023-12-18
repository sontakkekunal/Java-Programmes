import java.util.Stack;
class StackDemo{
	public static void main(String [] args){
		Stack<Integer> s= new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.peek());
		System.out.println(s);
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s);
		System.out.println(s.empty());


	}
}
