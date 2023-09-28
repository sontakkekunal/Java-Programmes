import java.io.*;
class NumSum{
	static int numSum(int num){
		int sum=0;
		for(int i=1;i<=num;i++){
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String [] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Number for total sum: ");
                int num=Integer.parseInt(br.readLine());
                System.out.println("Num sum is: "+NumSum.numSum(num));
        }
}

