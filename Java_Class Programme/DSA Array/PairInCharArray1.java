/*
 Given an character array(lowercase)
 return the count of pair(i,j)
 such that
 a]i<j
 b]arr[i]='a'
   arr[i]='g';

 Arr:{a,b,e,g,a,g}
Output:3
 */
import java.io.*;
class PairInCharArray{
        public static void main(String [] args)throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter array size: ");
                int N=Integer.parseInt(br.readLine());
                System.out.println("Enter array: ");
                char arr[] = new char[N];
                for(int i=0;i<N;i++){
                        arr[i]=(char)br.read();
                        br.skip(1);
                }
                System.out.println("Enter first character: ");
                char a=(char)br.read();
                br.skip(1);

                System.out.println("Enter second character: ");
                char b=(char)br.read();
                br.skip(1);

                int count=0;
                int n=0;
		for(int i=0;i<N;i++){
			if(arr[i]==a)
				n++;
			else if(arr[i]==b)
				count=count+n;
		}
		System.out.println("Output: "+count);
	}
}
