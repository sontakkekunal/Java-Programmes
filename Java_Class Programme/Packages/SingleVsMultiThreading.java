import java.util.concurrent.*;
import java.io.*;
import myLogicalNum.*;

class MyThread extends Thread{
	int num=0;
	MyThread(int num){
		this.num=num;
	}
	static boolean prime(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				count++;
			if(count>2)
				break;
		}
		if(count==2)
			return true;
		else
			return false;
	}

	static boolean AutomorphicNum(int num){
		int sqr=num*num;
		int temp=num;
		int n=0;
		while(temp!=0){
			n++;
			temp=temp/10;
		}
		temp=sqr;
		sqr=0;
		for(int i=0;i<n;i++){
			sqr=sqr*10+(temp%10);
			temp=temp/10;
		}
		int sqr2=0;
		while(sqr!=0){
			sqr2=sqr2*10+(sqr%10);
			sqr=sqr/10;
		}
		if(sqr2==num)
			return true;
		else
			return false;
	}
	public void run(){
		switch (num){
			case 1:
				for(int i=1;i<=100;i++){
					if(Q2_CompositeInRangeQ2.Composite(i))
						System.out.println("Composite number form 1 to 100 are "+i);
				}
				break;
			case 2:
				for(int i=1;i<=500;i++){
					if(Q5_PerfectNumInRangeQ5.Perfect(i))
						System.out.println("Perfect number from 1 to 500 are "+i);
				}
				break;
			case 3:
				for(int i=0;i<=1000;i=i+50){
					System.out.println("Count of digit "+i+"is "+Q6_DigitCount.DigitCount(i));
				}
				break;
			case 4:
				for(int i=1;i<=1000;i++){
					if(Q8_PalindromeInRange.Palindrome(i))
						System.out.println("Palindrome from 1 to 1000 are "+i);
				}
				break;
			case 5:
				for(int i=1;i<=1000;i++){
					if(Q9_StrongInRange.Strong(i))
						System.out.println("Strong number form 1 to 1000 are "+i);
				}
				break;
			case 6:
				for(int i=1;i<=2000;i++){
					if(Q10_ArmStrongNumInRange.ArmStrong(i))
						System.out.println("ArmStrong number form 1 to 2000 are "+i);
				}
				break;
			case 7:
				for(int i=1;i<=500;i++){
					if(prime(i))
						System.out.println("Prime number from 1 to 500 is "+i);
				}
				break;
			case 8:
				for(int i=1;i<=5000;i++){
					if(AutomorphicNum(i))
						System.out.println("Automorphic number form 1 to 5000 is "+i);
				}
				break;
			default:

				break;
		}

	}
}
class Client{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Choose 1.MultiThread 2.SingleThread");
		System.out.println("choose 1/2");
		int num=Integer.parseInt(br.readLine());
		long dur1=System.nanoTime();
		ExecutorService ser=null;
		if(num==1){
			ser=Executors.newCachedThreadPool();
		}
		else if(num==2){
			ser=Executors.newSingleThreadExecutor();
		}
		else{
			System.out.println("Please enter valid choose");
			main(null);
		}
		long dur2=System.nanoTime();
		for(int i=1;i<=8;i++){
			MyThread obj= new MyThread(i);
			ser.execute(obj);
		}
		ser.shutdown();
		ThreadGroup gp=Thread.currentThread().getThreadGroup();
		while(gp.activeCount()>1){
		}
		long dur3=0;
		if(gp.activeCount()==1)
			dur3=System.nanoTime();
		System.out.println("Thread creation requires "+((dur2-dur1)/1000000)+" ms");
		System.out.println("Task exceuting with thread requires  "+((dur3-dur2)/1000000)+" ms");
		System.out.println("Thread creation + Task exceuting with thread requires  "+((dur3-dur1)/1000000)+" ms");
	}
}

