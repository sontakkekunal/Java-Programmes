import java.io.*;
class PerfectSqroot{
        static int perfectSqroot(int num){
		int start =1;
		int end=num;
		int mid=0;
		int val=0;
		while(mid*mid!=num){  //this condition will work for only perfect integer sqroot only
				      //not work for imprefect non-integer sqroot
			mid=(start+end)/2;
			if(mid*mid==num)
				val=mid;
			else if(mid*mid>num){
				end=mid-1;
			}
			else if(mid*mid<num){
				start=mid+1;
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

