//write a program to check weather it is Strong  number or not
//Strong Number is a number whose sum of all digits factorial is equal to the number N.
//e.g:-
//    N=145
//   strong= 1! + 4!+5!
//   strong=1+ 4*3*2*1 + 5*4*3*2*1;
//   strong= 1+ 24 + 120
//   strong = 145
//   if(strong==N) , then it is strong number
import java.util.Scanner;
class AutomorphicNumber{
	public static void main(String [] nj){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number for checking it is Strong or not");
		int Num=obj.nextInt();
		int temp1=Num;
		int sum=0;
		while(temp1!=0){
			int fact=1;
			int temp2=temp1%10;
//			for(  ;temp2>=1;temp2--){
//				fact=fact*temp2;
			for(int i=temp2;i>0;i--){
				fact=fact*i;
			}
			sum=sum+fact;
			temp1=temp1/10;
                }
		if(sum==Num)
			System.out.println(sum+" is a strong number");
		else
			System.out.println(Num+" is not a strong number");
		}
}




