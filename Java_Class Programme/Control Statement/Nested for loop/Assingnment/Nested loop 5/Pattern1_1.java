//write a progarm to print the following pattern
// D4 C3 B2 A1
// A1 B2 C3 D4
// D4 C3 B2 A1
// A1 B2 C3 D4
//Use this loop strictly for the outer loop
//int row;
//Take the number of rows from user
//for(int i=1;i<=row;i++){
//}
import java.io.*;
class Pattern1{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int n1=1; int n2=4;
			char ch1='A'; char ch2='D';
			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print(ch2+""+n2+" ");
					ch2--;
					n2--;
				}
				else{
					System.out.print(ch1+""+n1+" ");
					ch1++;
					n1++;
				}
			}
			System.out.println();
		}
	}
}

		
