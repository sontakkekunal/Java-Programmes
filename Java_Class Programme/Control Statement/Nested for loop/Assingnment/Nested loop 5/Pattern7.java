//write a progarm to print the following pattern
//row=5;
//  O
//  14 13
//  L   K  J
//  9   8  7 6
//  E   D  C B A
//
//  row=4;
//   10 
//   I H
//   7 6 5
//   D C B A
//   //Use this loop strictly for the outer loop
//int row;
//Take the number of rows from user
//for(int i=1;i<=row;i++){
import java.io.*;
class Pattern7{
	static int Count(int num){
		int count=0;
		while(num!=0){
			count=count+num;
			num--;
		}
		return count;
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows ");
		int row=Integer.parseInt(br.readLine());
		int count=Count(row);
		int count2;
		count2=count+65-1;
		char ch=(char)count2;
		if(row%2==1){
         		for(int i=1;i<=row;i++){
		            	for(int j=1;j<=i;j++){
					if(i%2==1){
						System.out.print(ch+" ");
						ch--;
						count--;
					}
					else{
						System.out.print(count+" ");
						ch--;
						count--;
					}
				}
				System.out.println();
			}
		}
		else{
			for(int i=1;i<=row;i++){
                                for(int j=1;j<=i;j++){
                                        if(i%2==1){
                                                System.out.print(count+" ");
                                                ch--;
                                                count--;
                                        }
                                        else{
                                                System.out.print(ch+" ");
                                                ch--;
                                                count--;
                                        }
                                }
                                System.out.println();
                        }
		}
	}
}
				
