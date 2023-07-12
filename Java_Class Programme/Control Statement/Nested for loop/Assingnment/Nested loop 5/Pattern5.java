//write a progarm to print the following pattern
//Row=4
// 0
// 1 1
// 2 3 5
// 8 13 21 34
import java.io.*;
class Pattern1{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows ");
		int row=Integer.parseInt(br.readLine());
		int num1=0;
		int num2=1;
		int result=0;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(result+" ");
				if(i==2 && j==1){
					continue;
				}
				result=num1+num2;
				num1=num2;
				num2=result;
			}
			System.out.println();
		}
	}
}


