import java.util.*;
class ParathesisChecker{
	boolean vaildParathesisChecker(String str){
		Stack<Character> s= new Stack<Character>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='{' || ch=='[' || ch=='('){
			       s.push(ch);
		       	}
	 		else{
				if(s.empty())
					return false;
				else{
					char peekEle=(char)s.peek();
					if((ch=='}' && peekEle=='{') || (ch==']'&& peekEle=='[') ||(ch==')' && peekEle=='(')){
						s.pop();
					}
					else
						return false;
				}
			}		
		}
		return s.empty();
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string expression for checking: ");
		String str=sc.nextLine();
		if(new ParathesisChecker().vaildParathesisChecker(str))
			System.out.println("Balanced ");
		else
			System.out.println("Not balanced");;
	}
}
