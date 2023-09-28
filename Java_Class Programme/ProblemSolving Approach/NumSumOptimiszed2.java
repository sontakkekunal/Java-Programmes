import java.io.*;
class NumSum{
        static int numSum(int num){
        	return (num*(num+1))/2;  //most optimisted (no loop needed) (Gauses threaom)
        }
        public static void main(String [] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Number for total sum: ");
                int num=Integer.parseInt(br.readLine());
                System.out.println("Num sum is: "+NumSum.numSum(num));
        }
}

