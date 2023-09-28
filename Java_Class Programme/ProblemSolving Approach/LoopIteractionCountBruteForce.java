import java.io.*;
class LoopIterationCount{
        static int loopiteration(int num1,int num2){
                int count=0;
                for(int i=num1;i<=num2;i++){
                        count++;
                }
                return count;
        }
        public static void main(String [] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Number for staring loop: ");
                int num=Integer.parseInt(br.readLine());
		System.out.println("Enter Number for end of loop: ");
		int num1=Integer.parseInt(br.readLine());
                System.out.println("Loop iteration are "+LoopIterationCount.loopiteration(num,num1));
        }
}

