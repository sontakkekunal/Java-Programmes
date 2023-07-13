import java.io.*;
class IOExceptionCTE{
        public static void main(String [] args){
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter String");
		String str=null;
		try{
                        str =br.readLine();
		}
		catch(IOException obj){
			System.out.println("EXception handled");
			System.out.println(str);
		}
		System.out.println(str);
        }
}

