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
class Q11ReversingTheEqa{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the equation: ");
		String str=sc.nextLine();
		Stack<Character> s= new Stack<Character>();
		boolean flag=true;
		int j=0;
		for(int i=0;i<str.length();i++){
			int n=(int)str.charAt(i);
			if(n>=48 && n<=57 ){
				if(flag){
					j=i;
					flag=false;
				}
			}
			else{
				int k=i-1;
				while(j<=k && flag==false){
				//	System.out.println(str.charAt(k)+"KK");
					s.push(str.charAt(k));
					k--;;
				}
				flag=true;
				s.push(str.charAt(i));
			//	System.out.println(str.charAt(i));
			}
		}
		int k=str.length()-1;
                while(j<=k && flag==false){
      			s.push(str.charAt(k));
                        k--;;
                }
		//System.out.println(s);
		char arr[] = new char[str.length()];
		int i=0;
		while(!s.empty()){
			arr[i]=s.pop();
			i++;
		}
		System.out.println("Reversed string is: "+new String(arr));

	}
}
