//Armstrong no. for all digit number using while loop
import java.util.Scanner;
class ArmstrongNumber{
        public static void main(String [] atgs){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter  number  for checking it is armstrong or not ");
                int N=input.nextInt();
		int temp=N;
		int temp1=N;
		int count=0;
		int sum=0;
		//First counting the no. of digit given by usesr.
		//(temp>0)
		//(temp>=1)
		while(temp!=0){
			count++;
			temp=temp/10;
		}
		//(temp1>0)
		//(temp1>=1)
		while(temp1!=0){
			int value=temp1%10;
			//(int i=1;i<=count;i++)
			int product=1;
			//(int i=1;i<=count;i++)
			for(int i=0;i<count;i++){
				product=product*value;
			}
			sum=sum+product;
			temp1=temp1/10;
		}
		if(sum==N)
			System.out.println(N+" is a armstrong Number");
		else
			System.out.println(N+" is not armstrong Number");
	}
}



