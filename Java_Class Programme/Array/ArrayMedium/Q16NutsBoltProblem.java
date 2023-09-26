/*
 16] Nuts and Bolts Problem

Given a set of N nuts of different sizes and N bolts of different sizes. There is a
one-one mapping between nuts and bolts. Match nuts and bolts efficiently.
Comparison of a nut to another nut or a bolt to another bolt is not allowed. It means
nut can only be compared with bolt and bolt can only be compared with nut to see
which one is bigger/smaller.
The elements should follow the following order ! # $ % & * @ ^ ~ .
Example 1:
Input:
N = 5
nuts[] = {@, %, $, #, ^}
bolts[] = {%, @, #, $ ^}
Output:
# $ % @ ^
# $ % @ ^
Example 2:
Input:
N = 9
nuts[] = {^, &, %, @, #, *, $, ~, !}
bolts[] = {~, #, @, %, &, *, $ ,^, !}
Output:
! # $ % & * @ ^ ~
! # $ % & * @ ^ ~
*/
import java.io.*;
class Q16NutsBoltProblem{
        public static void main(String [] args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Array size: ");
                int size=Integer.parseInt(br.readLine());
                System.out.println("Enter fisrt Array: ");
                String  arr[] = new String[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=br.readLine();
                }
		System.out.println("Enter second  Array size: ");
                int size1=Integer.parseInt(br.readLine());
                System.out.println("Enter second Array: ");
                String  arr1[] = new String[size1];
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=br.readLine();
                }
		String arr2[]= new String[]{"!","#", "$", "%", "&" ,"*", "@", "^","~"};
		String tempArr[]=arr;
		System.out.println("Output: ");
		for(int n=0;n<2;n++){
			for(int i=0;i<arr2.length;i++){
				for(int j=0;j<tempArr.length;j++){
					if(arr2[i].equals(tempArr[j]))
						System.out.print(tempArr[j]+" ");
				}
			}
			System.out.println();
			tempArr=arr1;
		}
	}
}


