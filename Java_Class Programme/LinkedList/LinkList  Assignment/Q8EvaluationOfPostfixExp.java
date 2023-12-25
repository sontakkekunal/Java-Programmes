/*
 8. Evaluation of Postfix Expression
Given string S representing a postfix expression, the task is to evaluate the expression
and find the final value. Operators will only include the basic arithmetic operators like *,
/, + and -.
Example 1:
Input: S = "231*+9-"
Output: -4
Explanation:
After solving the given expression,
we have -4 as a result.
Example 2:
Input: S = "123+*8-"
Output: -3
Explanation:
After solving the given postfix
expression, we have -3 as a result.
Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)
Constraints:
1 ≤ |S| ≤ 105
0 ≤ |Si|≤ 9 (And given operators)
*/
import java.util.Scanner;
import java.util.Stack;
class Q8EvaluationOfPostfixExp{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string exp: ");
		String str=sc.nextLine();
		Stack<Integer> s= new Stack<Integer>();
		for(int i=0;i<str.length();i++){
			char ch= str.charAt(i);
			if(ch=='+' ){
				if(s.empty()){
					System.out.println("please enter vaild exp");
					break;
				}
				int a=s.pop();
				int b=0;
				if(!s.empty())
					b=s.pop();
				s.push(b+a);
			}
			else if( ch=='*'){
                                if(s.empty()){
                                        System.out.println("please enter vaild exp");
                                        break;
                                }
                                int a=s.pop();
                                int b=0;
                                if(!s.empty())
                                        b=s.pop();
                                s.push(b*a);
                        }
			else if( ch=='-'){
                                if(s.empty()){
                                        System.out.println("please enter vaild exp");
                                        break;
                                }
                                int a=s.pop();
                                int b=0;
                                if(!s.empty())
                                        b=s.pop();
                                s.push(b-a);
                        }
			else{
				s.push(Integer.parseInt(ch+""));
			}
			//System.out.println(s.peek());
		}
		System.out.println("Output is: "+s.peek());
	}
}
