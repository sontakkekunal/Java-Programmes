/*
 4] Product of array elements

This is a functional problem. Your task is to return the product of array elements
under a given modulo.
The modulo operation finds the remainder after the division of one number by
another. For example, K(mod(m))=K%m= remainder obtained when K is divided
by m
Example 1:
Input:
1
4
1 2 3 4
Output:
24
*/
import java.io.*;
class Q3LargerNum{
	static int task(int[] arr,int m){
	        int value=1;
        	for(int i=0;i<arr.length;i++){
                value=value*arr[i];
        	}
       		if(value%m==0)
			return value;
		else
			return value%m;
	}

        public static void main(String [] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter module for dividing: ");
		int m=Integer.parseInt(br.readLine());
                System.out.println("Enter array size: ");
                int size=Integer.parseInt(br.readLine());
                int arr[]= new int[size];
                System.out.println("Enter array number: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		System.out.println("The task value is "+Q3LargerNum.task(arr,m));
	}
}
