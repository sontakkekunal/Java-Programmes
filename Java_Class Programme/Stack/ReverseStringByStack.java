import java.util.*;
class ReverseStringByStack{
	String reverseStrByStack(String str){
		Stack<Character> s= new Stack<Character>();
		for(int i=0;i<str.length();i++){
			s.push(str.charAt(i));
		}
		char ch[]= new char[str.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.pop();
		}
		return new String(ch);
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String : ");
		String str= sc.nextLine();
		ReverseStringByStack rscb= new ReverseStringByStack();
		System.out.println("Reversed string is: "+rscb.reverseStrByStack(str));
	}
}
