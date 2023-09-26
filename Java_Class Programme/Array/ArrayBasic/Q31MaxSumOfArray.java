/*
 31] Sum of f(a[i], a[j]) over all pairs in an array of n integers

Given an array A of n integers, find the sum of f(a[i], a[j]) of all pairs (i, j) such
that (1 <= i < j <= n).
f(a[i], a[j]): if abs(a[j]-a[i]) > 1
f(a[i], a[j]) = a[j] - a[i]
else if abs(a[j]-a[i]) <= 1
f(a[i], a[j]) = 0

Example 1:
Input : arr[ ] = {6, 6, 4, 4}
Output : -8
Explanation:
All pairs are:
(6 - 6) + (4 - 6) + (4 - 6) +
(4 - 6) + (4 - 6) + (4 - 4) = -8
return -8.
Example 2:
Input : arr[ ] = {1, 2, 3, 1, 3}
Output: 4
Explanation: All pairs are:
(3-1) + (1-3) + (3-1) + (3-1) = 4
(1-2),(3-2),(1-1),(2-1),(3-3),(3-2) these pairs will give zero as their absolute
difference is <= 1
*/
import java.util.*;
class SumArray{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]= new int[];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			for(int j=0;j<i;j++){
				if(arr[j]-arr[i]>1){

