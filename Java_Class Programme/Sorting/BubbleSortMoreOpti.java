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
			int count=0;
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				else
					count++;
			}
			if(count==arr.length-1-i)  //if further arry is sorted , then it will not go in if block a single time,so opt it
				break;//optimsing futher iterations
		}
		System.out.println("O/p:-->");
                for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+"  ");
                }
	}
}
