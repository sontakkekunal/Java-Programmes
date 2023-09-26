/*
 15] IPL 2021 - Match Day 2
Due to the rise of covid-19 cases in India, this year BCCI decided to organize
knock-out matches in IPL rather than a league.
Today is matchday 2 and it is between the most loved team Chennai Super Kings
and the most underrated team - Punjab Kings. Stephen Fleming, the head coach of
CSK, analyzing the batting stats of Punjab. He has stats of runs scored by all N
players in the previous season and he wants to find the maximum score for each
and every contiguous sub-list of size K to strategize for the game.
Example 1:
Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output:
3 3 4 5 5 5 6
Explanation:
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6
Example 2:
Input:
N = 10, K = 4
arr[] = 8 5 10 7 9 4 15 12 90 13
Output:
10 10 10 15 15 90 90

Explanation:
1st contiguous subarray = {8 5 10 7}, Max = 10
2nd contiguous subarray = {5 10 7 9}, Max = 10
3rd contiguous subarray = {10 7 9 4}, Max = 10
4th contiguous subarray = {7 9 4 15}, Max = 15
5th contiguous subarray = {9 4 15 12}, Max = 15
6th contiguous subarray = {4 15 12 90}, Max = 90
7th contiguous subarray = {15 12 90 13}, Max = 90
*/
import java.util.*;
class Q15IPL{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter k: ");
                int k=sc.nextInt();
                for(int i=0;i<arr.length;i++){
                        int d=i;
                        int max=0;
                        if(size-k==i-1)
                                break;
                        for(int j=1;j<=k;j++){
                                if(j==1)
                                        max=arr[d];
                                if(arr[d]>max)
                                        max=arr[d];
                                d++;
                        }
                        System.out.print(max+" ");
                }
        }
}

