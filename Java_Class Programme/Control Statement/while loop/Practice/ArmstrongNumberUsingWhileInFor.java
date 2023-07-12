//Armstrong no. for all digit number using for while inside for.
import java.util.Scanner;
class ArmstrongNumberUsingWhileInFor{
        public static void main(String [] atgs){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter  number  for checking it is armstrong or not ");
                int N=input.nextInt();
		int temp1=N;
		int temp2=N;
		int count=0,sum=0;
		//(temp>0)
		//(temp>=1)
		while(temp1!=0){
			count++;
			temp1=temp1/10;
		}
		//(  ;temp!=0;temp=temp/10)
		//(  ;temp>=1;temp=temp/10)
		for(   ;temp2>0;temp2=temp2/10){
			int value=temp2%10;
			int product=1;
			int i=0;
			//int i=1;
			//(i<=count)
			while(i<count){
				product=product*value;
				i++;
			}
			sum=sum+product;
		}
		if(sum==N)
			System.out.println(N+" is a armstrong Number");
		else
			System.out.println(N+" is not armstrong Number");
	}
}





