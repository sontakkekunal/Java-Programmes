/*
 29] Minimum Platforms

Given arrival and departure times of all trains that reach a railway station. Find the
minimum number of platforms required for the railway station so that no train is
kept waiting.
Consider that all the trains arrive on the same day and leave on the same day.
Arrival and departure time can never be the same for a train but we can have the
arrival time of one train equal to departure time of the other. At any given instance
of time, the same platform can not be used for both departure of a train and arrival
of another train. In such cases, we need different platforms.
Example 1:
Input: n = 6
arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
Output: 3
Explanation: Minimum 3 platforms are required to safely arrive and depart
all trains.
Example 2:
Input: n = 3
arr[] = {0900, 1100, 1235}
dep[] = {1000, 1200, 1240}
Output: 1
Explanation: Only 1 platform is required to safely manage the arrival and
departure of all trains.
Note: Time intervals are in the 24-hour format(HHMM) , where the first two
characters represent hours (between 00 to 23 ) and the last two characters represent
minutes (this may be > 59).
*/
import java.util.*;
class Q29MinimumPlatfroms{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of arrvel train : ");
		int size=sc.nextInt();
		System.out.println("Enter arravel time of trains: ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter leaving time of trains: ");
		int dep[]=new int[size];
		for(int i=0;i<dep.length;i++){
			dep[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<size;i++){
			try{
				if(dep[i]>=arr[i+1])
					count++;
			}catch(ArrayIndexOutOfBoundsException aiobe){
			}
		}
		if(count==0)
			count++;
		System.out.println("The minimum platfrom requered will be : "+count);
	}
}
