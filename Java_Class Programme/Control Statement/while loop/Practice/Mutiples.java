//Take an integer N as input .print Multiple of M till N.
import java.util.Scanner;
class Multiples{
        public static void main(String [] args){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter a number N");
	        int N=obj.nextInt();
		System.out.println("Enter a number M");
                int M=obj.nextInt();
		int i=M;
		//(i!=(N+1))
		//(i<(N+1))
		while(i<=N){
			if(i%M==0){
                        System.out.println(i+" is a mutiple of "+M+" till "+N);
			}
			i++;
		}
	}
}



