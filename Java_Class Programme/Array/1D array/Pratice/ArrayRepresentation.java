import java.util.Scanner;
class ArrayDemo1_6{
	
                String give(int[] arr,int num){
		       String value="{ ";	
		       for(int i=0;i<num;i++){
			 value = value + arr[i];
		         if(i!=(num-1))
                                value = value +" , ";
			 if(i==(num-1))
				 value= value +"} ";
	         	}
		       return value;

	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			System.out.println("Enter "+(i+1)+" number of array ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Output is");
		ArrayDemo1_6 obj= new ArrayDemo1_6();
	
		System.out.println(obj.give(arr,num));
	}
}
