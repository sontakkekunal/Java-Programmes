/*
 6] Largest Number formed from an Array

Given a list of non negative integers, arrange them in such a manner that they form
the largest number possible.The result is going to be very large, hence return the
result in the form of a string.
Example 1:
Input:
N = 5
Arr[] = {3, 30, 34, 5, 9}
Output: 9534330
Explanation: Given numbers are {3, 30, 34,
5, 9}, the arrangement 9534330 gives the
largest value.
Example 2:
Input:
N = 4
Arr[] = {54, 546, 548, 60}
Output: 6054854654
Explanation: Given numbers are {54, 546,
548, 60}, the arrangement 6054854654
gives the largest value.
*/
import java.util.*;
class Q6LargestNumFromArry{
	int compairInt(int num1,int num2){
		int temp1=num1;
		int temp2=num2;
		int n1=0;
		int n2=0;
		while(temp1!=0){
			n1++;
			temp1=temp1/10;
		}
		while(temp2!=0){
                        n2++;
                        temp2=temp2/10;
                }
		temp1=num1;
		temp2=num2;
		int val1=0;
		int val2=0;
		boolean flag=true;
		while(flag){
			for(int i=1;i<=n1;i++){
				val1=temp1%10;
				temp1=temp1/10;
			}
			for(int i=1;i<=n2;i++){
				val2=temp2%10;
				temp2=temp2/10;
			}
			if(val1==val2){
				if(n1>1)
					n1--;
				if(n2>1)
					n2--;
				temp1=num1;
				temp2=num2;
			}
			else{
				flag=false;
			}
		}
		return val1-val2;
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
		Q6LargestNumFromArry obj = new Q6LargestNumFromArry();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(obj.compairInt(arr[i],arr[j])>0){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Output: ");
		long value=0;
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			while(temp!=0){
				value=value*10;
				temp=temp/10;
			}			
			value=value+arr[i];
		}	
		System.out.println("Largest element is: "+value);
	}
}

