import java.util.Scanner;
class Operator1{
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);
		double x=0, y=0, z=0;
		for(int i=0;i<3;i++){
			System.out.println("Enter "+(i+1)+" Number= ");
			if(i==0)
				x=obj.nextDouble();
			else if(i==1)
				y=obj.nextDouble();
			else
				z=obj.nextDouble();
		}
		double ans1=x+y*z+x-y;
		int ans2=(int)ans1;
		System.out.println("Answer in double is "+ans1+"\nAnswer in integer is "+ans2);

	}
}
