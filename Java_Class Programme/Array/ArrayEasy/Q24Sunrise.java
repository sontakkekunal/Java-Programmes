/*
 Que 24 : Facing the Sun
Given an array H representing heights of buildings. You have to count the buildings
which will see the sunrise (Assume : Sun rises on the side of the array starting point).
Note : Height of building should be strictly greater than height of buildings in left in
order to see the sun.

Example 1:
Input:
N = 5
H[] = {7, 4, 8, 2, 9}
Output: 3
Explanation: As 7 is the first element, it can see the sunrise. 4 can't see the
sunrise as 7 is hiding it. 8 can see. 2 can't see the sunrise. 9 also can see the
sunrise.
Example 2:
Input:
N = 4
H[] = {2, 3, 4, 5}
Output: 4
Explanation: As 2 is the first element, it can see the sunrise. 3 can see the sunrise
as 2 is not hiding it. Same for 4 and 5, they also can see the sunrise.
*/
import java.util.*;
class Q24Sunrise{
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[]=new int[size];
		int count=0;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			boolean flag=true;
			for(int j=0;j<i;j++){
				if((arr[j]>arr[i])){
					flag=false;
				}
			}
			if(flag){
				count++;
			}
		}
		System.out.println("No. of buildings can see sunrise are: "+count);
	}
}
