import java.io.*;
//it is assumde that for 1 iteration it need 1/10^8 sec for 1Ghz CPU.
class FindFactorOptimized1{
        static int findFactor(int num){
                int count=1;  //1 for counting self dividing factor 
                for(int i=1;i<=num/2;i++){ //beyond half only one slef factor is found which's count is managed upper
					   //so loop is optimisted at half
                        if(num%i==0)
                                count++;
                }
                return count;
        }
        public static void main(String [] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Number for counting factor: ");
                int fact=Integer.parseInt(br.readLine());
                System.out.println("Count of factor is: "+FindFactorOptimized1.findFactor(fact));
        }
}

