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
		for(int i=Num;i!=0;i=i/10){
			int fact=1;
			int temp2=i%10;
			for(int j=temp2;j>=1;j--){
				fact=fact*j;
			}
			sum=sum+fact;
		}
		if(sum==Num)
			System.out.println(sum+" is a strong number");
		else
			System.out.println(Num+" is not a strong number");
	}
}




