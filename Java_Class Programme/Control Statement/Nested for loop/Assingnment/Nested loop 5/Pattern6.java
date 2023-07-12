//WAP , to take two charcters if these characters are equal then print them as it is but if
//ther are unequal then print their difference
//{Note: Consider Positional Difference Not ASCIIs}
//Input: a p
//Output: The difference between a and p is 15
import java.io.*;
class Pattern6{
	public static void main(String [] args)throws IOException{
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter two characters ");
		char ch1=(char)br.read();
		br.skip(1);
		char ch2=(char)br.read();
		br.skip(1);
		if(ch1!=ch2){
			if(ch2-ch1>=0)
	   	        	System.out.println("The difference between "+ch1+" and "+ch2+" is "+(ch2-ch1));
			else
				System.out.println("The difference between "+ch1+" and "+ch2+" is "+(ch1-ch2));

		}
		else
			System.out.print("Both characters are same "+ch1);
	}
}

