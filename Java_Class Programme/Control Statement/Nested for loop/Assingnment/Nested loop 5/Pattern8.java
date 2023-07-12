//write a progarm to print the following pattern
//row=8
//$
//@ @
//& & &
//# # # #
//$ $ $ $ $
//@ @ @ @ @ @
//& & & & & & & 
//# # # # # # # # 
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
			for(int j=1;j<=i;j++){
				if(i==1 || i==5)
					System.out.print("$ ");
				else if(i==2 || i==6)
					System.out.print("@ ");
				else if(i==3 || i==7)
					System.out.print("& ");
				else if(i==4 || i==8)
					System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
}

