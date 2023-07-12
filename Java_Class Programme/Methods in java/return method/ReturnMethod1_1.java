import java.io.*;

class ReturnMethod1_1{
	int gun(int x){
		return x+10;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		ReturnMethod1_1 obj=new ReturnMethod1_1();
		System.out.println("Enter for adding with 10 ");
		System.out.println(obj.gun(Integer.parseInt(br.readLine())));


	}
}


