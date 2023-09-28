import java.io.*;
class FindFactorOptimized2{
        static int findFactor(int num){
                int count=0;
                //for(int i=1;i<=Math.sqrt(num);i++){  <--the sqrt(int) stack frame is push N time and its complexity becomes N*log2N
		for(int i=1;i*i<=num;i++){// so instead use this
					  // factor pairs can be witin the sqroot of its value 
                        if(num%i==0){
				if(i==num/i)  //at sqroot value it gives same number pair , so it is count once
					count++;
				else
					count=count+2;
			}
                }
                return count;
        }
        public static void main(String [] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Number for counting factor: ");
                int fact=Integer.parseInt(br.readLine());
                System.out.println("Count of factor is: "+FindFactorOptimized2.findFactor(fact));
        }
}

