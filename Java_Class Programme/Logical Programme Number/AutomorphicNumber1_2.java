//write a program to check weather it is Automorphic  number or not
//5=25 , the unit place of both place is same even after sqauaring first number
//25=625, the unit place and tenth place of both place is same even after sqauaring first number
//76=5776, the unit place and tenth place and hundredth place  of both place is same even after sqauaring first number
//No. of digit and number given input is same in other from unit place
//e.g= 5=25 , 25=625  ,76=5776
//     |__|   ||__||   ||___||
import java.util.Scanner;
class AutomorphicNumber{
	public static void main(String [] nj){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number for checking it is Automorplic or not");
		int Num=obj.nextInt();
		int temp1=Num;
		int count=0;
		int sqr=Num*Num;
		int rev=0;
		int value=0;
		while(temp1!=0){
			count++;
			temp1=temp1/10;
		}
		int i=1;
		while(i<=count){
			int temp2=sqr%10;
			rev=rev*10+temp2;
			sqr=sqr/10;
			i++;
		}
		while(rev!=0){
			int temp3=rev%10;
			value=value*10+temp3;
			rev=rev/10;
		}
		if(value==Num)
			System.out.println(Num+" is a automorplic number");
		else
			System.out.println(Num+" is  not automorplic Number");
	}
}

