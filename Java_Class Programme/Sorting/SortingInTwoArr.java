import java.util.Scanner;
class TwoArrSorting{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first array size: ");
		int size1=sc.nextInt();
		System.out.println("Enter second array size: ");
		int size2=sc.nextInt();
		System.out.println("enter first array: ");
		int arr1[]= new int[size1];
	       	for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter second array: ");
		int arr2[]= new int[size2];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
		int result[]=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(k<result.length){
			if(i<arr1.length && j>=arr2.length){
				result[k]=arr1[i];
				i++;
				k++;
				continue;
			}
			else if(j<arr2.length && i>=arr1.length){
				result[k]=arr2[j];
				j++;
				k++;
				continue;
			}
			if(arr1[i]<arr2[j]){
				result[k]=arr1[i];
				i++;
			}
			else{
				result[k]=arr2[j];
				j++;
			}
			k++;
		}
		System.out.println("sorted array: ");
		for(int x=0;x<result.length;x++){
			System.out.print(result[x]+"  ");
		}
	}
}


