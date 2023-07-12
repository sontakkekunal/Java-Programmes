//Print number of digit in number using for or while loop.
import java.util.Scanner;
class PrintDigit{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter a number for counting digits ");
	        int N=obj.nextInt();
		int temp=N;
		int count=0;
		//( ;temp!=0;temp=temp/10)
		//( ;temp>=1;temp=temp/10)
		for( ;temp>0;temp=temp/10){
			count++;
		}
		System.out.println(N+" has "+count+" digit");
	}
}

