import java.util.Scanner;
class BubbleSortOpti1{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter arrray size: ");
                int size=sc.nextInt();
                System.out.println("Enter array: ");
                int []arr= new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){ //here inner for loop , don't iterate throught that further already sorted 
							   //arry , due to prevoius iteration
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("O/p:-->");
                for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+"  ");
                }
        }
}


