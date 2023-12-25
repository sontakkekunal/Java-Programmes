/*
 11. Reversing the equation
Given a mathematical equation that contains only numbers and +, -, *, /. Print the
equation in reverse, such that the equation is reversed, but the numbers remain the same.
It is guaranteed that the given equation is valid, and there are no leading zeros.
Example 1:
Input:
S = "20-3+5*2"
Output: 2*5+3-20
Explanation: The equation is reversed with
numbers remaining the same.
Example 2:
Input:
S = "5+2*56-2/4"
Output: 4/2-56*2+5
Explanation: The equation is reversed with
numbers remaining the same.
Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).
Constraints:
1<=|S|<=105
The string contains only the characters '0' - '9', '+', '-', '*', and '/'.
*/
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
class Q11ReversingTheEqa{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the equation: ");
		String str=sc.nextLine();
		Stack<String> s= new Stack<String>();
		StringTokenizer st= new StringTokenizer(str,"+*-/");
		int i=0;
		while(st.hasMoreElements()){
			String str1=(String)st.nextElement();
			s.push(str1);
			while(i<str.length()){
				int n=(int)str.charAt(i);
				if(n<48){
					s.push(str.charAt(i)+"");
					i++;
					break;
				}
				if(n>57){
                                        s.push(str.charAt(i)+"");
                                        i++;
                                        break;
                                }
				i++;
			}
		}
		//System.out.println(s);
		String strR="";
		while(!s.empty()){
			strR=strR+s.pop();
		}
		System.out.println("Reversed string is: "+strR);

	}
}
