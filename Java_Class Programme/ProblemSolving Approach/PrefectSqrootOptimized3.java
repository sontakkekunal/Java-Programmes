import java.io.*;
class PerfectSqroot{
	static int perfectSqroot(int num){
		int start=1;
		int end=num;
		int val=0;
		while(start<=end){
			int mid=(start+end)/2;
			//System.out.println(start+"   "+end+"  "+mid);
			if(mid*mid>num){
				end=mid-1;
			}
			if(mid*mid<num){
				start=mid+1;
				val=mid;//managed for imperfect sqroot
			}
			if(mid*mid==num){
				val=mid;
				break;
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

