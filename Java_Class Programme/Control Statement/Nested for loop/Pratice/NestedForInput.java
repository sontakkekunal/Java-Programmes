//write a programme to take input no. of rows and columes in matrics and print it.
import java.util.Scanner;
class NestedForInput{
	public static void main(String [] matrics){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number of rows in matrics");
		int row=obj.nextInt();
		System.out.println("Enter number of colume in matrics");
                int colume=obj.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=colume;j++){
				System.out.print(5+" ");
			}
			System.out.println();
		}
	}
}

