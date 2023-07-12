import java.util.Scanner;
class ArrayDemo1_6{
	/*
                void give(int[] arr){
		for(int i=0;i<5;i++){
			if(i==0)
				System.out.print("{ ");
			System.out.print(arr[i]+" , ");
			if(i==5)
				System.out.print("}");

		}

	}*/
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter "+(i+1)+" number of array ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Output is");
		ArrayDemo1_6 obj= new ArrayDemo1_6();
		for(int i=0;i<5;i++){
			if(i==0)
                                System.out.print("{ ");
			System.out.print(arr[i]);
			if(i!=4)
                                System.out.print(" , ");
                        if(i==4)
                                System.out.print("}");
		}
	
//		obj.give(arr);
	}
}

		
