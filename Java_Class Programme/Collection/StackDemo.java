import java.util.Stack;
class StackDemo{
	public static void main(String [] args){
		Stack s= new Stack();
		s.push(10);//pushes the object at the TOP of the stack
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);//while printing insertion order is preserved because it is child of list,eventhough it is stack
		System.out.println(s.pop());//elements at TOP is removed and returned
		System.out.println(s);
		System.out.println(s.peek());//elements at TOP is returned;
		System.out.println(s.search(20));
		System.out.println(s.empty());
		}
}
