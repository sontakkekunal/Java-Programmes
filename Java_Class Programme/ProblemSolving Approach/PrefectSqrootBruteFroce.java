import java.io.*;
class PerfectSqroot{
	static int perfectSqroot(int num){
		int val=0;
		for(int i=1;i<num;i++){
			if(i*i<=num){  //considering for approx sqroot of decimal sqroot
				val=i;
			}
		}
		return val;
	}
	public static void main(String [] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Number for finding sqroot: ");
                int num=Integer.parseInt(br.readLine());
                System.out.println("Sqroot is: "+PerfectSqroot.perfectSqroot(num));
        }
}


