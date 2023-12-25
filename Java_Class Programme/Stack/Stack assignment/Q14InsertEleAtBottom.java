/*
 14. Insert an Element at the Bottom of a Stack
You are given a stack St of N integers and an element X. You have to insert X at the
bottom of the given stack.
Example 1:
Input:
N = 5
X = 2
St = {4,3,2,1,8}
Output:
{2,4,3,2,1,8}
Explanation:
After insertion of 2, the final stack will be {2,4,3,2,1,8}.
Example 2:
Input:
N = 3
X = 4
St = {5,3,1}
Output:
{4,5,3,1}
Explanation:
After insertion of 4, the final stack will be {4,5,3,1}.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 <= N <= 105
1 <= X, Elements of Stack <= 103
Sum of N over all test cases doesn't exceeds 106
 */
import java.util.Stack;
class Q14InsertEleAtBott{
	static void insertAtBott(Stack<Integer> s,int x){
		int size=s.size();
		int arr[]= new int[size];
		int i=0;
		while(!s.empty()){
			arr[i]=s.pop();
			i++;
		}
		s.push(x);
		i=size-1;
		while(i>=0){
			s.push(arr[i]);
			i--;
		}
	}
	public static void main(String [] args){
		Stack<Integer> s= new Stack<Integer>();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(8);
		System.out.println(s);
		int x=2;
		insertAtBott(s,x);
		System.out.println("Output: "+s);

	}
}
