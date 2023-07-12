//Q2
//Write a program to take range as input from the user and print composite numbers.
//Input: Enter start: 1
//Enter end: 20
//Output: composite numbers between 1 and 20
//4 6 8 9 10 12 14 15 16 18 20
import java.io.*;
class CompositeInRangeQ2{
	boolean Composite(int num){
		int count=0;
		for(int i=1;i<num;i++){
			if(num%i==0)
				count++;
			if(count>2)
				break;
		}
		if(count>2)
			return true;
		else
			return false;
	}
	public static void main(String[] args )throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start : ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter end : ");
		int end=Integer.parseInt(br.readLine());
		CompositeInRangeQ2 obj=new CompositeInRangeQ2();
		System.out.print("Composite number between "+start+" and "+end +" is ");
		for(int i=start;i<=end;i++){
			boolean value=obj.Composite(i);
			if(value)
				System.out.print(i+" ");
		}
	}
}

