import java.io.*;
class LoopIterationCount{
        static int loopiteration(int num1,int num2){
                if(num1>num2)
			return num1-num2+1;  //formula (b-a+1)
		else
			return num2-num1+1;
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

