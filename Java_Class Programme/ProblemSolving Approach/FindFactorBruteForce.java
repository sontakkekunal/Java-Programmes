import java.io.*;
class FindFactorBruteForce{
	static int findFactor(int num){
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0)
				count++;
		}
		return count;
	}
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number for counting factor: ");
		int fact=Integer.parseInt(br.readLine());
		System.out.println("Count of factor is: "+FindFactorBruteForce.findFactor(fact));
	}
}
